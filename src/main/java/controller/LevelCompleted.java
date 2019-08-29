package controller;

import model.*;
import view.UserOutput;

public class LevelCompleted {

    public void startLevel(int id) {
        Hero hero = new SavedHeroes().getHeroes().get(id);
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

        o.output("Congratulations map completed!\nYou are now on level " + hero.getLevel());

        o.output("Your stats have been increased by 10 points\n");
        
        new SavedHeroes().saveHero(hero);
        o.output("         ----------");
        o.output("Your progress has been saved!");
        o.output("         ----------");

        startLevel(hero.getId());
    }
}