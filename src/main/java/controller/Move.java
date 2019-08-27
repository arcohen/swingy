package controller;

import model.Hero;
import view.UserOutput;

public class Move {
    public Move(Hero hero) {
        if (hero.getMap().getCurrentBlock())
            new UserOutput("");
            
    }
}