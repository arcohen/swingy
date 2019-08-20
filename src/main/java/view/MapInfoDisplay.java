
package view;

import model.*;

public class MapInfoDisplay {

    public void start(Hero hero) {

        System.out.println("");
        System.out.println("Welcome " + hero.getName() + " to level " + hero.getLevel());
        System.out.println("");
        System.out.println("Your stats are as follows");
        System.out.println("");
        System.out.println("HP: " + hero.getHitPoints());
        System.out.println("XP: " + hero.getXp());
        System.out.println("Attack: " + hero.getAttack());
        System.out.println("Defence: " + hero.getDefense());

        System.out.println("The map has a height and width of " + hero.getMap().getSize() + " discrete movement units");

        System.out.println("You are currently at the center of the map");
        
    }
}