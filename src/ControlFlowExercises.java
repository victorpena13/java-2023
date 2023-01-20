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

        int c = 100;

        do {
            System.out.println(c);
            c-=5;
        } while(c>=-10);

    }
    
}
