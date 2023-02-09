package abstract_notes;

public class Accountant extends Employee {

    // accountant class must define the work() method because 
    // it inherts from Employee and is not defined as 'abstract'.
    public String work() {
        return "crunching numbers";
    }
    
}
