package controller;

import model.*;
import view.*;
import utilities.*;

public class createHero {

    public createHero() {

        ParseInput parseInput = new utilities.ParseInput();
        
        VillainClasses villainClasses = new VillainClasses();
        HeroClasses heroClasses = new HeroClasses();

        new HeroClassesView(heroClasses);

        model.HeroClass heroClass = heroClasses.getHeroClasses().get(parseInput.intRange(1, heroClasses.getHeroClasses().size()) - 1);
        String name = parseInput.string();

        Hero hero = new Hero(heroClass, villainClasses, name);
        new SavedHeroes().saveHero(hero);

        new StartLevel(hero);
    }
}