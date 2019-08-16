package model;

/*
 * main to test initial model. 
 */

public class Main {
    
    public static void main(String[] args) {

        HeroClasses heroClasses = new HeroClasses();
        VillainClasses villainClasses = new VillainClasses();
        
        Hero hero = new Hero(heroClasses.getHeroClasses().get(0), villainClasses, "Ariel");
        
        hero.setXp(100);

        System.out.println("Name: " + hero.getName());
        System.out.println("Hero type: " + hero.getHeroClass().getName());
        System.out.println("Hero description: " + hero.getHeroClass().getDescription());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("Xp: " + hero.getXp());
        System.out.println("X coordinate: " + hero.getCoordinates().getX());
        System.out.println("Y coordinate: " + hero.getCoordinates().getY());
        System.out.println("Map size: " + hero.getMap().getSize());
    } 
}

 