package util;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Input {
    // private instance variable: 
    private Scanner scanner = new Scanner(System.in);

    // public instance method:
    public String getString() {
        return scanner.nextLine();
    }
    public int scanInt() {
        return scanner.nextInt();
    }

    public boolean yesNo() {
        System.out.println("yes or no: ");
        String userInput = getString();
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    int parsedInput;

    public int getInt(int min, int max) {
        int userInput;
        do{
            System.out.println("enter a number between " + min + " " + max);
            userInput = scanInt();
        } while(userInput< min || userInput > max);
        return userInput;

    }
 }