
import java.util.*;

class Employee {

    int id;
    String name;
    float salary;

    Scanner sc = new Scanner(System.in);

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    float getSalary() {
        return this.salary;
    }

    void display() {
        System.out.println("Employee Name:" + this.name);
        System.out.println("Employee ID:" + this.id);
        System.out.println("Employee Salary:" + this.salary);
    }
}

public class q2 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Fill the Details of Employee:");
        e1.setName("Pratik");
        e1.setId(101);
        e1.setSalary(50000);

        e2.setName("Rahul");
        e2.setId(102);
        e2.setSalary(60000);

        System.out.println("Details of Employee:");
        e1.display();
        e2.display();
    }
}
