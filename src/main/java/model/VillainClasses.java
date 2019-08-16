/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arcohen
 */
public class VillainClasses {

    List<VillainClass> villainClasses;

    public VillainClasses() {
        String filePath = "../../../../CharacterInfo/villainClasses.txt";
        List<VillainClass> villainClasses = new ArrayList<VillainClass>();
        
        try 
        {
            ReadFile file = new ReadFile(filePath);
            ArrayList<String> textLines = file.OpenFile();
            
            textLines.remove(0);
            
            for (String line : textLines) {
                String[] villainInfo;
                villainInfo = line.split(";");
                VillainClass villain = new VillainClass(villainInfo);
                villainClasses.add(villain);
            }

            this.villainClasses = villainClasses;
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public List<VillainClass> getVillainClasses() {
        return this.villainClasses;
    }

}
