package model;

/*
 * main to test initial model. 
 */

public class Main {
    
    public static void main(String args) {

        HeroClasses heroClasses = new HeroClasses();
        VillainClasses villainClasses = new VillainClasses();
        
        Hero hero = new Hero(heroClasses.getHeroClasses().get(0), villainClasses.getVillainClasses(), "Ariel");

    } 
}

 