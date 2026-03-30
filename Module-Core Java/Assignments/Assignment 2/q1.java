import java.util.*;
public class q1{
    public static void main(String args[]){
        char op;
        int n1,n2;
        float res=0;
        System.out.print("Enter 1st Num::");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();

        System.out.print("Enter 2nd Num:");
        n2=sc.nextInt();

        System.out.println("Enter Operator:");
        op=sc.next().charAt(0);

        if(op=='+')
            res=n1+n2;
        else if(op=='-')
        res=n1-n2;
        else if(op=='/')
        res=(float)n1/n2;
        else if(op=='%')
        res=(float)n1%n2;
        else if(op=='*')
        res=n1*n2;
        else
        System.out.println("Invalid!");

        System.out.printf("Result:%f",res);
    }
}