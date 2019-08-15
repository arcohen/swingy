/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arcohen
 */
public class VillainClass {
    String name;
    String description;
    
    public VillainClass (String[] line) {
        this.name = line[0];
        this.description = line[1];
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}