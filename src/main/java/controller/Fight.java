package controller;

import java.util.concurrent.ThreadLocalRandom;

import model.*;
import view.*;

public class Fight {
    NewSquare newSquare;
    Hero hero;
    UserOutput o = new UserOutput();
    NewArtifact newArtifact;

    public Fight(Hero hero, NewSquare newSquare) {
        this.hero = hero;
        this.newSquare = newSquare;
        this.newArtifact = new NewArtifact();
    }

    public void fightVillain(Villain villain) {
        int heroHP = hero.getHitPoints();

        int villainHP = villain.getHitPoints();
        int heroAttack = hero.getAttack();
        int villainAttack = villain.getAttack();
        int heroDefense = hero.getDefense();
        int villainDefense = villain.getDefense();
        
        while (heroHP > 0 && villainHP > 0) {
            heroHP = attack(villainAttack, heroDefense, heroHP);
            villainHP = attack(heroAttack, villainDefense, villainHP);
        }

        
        if (heroHP < 1) {
            /* LOSE BATTLE */
            
            o.output(" -------");
            o.output("GAME OVER");
            o.output(" -------");
            o.output("\nYou have been defeated :[ :[\nThe level will now restart");
            o.dots(5);
            new Level().start(hero.getMapInitialHero());
        }
        else {
            /* WIN BATTLE */

            o.output("\nYou are victorious!!\n\nYou have taken " + (hero.getHitPoints() - heroHP) + " damage");
            hero.getMap().getCurrentBlock().removeVillain();
            hero.setHitPoints(heroHP);

            newArtifact.generateNewArtifact(hero);

            hero.setXp(hero.getXp() + villainAttack * 20);

            if (hero.getMap().getCurrentBlock().isSidePiece())
                new Level().completed(hero);
            
            new HeroStatsView(hero);
            newSquare.move();

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