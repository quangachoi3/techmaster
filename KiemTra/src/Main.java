import Bai5.Student;
import Bai5.StudentManagement;
import Bai6.CBNV;
import Bai6.Nguoi;
import Bai6.QuanLyNV;

public class Main {
    public static void main(String[] args) {
//        StudentManagement student_manager = StudentManagement.getStudentManager();
//        Student student1 = new Student("Quan", 19, "ThaiBinh");
//        Student student2 = new Student("Tho", 21, "ThanhHoa");
//        Student student3 = new Student("Tien", 19, "HaNoi");
//        student_manager.addStudent(student1);
//        student_manager.addStudent(student2);
//        student_manager.addStudent(student3);
//        student_manager.showStudents();
//        student_manager.showStudentsUnder(20);

        QuanLyNV nv_manager = QuanLyNV.getManager();
        Nguoi nguoi1 = new Nguoi("Quan", 19, "ThaiBinh", "AAA");
        Nguoi nguoi2 = new Nguoi("Tho", 21, "ThanhHoa", "AAB");
        Nguoi nguoi3 = new Nguoi("Tien", 19, "HaNoi", "AAC");
        CBNV nv1 = new CBNV(10, 10, 1, 10, nguoi1 );
        CBNV nv2 = new CBNV(100, 100, 10, 100, nguoi2 );
        CBNV nv3 = new CBNV(15, 15, 1, 15, nguoi3 );
//        System.out.println(nv3.toString());
        nv_manager.addNV(nv1);
        nv_manager.addNV(nv2);
        nv_manager.addNV(nv3);
        nv_manager.removeNV("AAB");
        nv_manager.tinhLuong("AAA");
        nv_manager.showAll();
    }
}