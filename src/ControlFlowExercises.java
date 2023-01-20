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

    }
    
}
