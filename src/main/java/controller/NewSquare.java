package controller;

import model.*;
import utilities.ParseInput;
import view.*;

public class NewSquare {
    Fight fight;
    Hero hero;
    UserOutput o;
    ViewLocation viewLocation;
    ParseInput parseInput;
    DisplayVillain displayVillain;

    public NewSquare(Hero hero) {
        this.fight = new Fight(hero, this);
        this.hero = hero;
        this.o = new UserOutput();
        this.viewLocation = new ViewLocation(hero);
        this.parseInput = new ParseInput();
        this.displayVillain = new DisplayVillain();
    }

    public void moved() {
        Block currentBlock = hero.getMap().getCurrentBlock();

        if (currentBlock.containsVillain()){
            
            if (currentBlock.isSidePiece())
                new UserOutput("You have landed on a side piece defeat villain to complete level");

            displayVillain.display(currentBlock.getVillain());
            int input = new ParseInput().intRange(1, 2);
            if (input == 1)
                fight.fightVillain(currentBlock.getVillain());
        }
        else {
            if (currentBlock.isSidePiece()) {
                new UserOutput("You have landed on a side piece!");
                new Level().completed(hero);
            }
        }
    }

    public void move() {

        viewLocation.view();
        o.output("Please select a direction to move");
        o.output("(1) North");
        o.output("(2) South");
        o.output("(3) West");
        o.output("(4) East");
        
        int direction = parseInput.intRange(1, 4);
        hero.getMap().changePosition(direction);

        moved();
    }
}