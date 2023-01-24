package objects;

public class Person {

    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        // instance 
        Person rick = new Person();
        rick.firstName = "rick";
        rick.lastName = "sanchez";
        System.out.println(rick.sayHello());

        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "grace";
        grace.lastName = "hopper";
        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());


        //static
        System.out.println(Math.PI);
    }
}
