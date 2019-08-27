package model;

import java.util.List;

public class SavedHeroes {
    
    private List<Hero> savedHeroes;
    
    public void saveHero(Hero hero) {

    }

    public List<Hero> getHeroes() {
        return savedHeroes;
    }

    public Hero getHero(int id) {
        return savedHeroes.get(id);
    }

    public void deleteHero(int id) {
        
    }
}