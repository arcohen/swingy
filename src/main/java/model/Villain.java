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
    
    public Villain(int size, VillainClasses villainClasses, List<Villain> villains) {
        
        Coordinates coordinates = new Coordinates(size);

        int playerCoordinate = size / 2 + 1;
        
        List<VillainClass> villainClassList = villainClasses.getVillainClasses();

        this.villainClass = villainClassList.get(ThreadLocalRandom.current().nextInt(0, villainClassList.size()));
        
        if (villains.isEmpty() == false) {
            for (int i = 0; i < villains.size(); i++) {
                if (villains.get(i).getCoordinates().exists(coordinates) || (coordinates.getX() ==  playerCoordinate && coordinates.getY() ==  playerCoordinate )) {
                    coordinates.newCoordinates(size);
                    i = 0;
                }
            }
        }

        this.setCoordinates(coordinates);
    }

    public VillainClass getVillainClass() {
        return villainClass;
    }
}