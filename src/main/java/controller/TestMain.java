package controller;

import model.*;

public class TestMain {
    public static void main(String[] args) {
          
        VillainClasses villainClasses = new VillainClasses();
        HeroClasses heroClasses = new HeroClasses();
        HeroClass heroClass = heroClasses.getHeroClasses().get(1);
        SavedHeroes savedHeroes = new SavedHeroes();

        Hero hero = new Hero(heroClass, villainClasses, "Ariel", savedHeroes);

        new Level().start(hero);

    }
}