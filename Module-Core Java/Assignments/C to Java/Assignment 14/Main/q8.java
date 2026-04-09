import java.util.*;
class Distance{
    int feet,inch;
}
public class q8{
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("feet");
        d1.feet=sc.nextInt();
        System.out.println("inch");
        d1.inch=sc.nextInt();
        System.out.println("feet");
        d2.feet=sc.nextInt();
        System.out.println("inch");
        d2.inch=sc.nextInt();

          System.out.println("feet "+d1.feet);
          System.out.println("inch " +d1.inch);
          System.out.println("feet "+d2.feet);
          System.out.println("inch " +d2.inch);
    }
}