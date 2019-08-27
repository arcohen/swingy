package view;

import model.Villain;

public class DisplayVillain {
    public DisplayVillain(Villain villain) {
        UserOutput o = new UserOutput();
        
        o.output("You have encountered a villain\nIt's stats are as follows.\n");
        o.output("Attack: " + villain.getAttack());
        o.output("Defense: " + villain.getDefense());
        o.output("HP: " + villain.getHitPoints() + "\n");

        o.output("Would you like to (1) fight or (2) attempt to flee?");
    }
}