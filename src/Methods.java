public class Methods {

    public static String sayHello() {
        return "say hello";
    }

    public static String sayHello(String name) {
        return String.format("hello, %s!", name);
    }

    // public - visibility modifier.
    // static - method belongs to the class, as opposed to instances of it.
    // string - return type of method.
    // sayHello - name of method.
    // (String name) - the parameters that accept the argument.
    // {} - everything inside curly braces is the body of the method.


    // overloaded method sayHello
    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    
    }

    public static void sayHello(int times) {
        for(int i =1; i < times; i+=1) {
            System.out.println(i + " hello world");
        }
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }


    // recursion: 

    public static void count(int n) {
        if (n<=0) {
            System.out.println("all done");
            return;
        }
        System.out.println(n);
        count(n-1);
    }

    public static long getPower(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent -1);
    }

 

    public static void main(String[] args) {
        System.out.println(sayHello("victor"));
        sayHello("greetings", "earthling");
        System.out.println(sayHello());
        sayHello(6);
        count(5);
        System.out.println(getPower(2, 4)); // 16
    }
    
}
