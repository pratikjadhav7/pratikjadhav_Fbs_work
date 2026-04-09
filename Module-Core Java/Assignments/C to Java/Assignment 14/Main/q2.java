import java.util.*;
class Employee{
    int id;
    String Name;
    int salary;
}
public class q2{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee ID:");
        e1.id=sc.nextInt();
        System.out.println("Employee Name:");
        e1.Name=sc.next();
        System.out.println("Employee salary:");
        e1.salary=sc.nextInt();
       
        System.out.println("Employee ID:");
        e2.id=sc.nextInt();
        System.out.println("Employee Name:");
        e2.Name=sc.next();
        System.out.println("Employee salary:");
        e2.salary=sc.nextInt();
        
        System.out.println("Employee ID:"+e1.id);
        System.out.println("Employee Name:"+e1.Name);
        System.out.println("Employee salary:"+e1.salary);
        System.out.println("Employee ID:"+e2.id);
        System.out.println("Employee Name:"+e2.Name);
        System.out.println("Employee salary:"+e2.salary);

    }
}