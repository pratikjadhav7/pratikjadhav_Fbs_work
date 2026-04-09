
import java.util.*;

class HR {

    int id;
    String name;
    int salary;
    float commission;
}

public class q4 {

    public static void main(String[] args) {
        HR h1 = new HR();
        HR h2 = new HR();

        Scanner sc = new Scanner(System.in);

        System.out.println("HR ID");
        h1.id = sc.nextInt();
        System.out.println("HR name");
        h1.name = sc.next();
        System.out.println("HR salary");
        h1.salary = sc.nextInt();
        System.out.println("HR commision");
        h1.commission = sc.nextFloat();

        System.out.println("HR ID");
        h2.id = sc.nextInt();
        System.out.println("HR name");
        h2.name = sc.next();
        System.out.println("HR salary");
        h2.salary = sc.nextInt();
        System.out.println("HR commision");
        h2.commission = sc.nextFloat();

        System.out.println("Admin ID" + h1.id);
        System.out.println("Admin name" + h1.name);
        System.out.println("Admin salary" + h1.salary);
        System.out.println("Admin allowance" + h1.commission);
        System.out.println("Admin ID" + h2.id);
        System.out.println("Admin name" + h2.name);
        System.out.println("Admin salary" + h2.salary);
        System.out.println("Admin allowance" + h2.commission);

    }
}
