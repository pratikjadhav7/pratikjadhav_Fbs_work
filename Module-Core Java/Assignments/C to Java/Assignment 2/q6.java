import java.util.*;
public class q6{
    public static void main(String[] args) {
        int n;

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number:");
       n=sc.nextInt();

       if(n%3==0 && n%5==0)
       System.out.printf("%d is Divisible by Both!",n);
       else if(n%3==0 && n%5!=0)
       System.out.printf("%d is Divisible by 3!",n);
       else if(n%3!=0 && n%5==0)
       System.out.printf("%d is Divisible by 5!",n);
       else
       System.out.println("Not Divisible By Both!");
    }
}