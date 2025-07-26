package OOPsTasks.Task9.Service;

import OOPsTasks.Task9.Model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentService {

    List<Student> students=new ArrayList<>();

    public StudentService() {
    }

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public void addService(Student student){
        students.add(student);
    }

    public List<Student> getStudentDetails(){
        if (students.isEmpty()){
            System.out.println("no students found.");
            return null;
        }
        return students;


    }
}
