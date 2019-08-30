package controller;

import java.io.IOException;

import view.UserOutput;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        UserOutput o = new UserOutput();

        o.output("\n");
        o.output("     --------");
        o.output(" WELCOME TO SWINGY");
        o.output("     --------");
        o.dots(3);
        o.output("the worst game ever\n");
        o.delay(1000);
        

        new Start();
    }
}