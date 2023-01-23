import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        
        System.out.println("type \"exit\" to quit. or");
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("say something to bob: ");
            String userInput = scanner.nextLine();
            switch(userInput) {
                case "?": 
                System.out.println("sure!");
                break;
                case "!":
                System.out.println("whoa, chill out.");
                case "":
                System.out.println("fine, be that way.");
                break;
                case "exit":
                return;
                default : 
                System.out.println("whatever");
                break;
            }
        } while(true);
    }
    
}
