package controller;

import java.util.List;

import model;

public class Artifacts {
    
    public List<model.Artifact> getUserArtifacts() {
        return model.Artifacts.getArtifacts();
    } 
}