package controller;

import model.*;
import utilities.ParseInput;
import view.*;

public class NewSquare {
    Fight fight;
    Hero hero;
    UserOutput o;

    public NewSquare(Hero hero) {
        this.fight = new Fight(hero, this);
        this.hero = hero;
        this.o = new UserOutput();
    }

    public void moved() {
        Block currentBlock = hero.getMap().getCurrentBlock();

        
        if (currentBlock.containsVillain()){
            
            if (currentBlock.isSidePiece())
                new UserOutput("You have landed on a side piece defeat villain to complete level");

            new DisplayVillain(currentBlock.getVillain());
            int input = new ParseInput().intRange(1, 2);
            if (input == 1)
                fight.fightVillain(currentBlock.getVillain());
        }
        else {
            if (currentBlock.isSidePiece()) {
                new UserOutput("You have landed on a side piece!");
                new LevelCompleted(hero);
            }
        }
    }

    public void move()
}