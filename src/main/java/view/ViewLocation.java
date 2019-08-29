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
                o.outputSansNewLine("|B| ");
            else
                o.outputSansNewLine("|H| ");

            if (i % size == 0)
                o.outputSansNewLine("\n");
        }
    }
}