import java.util.Scanner;

public class SyntaxTypesVariables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myFavoriteNumber = 13; 
        System.out.println(myFavoriteNumber);

        String myString = "this is a string value";
        System.out.println(myString);
        // myString = 'a'; // mismatch: cannot convert from char to string. 
        myString = "a";
        System.out.println(myString);
        // myString = 3.14159; //mismatch: required string gave double
        float myNumber;
        // System.out.println(myNumber); // has not been intitialized.
        myNumber = 123L;
        myNumber = 123; 
        System.out.println(myNumber);
        myNumber = 3.14F;
        System.out.println(myNumber);

        int a = 5;
        System.out.println(a++); //5
        System.out.println(a); //6

        int b = 5;
        System.out.println(++b); //6
        System.out.println(b); //6

        System.out.println("test: ");

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // cannot cast an int to a string; 

        int c = 4;
        System.out.println(c +=5);

        int d  = 3;
        int e = 4;
        System.out.println(e *=d);
        
        int f = 10;
        int g = 2;
        System.out.println(f /= g);
        System.out.println(g -= f);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(++maxInteger); // -2147483648

        System.out.print("enter length: ");
        int userLength = scanner.nextInt();
        System.out.print("enter width: ");
        int userWidth = scanner.nextInt();
        

        System.out.println("your perimeter of rectangle/square: " + (userLength+userLength+userWidth+userWidth));
        System.out.println("Area of rectangle/square:" + (userLength * userWidth));

        
        
        




    }
}
