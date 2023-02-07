import notes.StudentNotes;

public class StudentTest {
    public static void main(String[] args) {
        StudentNotes student = new StudentNotes("John Doe", 82.4);
        System.out.println(student.name);
        System.out.println(student.shareGrade());
    }
    
}
