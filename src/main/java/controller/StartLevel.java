package controller;

import model.*;

public class StartLevel {

    public StartLevel(int id) {
        Hero hero = new SavedHeroes().getHeroes().get(id);
        new NewSquare(hero);
    }
}