import Bai5.Student;
import Bai5.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement student_manager = StudentManagement.getStudentManager();
        Student student1 = new Student("Quan", 19, "ThaiBinh");
        Student student2 = new Student("Tho", 21, "ThanhHoa");
        Student student3 = new Student("Tien", 19, "HaNoi");
        student_manager.addStudent(student1);
        student_manager.addStudent(student2);
        student_manager.addStudent(student3);
//        student_manager.showStudents();
        student_manager.showStudentsUnder(20);
    }
}