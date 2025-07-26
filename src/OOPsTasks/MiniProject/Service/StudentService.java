package OOPsTasks.MiniProject.Service;

import OOPsTasks.MiniProject.Model.Student;
import OOPsTasks.MiniProject.Model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    public StudentService() {
        User user1 = new User();
        user1.setUser("admin");
        user1.setPassword("admin123");
        userList.add(user1);
    }

    public boolean userLogin(User inputUser) {
        for (User user : userList) {
            if (user.getUser().equals(inputUser.getUser()) &&
                    user.getPassword().equals(inputUser.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void addStudents(Student student) {
        studentList.add(student);
    }

    public void printDetails() {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollno());
            System.out.println("Course: " + student.getCourseEnrolled());
            System.out.println("-----------------------------");
        }
    }
    public List<Student> filterStudentsByGrade(char grade) {
        List<Student> filteredList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGrade() == grade) {
                filteredList.add(student);
            }
        }
        return filteredList;
    }

}
