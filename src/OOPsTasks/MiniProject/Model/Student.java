package OOPsTasks.MiniProject.Model;

public class Student extends Person{
    private int rollno;
    private String courseEnrolled;

    private char Grade;

    public Student() {

    }

    public Student(String name,char grade, int rollno, String courseEnrolled) {
        super(name);
        this.rollno = rollno;
        this.courseEnrolled = courseEnrolled;
        this.Grade=grade;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "rollno=" + rollno +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                '}';
    }

}
