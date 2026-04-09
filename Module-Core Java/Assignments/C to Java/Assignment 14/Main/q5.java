
import java.util.*;

class SalesManager {

    int id;
    String name;
    int salary;
    float incentive;
    float target;
}

public class q5 {

    public static void main(String[] args) {
        SalesManager h1 = new SalesManager();
        SalesManager h2 = new SalesManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Sales Manager ID");
        h1.id = sc.nextInt();
        System.out.println("Sales Manager name");
        h1.name = sc.next();
        System.out.println("Sales Manager salary");
        h1.salary = sc.nextInt();
        System.out.println("Sales Manager commision");
        h1.incentive = sc.nextFloat();
        System.out.println("Sales Manager target");
        h1.target = sc.nextFloat();

        System.out.println("Sales Manager ID");
        h2.id = sc.nextInt();
        System.out.println("Sales Manager name");
        h2.name = sc.next();
        System.out.println("Sales Manager salary");
        h2.salary = sc.nextInt();
        System.out.println("Sales Manager commision");
        h2.incentive = sc.nextFloat();
        System.out.println("Sales Manager target");
        h2.target = sc.nextFloat();

        System.out.println("Sales Manager ID" + h1.id);
        System.out.println("Sales Manager name" + h1.name);
        System.out.println("Sales Manager salary" + h1.salary);
        System.out.println("Sales Manager allowance" + h1.incentive);
        System.out.println("Sales Manager target" + h1.target);
        System.out.println("Sales Manager ID" + h2.id);
        System.out.println("Sales Manager name" + h2.name);
        System.out.println("Sales Manager salary" + h2.salary);
        System.out.println("Sales Manager allowance" + h2.incentive);
        System.out.println("Sales Manager target" + h2.target);
    }
}
