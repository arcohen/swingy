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
public class Artifact {
    private String name;
    private String categoryOfEffect;
    private int points;

    public Artifact(String name, String categoryOfEffect, int points) {
        this.name = name;
        this.categoryOfEffect = categoryOfEffect;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public String getCategoryOfEffect() {
        return this.categoryOfEffect;
    }

    public int getPoints() {
        return this.points;
    }
}
