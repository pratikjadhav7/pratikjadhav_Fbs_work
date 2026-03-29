import java.util.Scanner;
public class q1{
    public static void main(String args[]){
        int n;
        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");
    }
}