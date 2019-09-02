/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import utilities.ReadFile;

/**
 *
 * @author arcohen
 */
public class Artifacts implements Serializable {

    private static final long serialVersionUID = 3L;
    private List<Artifact> artifacts;
    private List<Artifact> artifactTypes;

    public Artifacts() {
        this.artifacts = new ArrayList<Artifact>();
        this.artifactTypes = new ArrayList<Artifact>();

        String filePath = "../../../GameSettings/artifacts.txt";
        
        try 
        {
    
            utilities.ReadFile file = new ReadFile(filePath);
            ArrayList<String> textLines = file.OpenFile();
            
            textLines.remove(0);
            
            for (String line : textLines) {
                String[] artifactInfo;
                artifactInfo = line.split(";");
                Artifact artifact = new Artifact(artifactInfo[0], artifactInfo[1], 0);
                artifactTypes.add(artifact);
            }
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public Artifact generateArtifact(Hero hero) {

        int points = (hero.getLevel() * 10 -  ThreadLocalRandom.current().nextInt(1, 10)) / 2;

        if (points < 1)
            points = 1;

        return new Artifact(artifactTypes.get(ThreadLocalRandom.current().nextInt(0, artifactTypes.size())), points);
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void addArtifact(Artifact artifact) {
        artifacts.add(artifact);
    }

    public void removeArtifact(Artifact artifact) {
        artifacts.remove(artifact);
    }

    public boolean artifactTypeExists(Artifact artifact) {
        String artifactName = artifact.getName();
        for (Artifact heldArtifact : this.artifacts) {
            if (heldArtifact.getName() == artifactName)
                return true;
        } 
        return false;
    }

    public void removeArtifactType(Artifact artifact) {
        String artifactName = artifact.getName();
        for (Artifact heldArtifact : this.artifacts) {
            if (heldArtifact.getName() == artifactName) {
                this.artifacts.remove(heldArtifact);
                break;
            }
        } 
    }
}
