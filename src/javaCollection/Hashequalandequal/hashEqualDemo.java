package javaCollection.Hashequalandequal;


class Employee{
    String emp_name;
    int emp_id;
    public Employee(String emp_name,int emp_id){
        super();
        this.emp_name=emp_name;
        this.emp_id=emp_id;
    }

    public boolean equals(Object o){
        if (this==o)
            return  true;
        if (o==null ||o.getClass()!=this.getClass()){
            return  false;

        }
        return  true;

    }
}
public class hashEqualDemo {
}
