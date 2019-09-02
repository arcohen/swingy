package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SavedHeroes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Hero> savedHeroes;

    public SavedHeroes() {
        savedHeroes = new ArrayList<Hero>();
    }

    public void saveHero(Hero hero) {
        savedHeroes.add(hero);
    }

    public List<Hero> getHeroes() {
        return savedHeroes;
    }

    public Hero getHero(int id) {
        return savedHeroes.get(id);
    }

    public void deleteHero(Hero hero) {
        savedHeroes.remove(hero);
    }

    public void saveToDB() {

        File savedHeroesFile = new File("../../../GameSettings/savedHeroes.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(savedHeroesFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            objectOutputStream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}