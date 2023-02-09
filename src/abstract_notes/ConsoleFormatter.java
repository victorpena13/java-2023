package abstract_notes;

public class ConsoleFormatter implements Formatter {

    public String display(Employee e) {
        return "name: " + e.getName() +
            "\ndepartment: " + e.getDepartment();
    }
    
}
