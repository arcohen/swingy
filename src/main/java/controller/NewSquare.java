package controller;

import model.*;
import utilities.ParseInput;
import view.*;

public class NewSquare {
    Fight fight;
    Hero hero;

    public NewSquare(Hero hero) {
        this.fight = new Fight(hero, this);
        this.hero = hero;
    }

    public void moved() {
        Block currentBlock = hero.getMap().getCurrentBlock();

        if (currentBlock.isSidePiece())

        if (currentBlock.containsVillain()){
            new DisplayVillain(currentBlock.getVillain());
            int input = new ParseInput().intRange(1, 2);
            if (input == 1)
                fight.fightVillain(currentBlock.getVillain());
        }
        else {

        }
    }
}