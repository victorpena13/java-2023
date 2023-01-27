package util;

import java.util.Scanner;

public class Input {
    // private instance variable: 
    private Scanner scanner = new Scanner(System.in);

    // public instance method:
    public String getString() {
        return scanner.nextLine();
    }
    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble() {
        return scanner.nextDouble();
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
            System.out.print("enter a number between " + min + " and " + max);
            userInput = getInt();
        } while(userInput< min || userInput > max);
        return userInput;
    }

    public double getDouble(int min, int max) {
        double userInput;
        do{
            System.out.print("enter a number between " + min + " and " + max);
            userInput = getDouble();
        } while(userInput< min || userInput > max);
        return userInput;

    }
 }