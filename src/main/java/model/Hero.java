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
    //private HeroClass heroClass;
    private String name;
    private int level;
    private int xp;
    private List<Artifact> artifacts;
    private Map map;
    
    public Hero(HeroClass heroClass, List<VillainClass> villainClasses, String name) {
        this.attack = heroClass.attack;
        this.defense = heroClass.defense;
        this.hitPoints = heroClass.hitPoints;
        //this.heroClass = heroClass;
        
        this.name = name;
        
        coordinates = new Coordinates();
        coordinates.initPlayerCoordinates(9);
        
        this.map = new Map(1, villainClasses);
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return this.xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Map getMap() {
        return this.map;
    }

    public void setMap(int level) {
        this.map = new Map(level);
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }


}
  