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
public class Villain extends Character {
    private List<VillainClass> villainClasses;
    
    public Villain(int size, List<VillainClass> villainClasses) {
        coordinates = new Coordinates(size);



        int playerCoordinate = size / 2 + 1;
        
        for (int i = 0; i < villainClasses.size(); i++) {
            if (villainClasses.get(i).coordinates.exists(this.coordinates) || (coordinates.getX() ==  playerCoordinate && coordinates.getY() ==  playerCoordinate )) {
                this.coordinates.newCoordinates(size);
                i = 0;
            }
        }
    }

    public VillainClass getVillainClass() {
        return villainClass;
    }
}