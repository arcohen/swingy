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
public class HeroClasses {

    List<HeroClass> heroClasses;
    
    public HeroClasses() {
        List<HeroClass> heroClasses = new ArrayList<HeroClass>();
        String filePath = "../../../GameSettings/heroClasses.txt";
        
        try 
        {
    
            utilities.ReadFile file = new ReadFile(filePath);
            ArrayList<String> textLines = file.OpenFile();
            
            textLines.remove(0);
            
            for (String line : textLines) {
                String[] heroInfo;
                heroInfo = line.split(";");
                HeroClass hero = new HeroClass(heroInfo);
                heroClasses.add(hero);
            }
            this.heroClasses = heroClasses;
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public List<HeroClass> getHeroClasses() {
        return this.heroClasses;
    }
    
}