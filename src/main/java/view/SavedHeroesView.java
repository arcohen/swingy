package view;

import java.util.List;

import model.*;

public class SavedHeroesView {

    public SavedHeroesView(SavedHeroes savedHeroes) {
    
    List<Hero> savedHeroesList = savedHeroes.getHeroes();

        for (int i = 0; i < savedHeroesList.size(); i++) {
            Hero hero = savedHeroesList.get(i);

            System.out.println("(" + (i + 1) + ")");
            System.out.println(hero.getName());
            System.out.println(hero.getHeroClass().getName()+ "\n");
            System.out.println("HP: " + hero.getHitPoints());
            System.out.println("XP: " + hero.getXp());
            System.out.println("Attack: " + hero.getAttack());
            System.out.println("Defence: " + hero.getDefense());
            System.out.println("");
            System.out.println("----------");
        }
    }
}