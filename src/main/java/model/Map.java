/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utilities.*;

/**
 *
 * @author arcohen
 */
public class Map {
    int size;
    int villainDensity;
    List<Block> blocks;
    Block currentBlock;
    Block previousBlock;
    
    public Map(int level, VillainClasses villainClasses) {
        
        getGameDifficulty();

        this.size = (level - 1) * 5 + 10 - (level % 2);
        List<VillainClass> villainClassList = villainClasses.getVillainClasses();
        this.blocks = new ArrayList<Block>();


        for (int i = 0; i < size * size; i++) {
            Block block = new Block(i, size, villainDensity, villainClassList);
            blocks.add(i, block);
        }

        this.currentBlock = this.blocks.get(size / 2);
    }

    public Block changePosition(String direction) {

        int index = blocks.indexOf(currentBlock);

        this.previousBlock = currentBlock;
        
        switch (direction) {
            case "NORTH":
                return currentBlock = blocks.get(index - size);
            case "SOUTH":
                return currentBlock = blocks.get(index + size);
            case "WEST":
                return currentBlock = blocks.get(index - 1);
            case "EAST":
                return currentBlock = blocks.get(index + size);
            default:
                return currentBlock;
        }
    }

    private void getGameDifficulty() {
        try 
        {
            String filePath = "../../../GameSettings/difficultySettings.txt";

            utilities.ReadFile file = new ReadFile(filePath);
            ArrayList<String> textLines = file.OpenFile();
            
            this.villainDensity = Integer.parseInt(textLines.get(1)); 
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public int getSize() {
        return size;
    }

    public List<Block> getBlocks() {
        return  blocks;
    }
}
