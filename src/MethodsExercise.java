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

    public static void main(String[] args) {
        System.out.println(addition(2, 2));
        System.out.println(subtraction(3,1));
        System.out.println(multiplication(5, 5));
        division(2,2);
        division(2, 0);
        modulus(2, 1);
        modulus(2, 0);


    }
    
}
