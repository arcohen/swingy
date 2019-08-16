/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arcohen
 */
public class Artifacts {
    private List<Artifact> artifacts;

    public Artifacts() {
        this.artifacts = new ArrayList<Artifact>();
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
