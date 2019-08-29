package view;

import java.util.List;

import model.*;

public class SavedHeroesView {

    public SavedHeroesView(SavedHeroes savedHeroes) {
    
    List<Hero> savedHeroesList = savedHeroes.getHeroes();
    UserOutput o = new UserOutput();

    o.output("Please select a hero from the list below to load:\n");

        for (int i = 0; i < savedHeroesList.size(); i++) {
            Hero hero = savedHeroesList.get(i);

            o.output("(" + (i + 1) + ")");
            o.output(hero.getName());
            o.output(hero.getHeroClass().getName()+ "\n");
            o.output("HP: " + hero.getFullHP());
            o.output("XP: " + hero.getXp());
            o.output("Attack: " + hero.getAttack());
            o.output("Defence: " + hero.getDefense());
            o.output("");
            o.output("----------");
        }
    }
}