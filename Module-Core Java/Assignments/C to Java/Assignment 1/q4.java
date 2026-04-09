
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        char ch;
        System.err.print("Enter Char:");
        Scanner sc=  new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U'){
            System.err.println("Vowel!");
        }else{
            System.err.println("Consonant!");
        }

    }
}