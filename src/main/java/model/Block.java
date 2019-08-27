package model;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Block {
    
    boolean containsVillain;
    boolean isSidePiece;
    Villain villain;

    public Block(int i, int size, int villainDensity, List<VillainClass> villainClassList, int level, int villainStrength) {

        if (i % size == 0 || i % size == size - 1 || i < size || i > size * size - size) {
            this.isSidePiece = true;
        } else {
            this.isSidePiece = false;
        }

        this.containsVillain = false;
            
        if (i != size * size / 2 && ThreadLocalRandom.current().nextInt(0, 1000) < villainDensity) {
            this.containsVillain = true;
            this.villain = new Villain(villainClassList, level, villainStrength);
        }
    }

    public Villain getVillain() {
        return villain;
    }

    public boolean containsVillain() {
        return containsVillain;
    }

    public boolean isSidePiece() {
        return isSidePiece;
    }

    public void removeVillain() {
        containsVillain = false;
    }
}