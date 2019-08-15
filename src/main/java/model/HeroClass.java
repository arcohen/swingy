/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Integer.parseInt;

/**
 *
 * @author arcohen
 */
public class HeroClass {
    protected String name;
    protected String description;
    protected int hitPoints;
    protected int attack;
    protected int defense; 
    
    public HeroClass(String[] line) {
        try
        {
            this.name = line[0];
            this.description = line[1];
            this.hitPoints = parseInt(line[2]);
            this.attack = parseInt(line[3]);
            this.defense = parseInt(line[4]);
        }
        catch (Exception e)
        {
            System.out.println("Error in hero class info file");    
        }
    }
}
