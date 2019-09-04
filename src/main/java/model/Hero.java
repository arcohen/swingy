/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author arcohen
 */
public class Hero extends Character implements Serializable {

    private static final long serialVersionUID = 2L;

    private HeroClass heroClass;
    private String name;
    private int level;
    private int xp;
    private Artifacts artifacts;
    private VillainClasses villainClasses;
    private Map map;
    private int id;
    private Hero mapInitialHero;
    private SavedHeroes savedHeroes;
    
    public Hero(HeroClass heroClass, VillainClasses villainClasses, String name, SavedHeroes savedHeroes) {
        setAttack(heroClass.attack);
        setDefense(heroClass.defense);
        setHitPoints(heroClass.hitPoints);
        
        this.level = 1;
        this.xp = 1000;
        this.villainClasses = villainClasses;
        this.heroClass = heroClass;
        this.name = name;

        this.savedHeroes = savedHeroes;

        this.artifacts = new Artifacts();
        
        this.map = new Map(this.level, this.villainClasses);
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
        this.map = new Map(level, villainClasses);
    }

    public HeroClass getHeroClass() {
        return this.heroClass;
    }

    public Artifacts getArtifacts() {
        return artifacts;
    }

    public int getId() {
        return id;
    }

    public Hero getMapInitialHero() {
        return mapInitialHero;
    }

    public void setMapInitalHero(Hero mapInitialHero) {
        try {
            this.mapInitialHero = (Hero) mapInitialHero.clone();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public SavedHeroes getSavedHeroes() {
        return savedHeroes;
    }

    public void setSavedHeroes(SavedHeroes savedHeroes) {
        this.savedHeroes = savedHeroes;
    }

}
