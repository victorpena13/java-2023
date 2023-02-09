package abstract_notes;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee d1 = new Developer("victor", "developer");
        Employee m1 = new Manager("clay", "manager");

        System.out.println(d1.getName() + "\n" + d1.getDepartment());
        System.out.println(d1.work());
        System.out.println(m1.getName());
        System.out.println(m1.getDepartment());
        System.out.println(m1.work());

    }
    
}
