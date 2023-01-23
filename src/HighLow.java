import java.util.Scanner;

public class HighLow {

    public static int randomNumber() {
        return(int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int userGuess;
        int randomNumber = randomNumber();

        do{
            System.out.println(randomNumber);
            System.out.print("guess the number between 1 and 100: ");
            int userInt = scanner.nextInt();
            if(randomNumber == userInt) {
                return;
            }
        } while(true);
    }
    
}
