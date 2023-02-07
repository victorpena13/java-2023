package notes;

public class EmployeeNotes extends PersonNotes{


    public EmployeeNotes(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static void main(String[] args) {
        EmployeeNotes john = new EmployeeNotes("john", "smtih");
        john.sayHello();
        System.out.println(john.firstName + " " + john.lastName);
    }
}
