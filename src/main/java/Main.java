
import model.*;
import controller.*;
import view.*;
import utilities.*;

import java.util.List;
import java.util.Scanner;



public class Main {


    
    public static void main(String[] args) {

        model.HeroClasses heroClasses = new model.HeroClasses();
        model.VillainClasses villainClasses = new model.VillainClasses();

        view.HeroClassesView HeroClassesView = new view.HeroClassesView();
        view.MapInfoDisplay mapInfoDisplay = new MapInfoDisplay(); 

        controller.HeroClasses heroClassesController = new controller.HeroClasses();

        List<HeroClass> heroClassList = heroClassesController.getHeroClassList(heroClasses);

        // List<model.HeroClass> heroClasses = new controller.getHeroClasses();
        
        Scanner input = new Scanner(System.in);
        OutputDelay delay = new OutputDelay();

        delay.delayOutput(300);
        System.out.println("\n");
        System.out.println("       Welcome to SwingyRPG");
        delay.delayOutput(600);
        System.out.println("\n");
        System.out.println("            ----------");
        System.out.println("            ----------");
        System.out.println("\n");
        delay.delayOutput(300);
        System.out.println("Would you like to play through the (1) console or (2) using the GUI?");
        System.out.println("Please type 1 or 2");

        int playType;

        while ((playType = input.nextInt()) != 1 && playType != 2) {
            System.out.println("Please type on 1 or 2");
        }

        if (playType == 1) {

            System.out.println("Welcome to the game please see the list of available heroes to play with and select one by typing the appropriate number.");
            delay.delayOutput(100);        
            HeroClassesView.viewHeroClasses(heroClassList);

            model.HeroClass heroClass = heroClassList.get(input.nextInt());

            System.out.println("Please type the name of your character.");
            String name = input.nextLine();

            model.Hero hero = new model.Hero(heroClass, villainClasses, name);

            mapInfoDisplay.start(hero);

        }
    } 
}
