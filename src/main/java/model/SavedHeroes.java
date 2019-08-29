package model;

import java.io.Serializable;
import java.util.List;

public class SavedHeroes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Hero> savedHeroes;
    
    public void saveHero(Hero hero) {
        savedHeroes.add(hero);
    }

    public List<Hero> getHeroes() {
        return savedHeroes;
    }

    public Hero getHero(int id) {
        return savedHeroes.get(id);
    }

    public void deleteHero(int id) {
        savedHeroes.remove(id);
    }
}