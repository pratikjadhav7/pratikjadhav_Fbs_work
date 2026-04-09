import java.util.*;
class Admin{
    int id;
    String name;
    int salary;
    float allowance;
}
public class q3{
    public static void main(String[] args) {
        Admin a1=new Admin();
        Admin a2=new Admin();

        Scanner sc = new Scanner(System.in);

        System.out.println("Admin ID");
        a1.id=sc.nextInt();
        System.out.println("Admin name");
        a1.name=sc.next();
        System.out.println("Admin salary");
        a1.salary=sc.nextInt();
        System.out.println("Admin allowance");
        a1.allowance=sc.nextFloat();

        System.out.println("Admin ID");
        a2.id=sc.nextInt();
        System.out.println("Admin name");
        a2.name=sc.next();
        System.out.println("Admin salary");
        a2.salary=sc.nextInt();
        System.out.println("Admin allowance");
        a2.allowance=sc.nextFloat();

    }
}