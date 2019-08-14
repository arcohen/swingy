/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author arcohen
 */
public class Hero extends Character {
    private HeroClass heroClass;
    private String name;
    private int level;
    private int xp;
    private List<Artifact> artifacts;
    private Map map;
    
    public void Hero(HeroClass heroClass, String name) {
        this.attack = heroClass.attack;
        this.defense = heroClass.defense;
        this.hitPoints = heroClass.hitPoints;
        
        this.name = name;
        
        coordinates = new Coordinates();
        
        this.map = new Map(1);
    }
}
  