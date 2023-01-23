public class Methods {

    public static String sayHello(String name) {
        return String.format("hello, %s!", name);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("victor"));
    }
    
}
