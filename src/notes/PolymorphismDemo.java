package notes;

public class PolymorphismDemo {

    public static void doWork(EmployeeNotes e) {
        System.out.println(e.doWork());
    }

    public static void main(String[] args) {
        EmployeeNotes e1 = new EmployeeNotes("e1", "e1");
        EmployeeNotes e2 = new ManagerNotes("manager", "manager");
        
        //polymorphism is a feature of inheritance that allows us to treat
        //objects of differnt sublcasses that have the same superclass
        //as if they were of the superclass type.
        //for example the method doWork(Employee e) accepts a variable of employee.
        // e2 is a new Manager() manger is a subclass of the employee class and can there for take ont the same 
        // properties as it's super and can be passed into the doWork() method
        doWork(e1); // "work, work..."
        doWork(e2); // managing employees
    }
    
}
