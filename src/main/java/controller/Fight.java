package controller;

import java.util.concurrent.ThreadLocalRandom;

import model.*;
import utilities.OutputDelay;
import view.*;

public class Fight {
    NewSquare newSquare;
    Hero hero;
    UserOutput o = new UserOutput();
    OutputDelay delay;
    NewArtifact newArtifact;
    Move move;

    public Fight(Hero hero, NewSquare newSquare) {
        this.hero = hero;
        this.delay = new OutputDelay();
        this.newSquare = newSquare;
        this.newArtifact = new NewArtifact();
        this.move
    }

    public void fightVillain(Villain villain) {
        int heroHP = hero.getHitPoints();

        int villainHP = villain.getHitPoints();
        int heroAttack = hero.getHitPoints();
        int villainAttack = villain.getHitPoints();
        int heroDefense = hero.getHitPoints();
        int villainDefense = villain.getHitPoints();
        
        while (heroHP > 0 && villainHP > 0) {
            heroHP = attack(villainAttack, heroDefense, heroHP);
            villainHP = attack(heroAttack, villainDefense, villainHP);
        }

        
        if (heroHP < 1) {
            o.output(" -------");
            o.output("GAME OVER");
            o.output(" -------");
            o.output("\nYou have been defeated :[ :[\nThe level will now restart");
            o.dots();
            new StartLevel(hero.getId());
        }
        else {
            o.output("\nYou are victorious!!\n\nYou have taken " + (hero.getHitPoints() - heroHP) + " damage");
            hero.getMap().getCurrentBlock().removeVillain();
            hero.setHitPoints(heroHP);

            newArtifact.generateNewArtifact(hero);

            hero.setXp(hero.getXp() + villainAttack * 20);

            if (hero.getMap().getCurrentBlock().isSidePiece())
                new LevelCompleted(hero);
            
            new HeroStatsView(hero);
            new Move(hero);

    }
        
    }
    
    private int attack(int attack, int defense, int hp) {

        if ((ThreadLocalRandom.current().nextInt(0, 100) > 67)) {
            return hp -= attack;
        }
        else {
            if (defense - attack > 0)
                return hp - defense - attack;
            else
                return hp;
        }
    }
}