import java.nio.file.attribute.UserPrincipal;
import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int a = 5;

        while(a<=15) {
            System.out.print(a+" ");
            a++;
        }

        int b = 0; 

        do {
            System.out.println(b);
            b+=2;

        } while(b<=100);

        int c=100;

        do {
            System.out.println(c);
            c-=5;
        } while(c>=-10);

       long d = 2;
       do {
           System.out.println(d);
           d*= d;
       } while (d < 1000000);


       int e=1;

       do {
        if (e%3==0 && e%5==0) {
            System.out.println("fizzbuzz");
        }else if(e%3==0) {
            System.out.println("fizz");
        } else if(e%5==0) {
            System.out.println("buzz");
        } else {
            System.out.println(e);
        }
        e++;
       } while(e<=100);



    //    System.out.printf("%1$4s %2$10s %3$10s%n", "number", "squared", "cubed");

    String yesNo;

    do{
        System.out.print("what number would you like to go up to: ");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        System.out.printf("%15s| %15s| %15s|%n", "number", "squared", "cubed");
        for(int i=1, j=1, k=1;i<=userInt;i++, j++, k++) {
            System.out.printf("%15s| %15s| %15s|%n", i, j*j, (k*k)*k);
        }
        System.out.println("your int: " + userInt);
        System.out.print("would you like to continue;");
        yesNo = scanner.next();
    } while(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("y"));

    
    String continueYesNo;

    do {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a numerical grade from 0 to 100: ");
        int userInt = scanner.nextInt();
        if(userInt >= 88 && userInt <= 100) {
            System.out.println("A");
        } else if (userInt>=80 && userInt <= 87) {
            System.out.println("B");
        } else if (userInt>=67 && userInt <=79) {
            System.out.println("C");
        } else if (userInt>=60&& userInt <=66) {
            System.out.println("D");
        } else if (userInt<=59) {
            System.out.println("F");
        } 
    
        System.out.print("would you like to continue: ");
        continueYesNo = scanner.next();

    } while(continueYesNo.equalsIgnoreCase("yes") || continueYesNo.equalsIgnoreCase("y"));



    }


}
