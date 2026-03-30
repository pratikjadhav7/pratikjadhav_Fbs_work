import java.util.*;
public class q2{
    public static void main(String[] args) {
        int s1,s2,s3;

        System.out.print("Enter Three Sides Of Triangle:");
        Scanner sc = new Scanner(System.in);
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();

        if(s1==s2 && s2==s3 && s3==s1)
        System.out.print("Equilateral Triangle");
        else if(s1==s2 || s2==s3 || s3==s1)
        System.out.print("Isoceles Trinagle");
        else
        System.out.print("Scalen Triangle");
   }
}