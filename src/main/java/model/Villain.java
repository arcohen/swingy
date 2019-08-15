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
    
    public Villain(int size, List<VillainClass> villainClasses, List<Villain> villains) {
        coordinates = new Coordinates(size);

        int playerCoordinate = size / 2 + 1;

        this.villainClass = villainClasses.get(ThreadLocalRandom.current().nextInt(0, villainClasses.size()));
        
        for (int i = 0; i < villains.size(); i++) {
            if (villains.get(i).coordinates.exists(this.coordinates) || (coordinates.getX() ==  playerCoordinate && coordinates.getY() ==  playerCoordinate )) {
                this.coordinates.newCoordinates(size);
                i = 0;
            }
        }
    }

    public VillainClass getVillainClass() {
        return villainClass;
    }
}