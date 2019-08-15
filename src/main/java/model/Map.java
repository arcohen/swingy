/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arcohen
 */
public class Map {
    int size;
    List<Villain> villains;
    
    public Map(int level, List<VillainClass> villainClasses) {
        
        int size = (level - 1) * 5 + 10 - (level % 2);
        List<Villain> villains = new ArrayList<Villain>();
        
        int villainNumber = (int) Math.round(size * size - size * size / 1.5);

        for (int i = 0; i < villainNumber; i++) {
            Villain villain = new Villain(size, villainClasses, villains);
            villains.add(villain);
        }

        this.size = size;
        this.villains = villains;
    }

    public int getSize() {
        return size;
    }
}
