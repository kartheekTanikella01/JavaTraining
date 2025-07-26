package OOPsTasks.MiniProject;

import OOPsTasks.MiniProject.Model.Student;
import OOPsTasks.MiniProject.Model.User;
import OOPsTasks.MiniProject.Service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("Login Required:");
        System.out.print("Enter username: ");
        String uname = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        User inputUser = new User();
        inputUser.setUser(uname);
        inputUser.setPassword(pass);

        if (studentService.userLogin(inputUser)) {
            System.out.println("Login successful!\n");

            for (int i = 0; i < 3; i++) {
                Student student = new Student();

                System.out.print("Enter student name: ");
                student.setName(scanner.nextLine());

                System.out.print("Enter roll no: ");
                student.setRollno(scanner.nextInt());
                scanner.nextLine(); // clear newline

                System.out.print("Enter course enrolled: ");
                student.setCourseEnrolled(scanner.nextLine());

                studentService.addStudents(student);
                System.out.println("Student added successfully.\n");
            }

            System.out.println("All Student Details:");
            studentService.printDetails();
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
        System.out.println(" \n");
        System.out.print("Enter grade to filter: ");
        char filterGrade = scanner.nextLine().charAt(0);

        System.out.println("Students with grade '" + filterGrade + "':");
        for (Student s : studentService.filterStudentsByGrade(filterGrade)) {
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollno());
            System.out.println("Course: " + s.getCourseEnrolled());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
