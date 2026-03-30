
import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        int age;
        System.err.print("Enter Age:");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();

        if(age>=18)
        System.out.println("Yes.You Are Eligible For Vote!");
        else
        System.out.println("Sorry.You Are Not Eligible For Vote!");
    }
}