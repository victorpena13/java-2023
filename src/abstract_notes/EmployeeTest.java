package abstract_notes;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee d1 = new Developer("victor", "developer");
        Employee m1 = new Manager("clay", "manager");

        //interface: 
        Formatter fmt = new ConsoleFormatter();
        fmt.display(d1);
        fmt.display(m1);

    }
    
}
