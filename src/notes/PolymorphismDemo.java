package notes;

public class PolymorphismDemo {

    public static void doWork(EmployeeNotes e) {
        System.out.println(e.doWork());
    }

    public static void main(String[] args) {
        EmployeeNotes e1 = new EmployeeNotes("e1", "e1");
        EmployeeNotes e2 = new ManagerNotes("manager", "manager");
        
        doWork(e1); // "f"
        doWork(e2); // managing employees
    }
    
}
