package controller;

import model.*;
import view.*;
import utilities.*;

public class createHero {

    public createHero(SavedHeroes savedHeroes) {

        ParseInput parseInput = new utilities.ParseInput();
        UserOutput o = new UserOutput();
        
        VillainClasses villainClasses = new VillainClasses();
        HeroClasses heroClasses = new HeroClasses();

        o.output("\n Please select a character class\n");
        new HeroClassesView(heroClasses);
        HeroClass heroClass = heroClasses.getHeroClasses().get(parseInput.intRange(1, heroClasses.getHeroClasses().size()) - 1);

        o.output("Please type a name for your hero:");
        String name = parseInput.string();

        Hero hero = new Hero(heroClass, villainClasses, name, savedHeroes);
        savedHeroes.saveHero(hero);
        savedHeroes.saveToDB();

        new Level().start(hero);
    }
}