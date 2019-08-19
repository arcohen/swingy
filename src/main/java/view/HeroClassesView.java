package view;

import utilities.*;
import model.*;

import java.util.List;


public class HeroClassesView {

    public HeroClassesView() {

    };

    public void viewHeroClasses(List<HeroClass> heroClasses) {
        OutputDelay delay = new OutputDelay();

        System.out.println("------------------------------");
        System.out.println("    Hero classes available");
        System.out.println("------------------------------");
        delay.delayOutput(200);      


        for (int i = 0; i < heroClasses.size(); i++) {
            System.out.println("\n");
            System.out.println("Number: (" + i + ")");
            System.out.println(heroClasses.get(i).getName());
            System.out.println(heroClasses.get(i).getDescription());
            System.out.println("----------");
            delay.delayOutput(200);      
        }

        System.out.println("Please select by typing corresponding number");
    }
}