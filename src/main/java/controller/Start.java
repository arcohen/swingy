package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Hero;
import model.SavedHeroes;
import utilities.ParseInput;
import view.*;

public class Start {

    UserOutput o = new UserOutput();
    ParseInput input = new ParseInput();

    public Start() throws IOException, ClassNotFoundException {
        
        File savedHeroesFile = new File("../../../GameSetting/savedHeroes.txt");
        SavedHeroes savedHeroes;

        if (savedHeroesFile.exists()) {

            try {
                FileInputStream fileInputStream = new FileInputStream(savedHeroesFile);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                savedHeroes = (SavedHeroes) objectInputStream.readObject();
                objectInputStream.close();
            }
            catch (Exception e) {
                savedHeroes = new SavedHeroes();
                System.out.println(e.getMessage());
            }

            if (savedHeroes.getHeroes().isEmpty())
            {
                newCharacter(savedHeroes);
            }
            else {
                o.output("Would you like to (1) create a new hero or (2) load a saved hero");
                int inputInt = input.intRange(1, 2);
                if (inputInt == 1)
                    newCharacter(savedHeroes);
                else
                    loadSavedCharacter(savedHeroes);
            }
            
        }
        else {
            
            savedHeroes = new SavedHeroes();
            
            try {

                FileOutputStream fileOutputStream = new FileOutputStream(savedHeroesFile);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(savedHeroes);
                objectOutputStream.flush();
                objectOutputStream.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            newCharacter(savedHeroes);
        }
    }

    private void newCharacter(SavedHeroes savedHeroes) {

        o.output("You will now create a new hero..\n");
        new createHero();
    }

    private void loadSavedCharacter(SavedHeroes savedHeroes) {
        new SavedHeroesView(savedHeroes);
        Hero hero = savedHeroes.getHero(input.intRange(1, savedHeroes.getHeroes().size()));
        new LevelCompleted().startLevel(hero.getId());
    }
}