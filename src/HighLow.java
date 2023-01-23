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
            System.out.println(randomNumber);
            System.out.print("guess the number between 1 and 100: ");
            int userInt = scanner.nextInt();
            if(userInt < randomNumber) {
                System.out.println("higher");
                count++;
            } else if(userInt > randomNumber) {
                System.out.println("lower");
                count++;
            } else if(randomNumber == userInt) {
                System.out.println("you guessed it with " + count + " guesses");
                return;
            }
        } while(true);
    }
    
}
