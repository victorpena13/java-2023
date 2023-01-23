import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String message = "hello";
        System.out.println(message); //hello
        message = message + "world";
        System.out.println(message); //hello world

        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue? [y/n]");
        String userInput = scanner.next();

        userInput.equalsIgnoreCase(userInput);

        String input = "i rock";
        input.equalsIgnoreCase("test"); //false
        input.equals("I Rock"); //false
        input.equalsIgnoreCase("I Rock"); //true
        input.equals("i rock"); //true
        input.startsWith("i"); //true
        input.startsWith("I"); //false
        input.endsWith("rock"); //true
        input.endsWith("Rock"); //false

    }
    
}
