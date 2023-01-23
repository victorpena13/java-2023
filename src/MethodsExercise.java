import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class MethodsExercise {

    public static int addition(int x, int y) {
        return x+y;
    }

    public static int subtraction(int x, int y) {
        return x-y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static void division(int x, int y) {
        if(y == 0){
            System.out.println("Undefined");
        } else {
            System.out.println(x/y);
        }
    }

    public static void modulus(int x, int y) {
        if(y==0) {
            System.out.println("undefined ");
        } else {
            System.out.println(x % y);

        }
    }

    public static int multiplicationLoop(int x, int y){
        int result =0;
        for(int i =1; i <= y; i++) {
            result +=x;
        }
        return result;
    }

    public static int multiplicationRecursion(int x, int y) {
        if(y == 0 || x == 0) {
            return 0;
        }
        if(y == 1) {
            return x;
        } else if (x == 1) {
            return y;
        } 
        return x + multiplicationRecursion(x,y-1);
    }

    public static int getInteger(int min, int max) {
        int userInt;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("enter a number between " + min + " " + max + ": ");
            userInt = scanner.nextInt();
            if(userInt >= min && userInt <= max) {
                System.out.print("your within range: ");
                break;
            }
        
        } while(true);
        return userInt;
    }

    public static void main(String[] args) {
        System.out.println(addition(2, 2));
        System.out.println(subtraction(3,1));
        System.out.println(multiplication(5, 5));
        division(2,2);
        division(2, 0);
        modulus(2, 1);
        modulus(2, 0);
        System.out.println("test");
        System.out.println(multiplicationRecursion(2, 10));
        System.out.println(multiplicationLoop(5,5));
        System.out.println(getInteger(1, 20));
    }
    
}