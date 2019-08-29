package controller;

import model.*;
import view.UserOutput;

public class LevelCompleted {
    public LevelCompleted(Hero hero) {
        UserOutput o = new UserOutput();

        int level = hero.getLevel();
        int levelLimit = level * 1000 + (level - 1) * (level - 1)  * 450;
        if (hero.getXp() > levelLimit)
            hero.setLevel(level++);

        o.output("Congratulations map completed!\nYou are now on level " + hero.getLevel());
        
        new SavedHeroes().saveHero(hero);
        o.output("         ----------");
        o.output("Your progress has been saved!");
        o.output("         ----------");

        new StartLevel(hero.getId());
    }
}