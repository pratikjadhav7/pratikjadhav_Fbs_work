
import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter Char:");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
            System.out.println("Upper Case!");
        else if(ch>='a' && ch<='z')
            System.out.println("Lower Case!");
        else
        System.out.println("Invalid!");
   }

}