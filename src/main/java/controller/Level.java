package controller;

import model.*;
import view.UserOutput;

public class Level {

    public void start(Hero hero) {
        hero.setMapInitalHero(hero);
        new NewSquare(hero);
    }

    public void completed(Hero hero) {
        UserOutput o = new UserOutput();

        int level = hero.getLevel();
        int levelLimit = level * 1000 + (level - 1) * (level - 1)  * 450;
        if (hero.getXp() > levelLimit){
            hero.setLevel(level++);

            hero.setAttack(hero.getAttack() + 10);
            hero.setDefense(hero.getDefense() + 10);
            hero.setFullHP(hero.getFullHP() + 10);
            hero.setHitPoints(hero.getFullHP());
        }

        o.output("\nCongratulations map completed!\nYou are now on level " + hero.getLevel());

        o.output("\nYour stats have been increased by 10 points\n");
        
        new SavedHeroes().saveToDB();
        o.output("         ----------");
        o.output("Your progress has been saved!");
        o.output("         ----------");

        start(hero);
    }
}