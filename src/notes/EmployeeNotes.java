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

    //overriding:
    //override methods on the superclass. 
    //to do so. subclass must define a method with the same name, return type, and parameters as in the superclass. 
    //this allows the subclass to implement its own interpretation.
    //example:
    public void sayHello() {
        System.out.println("How can i help you");
    }


    //instances of the PersonNotes class do not have access to the salary property
    //or the doWork,getSalary,setSalary methods
    public void doWork() {
        System.out.println("work, work...");
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
        System.out.println(john.firstName + " " + john.lastName);
    }
}
