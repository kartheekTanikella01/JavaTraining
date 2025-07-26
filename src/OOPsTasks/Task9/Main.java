package OOPsTasks.Task9;

import OOPsTasks.Task9.Model.Student;
import OOPsTasks.Task9.Service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        StudentService studentService=new StudentService();
        for (int i = 0; i < 2; i++) {
            student.setName("Kartheek");
            student.setAge(10);
            student.setStandard(6);
            studentService.addService(student);
        }
        System.out.println(studentService.getStudentDetails());



    }
}
