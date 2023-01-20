import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.printf("the value of pi is approximately %.2f", pi);
        System.out.println();

        System.out.print("please enter an integer: ");
        Scanner scanner = new Scanner(System.in);

        int userInteger = scanner.nextInt();
        
        System.out.println("you entered: " + userInteger);

        System.out.print("enter three words: ");
        String userInputOne = scanner.next();
        String userInputTwo = scanner.next();
        String userInputThree = scanner.next();

        System.out.println(userInputOne);
        System.out.println(userInputTwo);
        System.out.println(userInputThree);

        // if more then three words are entered no more words will be saved. 
        // three words must be entered. 

        System.out.println("please enter a sentence: ");
        // String userSentence = scanner.next(); // will only capture first word of sentence. 
        String userSentence = scanner.nextLine();

        





















    
    }
}
