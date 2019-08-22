/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author arcohen
 */
public class Villain extends Character {
    private VillainClass villainClass;
    
    public Villain(List<VillainClass> villainClasses) {
        
        this.villainClass = villainClasses.get(ThreadLocalRandom.current().nextInt(0, villainClasses.size()));
    }

    public VillainClass getVillainClass() {
        return villainClass;
    }
}