/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arcohen
 */
public class HeroClasses {
    List<HeroClass> heroClasses;
    
    String filePath = "../../../CharacterInfo/hero_classes.txt";
        
    try 
    {
        ReadFile file = new ReadFile(filePath);
        ArrayList<String> textLines = file.OpenFile();
        
        textLines.remove(0);
        
        for (String line : textLines) {
            String[] heroInfo;
            heroInfo = line.split(";");
            HeroClass hero = new HeroClass(heroInfo);
            heroClasses.add(hero);
        }
    } 
    catch (IOExeption e) 
    {
        System.out.println(e.Message());
    }
    
}

