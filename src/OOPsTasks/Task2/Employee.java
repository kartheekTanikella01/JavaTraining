package OOPsTasks.Task2;

public class Employee {
  static int count=0;
  public String name;

    public Employee() {
        count++;
    }
    public Employee(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="kartheek";
        Employee employee2 =new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();

        System.out.println(count);

    }
}
