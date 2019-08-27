
import model.*;
import controller.*;
import view.*;
import utilities.*;

import java.util.List;
import java.util.Scanner;



// public class Main {


    
//     public static void main(String[] args) throws Exception {

//         model.HeroClasses heroClasses = new model.HeroClasses();
//         model.VillainClasses villainClasses = new model.VillainClasses();

//         //view.HeroClassesView HeroClassesView = new HeroClassesView();
//         view.MapInfoDisplay mapInfoDisplay = new MapInfoDisplay(); 
        
//         ParseInput parseInput = new ParseInput();
//         OutputDelay delay = new OutputDelay();
        
//         if (args.length == 0) {
//             System.out.println("Please provide an argument for console or gui play");
//             throw new Exception();
//         }
        
//         System.out.println(args[0]);
        
//         Scanner input = new Scanner(System.in);
        
//         if (args[0] == "console") {
            
            
//             System.out.println("\n");
//             System.out.println("-------------------------------");
//             System.out.println("--    Welcome to SwingyRPG   --");
//             System.out.println("-------------------------------");
            
//             delay.delayOutput(100);        
//             //HeroClassesView.viewHeroClasses(heroClasses);

//             model.HeroClass heroClass = heroClasses.getHeroClasses().get(parseInput.intRange(input, 1, heroClasses.getHeroClasses().size()) - 1);

//             System.out.println("Please type the name of your character.");
//             String name = input.nextLine();

//             model.Hero hero = new model.Hero(heroClass, villainClasses, name);

//             mapInfoDisplay.start(hero);

//         }
//         else {
//             System.out.println("FUCKEIOUYEOIFOW");
//         }
//         input.close();
//     } 
// }
