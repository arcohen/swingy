package model;

/*
 * main to test initial model. 
 */

public class Main {
    
    public static void main(String args) {

        HeroClasses heroClasses = new HeroClasses();
        VillainClasses villainClasses = new VillainClasses();
        
        Hero hero = new Hero(heroClasses.getHeroClasses().get(0), villainClasses, "Ariel");
        
        hero.setXp(100);

        System.out.println(hero.getName());
        System.out.println(hero.getLevel());
        System.out.println(hero.getXp());
        System.out.println(hero.);
        System.out.println(hero.xxxxx);
        System.out.println(hero.xxxxx);
    } 
}

 