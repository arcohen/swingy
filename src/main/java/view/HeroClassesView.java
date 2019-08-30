package view;

import model.*;

import java.util.List;


public class HeroClassesView {

    public HeroClassesView(HeroClasses heroClasses) {

        List<HeroClass> heroClassList = heroClasses.getHeroClasses();
        UserOutput o = new UserOutput();
    
        o.output("");
        o.output("------------------------------");
        o.output("    Hero classes available    ");
        o.output("------------------------------\n");
    
        for (int i = 0; i < heroClassList.size(); i++) {
            o.output("(" + (i + 1) + ")");
            o.output(heroClassList.get(i).getName());
            o.output(heroClassList.get(i).getDescription());
            o.output("Attack: " + heroClassList.get(i).getAttack());
            o.output("Defense: " + heroClassList.get(i).getDefense());
            o.output("HP: " + heroClassList.get(i).gethitPoints());
            o.output("");
            o.output("----------");
        }
    
        o.output("\nPlease select a type");
    }
}