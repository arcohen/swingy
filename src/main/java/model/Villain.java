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
    
    public Villain(List<VillainClass> villainClasses, int level, int villainStrength) {
        this.villainClass = villainClasses.get(ThreadLocalRandom.current().nextInt(0, villainClasses.size()));

        this.setAttack(ThreadLocalRandom.current().nextInt(1, 10) * level);
        this.setDefense(ThreadLocalRandom.current().nextInt(1, 10) * level);
        this.setHitPoints(ThreadLocalRandom.current().nextInt(1, 10) * level);
    }   

    public VillainClass getVillainClass() {
        return villainClass;
    }
}