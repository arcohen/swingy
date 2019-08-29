package view;

import model.Artifact;

public class DisplayArtifact {
    public DisplayArtifact(Artifact artifact) {
        UserOutput o = new UserOutput();

        o.output("        -------------\n");
        o.output("Type: " + artifact.getName());
        o.output("Category of effect: " + artifact.getCategoryOfEffect());
        o.output("Points: " + artifact.getPoints() + "\n");
        o.output("        -------------\n");
    }
}