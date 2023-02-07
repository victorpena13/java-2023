package notes;

public class StudentNotes {

    //public - field is accessible from everywhere.
    // instance variable fields:
    public String name;
    public String cohort;
    //private - only accessible within the class that defines it.
    private double grade;

    // constructor: 
    public StudentNotes(String studentName) {
        //the this keyword can also be used to call other constructors:
        this(studentName, "unassigned");

    }

    // constructor overloaded: 
    public StudentNotes(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort; 
    }

    public StudentNotes(String studentname, double grade) {
        this.name = studentname;
        this.grade = grade;

    }

    // instance method:
    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    
    }

    public double shareGrade() {
        return grade;
    }

    public static void main(String[] args) {
        StudentNotes s1 = new StudentNotes("Student A");
        StudentNotes s2 = new StudentNotes("student b", "voyagers");
    }
}