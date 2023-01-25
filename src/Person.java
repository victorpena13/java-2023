public class Person {
    //private instance variable 
    private String name;

    //instance method: 
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        // 'this' references the private name field and not the variable'
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello, " + this.name);
    }

    // constructor:
    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Person victor = new Person("victor");
        victor.sayHello();

        Person p1 = new Person("John");
        Person p2 = new Person("John");
        System.out.println(p1.getName().equals(p2.getName())); // true
        System.out.println(p1 == p2); // false - refer to different objects.

        Person p3 = p1;
        System.out.println(p1.getName());  //john
        System.out.println(p3.getName()); // john
        p3.setName("jane");
        System.out.println(p1.getName()); //john
        System.out.println(p3.getName()); // jane



    }
}
