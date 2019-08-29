package controller;

import java.util.concurrent.ThreadLocalRandom;

import model.*;
import utilities.ParseInput;
import view.*;

public class NewArtifact {

    public void generateNewArtifact(Hero hero) {

        Artifacts artifacts = hero.getArtifacts();
        UserOutput o = new UserOutput();

        if (ThreadLocalRandom.current().nextBoolean()) {
            o.output("The defeated villain has dropped an artifact!!");

            Artifact artifact = artifacts.generateArtifact(hero);
            new DisplayArtifact(artifact);
            o.output("Would you like to pick up the artifact?\n(1) Yes\n(2) No");
            int response = new ParseInput().intRange(1, 2);
            if (response == 1) {
                String catOfEffect = artifact.getCategoryOfEffect();
                int points = artifact.getPoints();
                
                switch (catOfEffect) {
                    case "HEALTH":
                    hero.setHitPoints(hero.getHitPoints() + points);
                    case "ATTACK":
                    hero.setAttack(hero.getAttack() + points);
                    case "DEFENSE":
                    hero.setDefense(hero.getDefense() + points);
                }

                o.output("Artifact picked up " + catOfEffect + "increased by " + points);
            }
        }
    }
}