package notes;

// EmployeeNotes is a subclass and extends/inherits from PersonNotes the superclass.
public class EmployeeNotes extends PersonNotes{
    // a subclass can add new fields: 
    private double salary;


    // employeeNotes the subclass inherits all the fields of its superclass,
    // and can re-use any of its functionality
    public EmployeeNotes(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getName() {
        // i can reach the field firstName from the superclass PersonNotes because the field is protected. 
        return this.firstName;
    }

    //overriding:
    //override methods on the superclass. 
    //to do so. subclass must define a method with the same name, return type, and parameters as in the superclass. 
    //this allows the subclass to implement its own interpretation.
    //example:
    //sayHello overrides the sayhello of superclass PersonNotes
    public String sayHello() {
        return "How can i help you";
    }

    // the 'final' keyword used to prevent reassignment,
    // prevent inheritance or overriding.
    // can also be used with method parameters, like with variables, to prevent reassignemnt
    public final String onClock() {
        return "yes i work here";
    }


    //instances of the PersonNotes class do not have access to the salary property
    //or the doWork,getSalary,setSalary methods
    public String doWork() {
        return "work, work...";
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }





    public static void main(String[] args) {

        // because EmployeeNotes extends/inherits PersonNotes. we can use the sayHello method, person constructor and name properties. 
        EmployeeNotes john = new EmployeeNotes("john", "smtih");
        john.sayHello();
        john.setAge(22);
        System.out.println(john.firstName + " " + john.lastName);
        System.out.println(john.getAge());
    }
}
