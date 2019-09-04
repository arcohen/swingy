package view;

import java.util.List;

import model.*;

public class ViewLocation {

    Hero hero;

    public ViewLocation(Hero hero) {
        this.hero = hero;
    }

    public void view () {
        List<Block> blocks = hero.getMap().getBlocks();
        int currentLocationIndex = blocks.indexOf(hero.getMap().getCurrentBlock());
        int size = hero.getMap().getSize();
        
        UserOutput o = new UserOutput("Current location on map:\n");

        for (int i = 0; i < blocks.size(); i++) {

            if (i == currentLocationIndex)
                o.outputSansNewLine("|X| ");
            else
                o.outputSansNewLine("|*| ");

            if ((i + 1) % size == 0 && i != 0)
                o.outputSansNewLine("\n\n");
        }
        o.output("");
    }
}