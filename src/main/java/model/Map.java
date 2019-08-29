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
    int villainStrength;
    List<Block> blocks;
    Block currentBlock;
    Block previousBlock;
    
    public Map(int level, VillainClasses villainClasses) {
        
        getGameDifficulty();

        this.size = (level - 1) * 5 + 10 - (level % 2);
        List<VillainClass> villainClassList = villainClasses.getVillainClasses();
        this.blocks = new ArrayList<Block>();


        for (int i = 0; i < size * size; i++) {
            Block block = new Block(i, size, villainDensity, villainClassList, level, villainStrength);
            blocks.add(i, block);
        }

        this.currentBlock = this.blocks.get(size / 2);
    }

    public void changePosition(int direction) {

        int index = blocks.indexOf(currentBlock);

        this.previousBlock = currentBlock;
        
        switch (direction) {
            case 1:     //NORTH
                this.currentBlock = blocks.get(index - size);
            case 2:     //SOUTH
                this.currentBlock = blocks.get(index + size);
            case 3:     //WEST
                this.currentBlock = blocks.get(index - 1);
            case 4:     //EAST
                this.currentBlock = blocks.get(index + size);
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
    
    public Block getCurrentBlock() {
        return currentBlock;
    }
}