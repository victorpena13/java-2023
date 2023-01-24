import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("are you ready to start the game [y/n] ");
        String start = scanner.next();
        if(start.equalsIgnoreCase("no") || start.equalsIgnoreCase("n")) {
            System.out.println("goodbye"); 
            return;
        } 
        System.out.print("what is your name: ");
        String username = scanner.next();
        System.out.println("Hi " + username + "\nhow to play: ");
        System.out.println("1 to view your stats.");
        System.out.println("2 to display enemy stats.");
        System.out.println("");


        // beat high low game to beat monster
        // guess roll dice game 
        // get integer game 








    }
    
}
