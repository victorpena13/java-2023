import java.util.Scanner;

public class ConsoleInputOutput {

    public static void main(String[] args) {
        String name = "victor";
        System.out.printf("Hello there, %s. Nice to see you. %n", name);

        String greeting = "salutations";
        
        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter something: ");
        String userInput = scanner.next();
        System.out.println("You entered: ==> \"" + userInput + "\" <--");
        



    }
    
}
