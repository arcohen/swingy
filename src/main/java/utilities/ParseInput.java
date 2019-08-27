package utilities;

import java.util.Scanner;

public class ParseInput {

    Scanner input;

    public ParseInput() {
        this.input = new Scanner(System.in);
    }

    public int intRange(int lower, int higher) {

        int userInput;
       
        while ((input.hasNext())) {
            if (input.hasNextInt()) {
                if ((userInput = input.nextInt()) >= lower && userInput <= higher)
                {
                    input.nextLine();
                    return userInput;
                }
            } 
            else {
                input.next();
            }
            System.out.println("Please select a number between " + lower + " and " + higher);
        }
        return 0;
    }

    public String string() {
        return input.nextLine();
    }
}