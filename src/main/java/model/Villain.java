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
    private VillainClass villainClass;
    
    public Villain(int size, List<Villain> villains) {
        coordinates = new Coordinates(size);
        
        for (int i = 0; i < villains.size(); i++) {
            if (villains.get(i).coordinates.exists(this.coordinates)) {
                this.coordinates.newCoordinates(size);
                i = 0;
            }
        }
    }
}
