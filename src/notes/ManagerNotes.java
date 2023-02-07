package notes;

public class ManagerNotes extends EmployeeNotes {

    public ManagerNotes(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public String doWork() {
        return "Managing employees";
    }
    
}
