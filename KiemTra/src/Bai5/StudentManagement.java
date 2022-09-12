package Bai5;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManagement {

    ArrayList<Student> student_list;

    private static StudentManagement studentManager ;

    private StudentManagement()
    {
        this.student_list= new ArrayList<>();
    }


    public static StudentManagement getStudentManager() {
        return new StudentManagement();
    }

    public void addStudent(Student stu){
         student_list.add(stu);
    }

    public void showStudents() {
        ListIterator<Student> iterator = student_list.listIterator();
        while (iterator.hasNext()) {
                Student stu = iterator.next();
                System.out.println(stu.toString());
        }
    }

    public void showStudentsUnder(int age) {
        ListIterator<Student> iterator = student_list.listIterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            if(stu.age <= age ) {
                System.out.println(stu.toString());
            }
        }
    }

}
