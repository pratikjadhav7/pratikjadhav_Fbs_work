import java.util.*;
class Time{
    int hrs,min,sec;
}
public class q7{
    public static void main(String[] args) {
        Time d1 = new Time();
        Time d2 = new Time();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hrs");
        d1.hrs=sc.nextInt();
        System.out.println("Mins");
        d1.min=sc.nextInt();
        System.out.println("Secs");
        d1.sec=sc.nextInt();
        System.out.println("Hrs");
        d2.hrs=sc.nextInt();
        System.out.println("Mins");
        d2.min=sc.nextInt();
        System.out.println("Secs");
        d2.sec=sc.nextInt();

          System.out.println("Hrs "+d1.hrs);
          System.out.println("Mins" +d1.min);
          System.out.println("Secs "+d1.sec);
          System.out.println("Hrs "+d2.hrs);
          System.out.println("Mins " +d2.min);
          System.out.println("Secs "+d2.sec);
    }
}