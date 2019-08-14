/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author arcohen
 */
public class Coordinates {
    private int x;
    private int y;
        
    public Coordinates(int size) {
        this.x = ThreadLocalRandom.current().nextInt(0, size);
        this.y = ThreadLocalRandom.current().nextInt(0, size);
    }
    
    public void newCoordinates(int size) {
        this.x = ThreadLocalRandom.current().nextInt(0, size);
        this.y = ThreadLocalRandom.current().nextInt(0, size);
    }
    
    public Coordinates() {
        this.x = 4;
        this.y = 4;
    }
    
    public int getX() {
        return this.x; 
    }
    
    public int getY() {
        return this.y; 
    }
    
    public boolean exists(Coordinates coordinates) {
        if (this.x == coordinates.getX() && this.y == coordinates.getY())
            return true;
        else
            return false;
    }

}