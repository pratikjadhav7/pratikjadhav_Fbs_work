import java.util.*;
class Date{
    int day,mon,yr;
}
public class q6{
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Day");
        d1.day=sc.nextInt();
        System.out.println("Month");
        d1.mon=sc.nextInt();
        System.out.println("Year");
        d1.yr=sc.nextInt();
        System.out.println("Day");
        d2.day=sc.nextInt();
        System.out.println("Month");
        d2.mon=sc.nextInt();
        System.out.println("Year");
        d2.yr=sc.nextInt();

          System.out.println("Day "+d1.day);
          System.out.println("Month " +d1.mon);
          System.out.println("Year "+d1.yr);
          System.out.println("Day "+d2.day);
          System.out.println("Month " +d2.mon);
          System.out.println("Year "+d2.yr);
    }
}