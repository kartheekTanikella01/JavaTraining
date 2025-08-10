package javaCollection;


import java.util.*;

class Student{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo-o2.rollNo;
    }
}

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        Student student=new Student(101,"kartheek");
        Student student1=new Student(78,"earthen");
        Student student2=new Student(1,"sharpy");
        Student student3=new Student(1087,"sharath");
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student);
        students.add(student2);
        students.add(student3);
        Collections.sort(students,new SortByRoll());
        System.out.println("sorted by student roll no: ");
        Iterator<Student> studentIterator=students.iterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

    }





}
