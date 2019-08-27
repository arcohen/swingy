package view;

import model.*;

import java.util.List;


public class HeroClassesView {

    public HeroClassesView(HeroClasses heroClasses) {

        List<HeroClass> heroClassList = heroClasses.getHeroClasses();
    
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("    Hero classes available    ");
        System.out.println("------------------------------\n");
    
        for (int i = 0; i < heroClassList.size(); i++) {
            System.out.println("(" + (i + 1) + ")");
            System.out.println(heroClassList.get(i).getName());
            System.out.println(heroClassList.get(i).getDescription());
            System.out.println("");
            System.out.println("----------");
        }
    
        System.out.println("");
        System.out.println("Please select a type");
    }
}