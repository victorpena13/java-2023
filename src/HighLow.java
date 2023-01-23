import java.util.Scanner;

public class HighLow {

    public static int randomNumber() {
        return(int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int userGuess;
        int randomNumber = randomNumber();
        int count = 0;
        do{
            System.out.println("you have 6 guesses");
            System.out.print("guess the number between 1 and 100: ");
            int userInt = scanner.nextInt();
            if(randomNumber == userInt) {
                System.out.println("you guessed it with " + count + " guesses");
                return;
            } else if (count >= 5) {
                System.out.println("you ran out of guesses. you lose.");
                return;
            } else if (userInt < randomNumber) {
                System.out.println("higher");
                count++;
            } else if(userInt > randomNumber) {
                System.out.println("lower");
                count++;
            }
        } while(true);
    }
    
}
