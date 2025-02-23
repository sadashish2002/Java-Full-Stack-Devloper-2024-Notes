package JDBC_Final_Project;

public class Employee {
    private  int id;
    private String name;
    private String email;
    private int salary;

    public Employee(int id , String name, String email , int salary){
        this.id = id;
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Employee [id= " + id + " , name= " + name + ", email= " +  email + " , salary = " + salary + "]";
    }

}
