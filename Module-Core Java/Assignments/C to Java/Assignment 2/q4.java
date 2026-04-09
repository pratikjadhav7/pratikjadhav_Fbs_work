import java.util.*;
public class q4{
    public static void main(String[] args) {
        int marks;
        System.out.print("Enter Marks:");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks>=75)
        System.out.println("Distinction");
        else if(marks>=65 && marks<75)
        System.out.println("First Class");
        else if(marks>=55 && marks<65)
        System.out.println("Second Class");
        else if(marks>=40 && marks<55)
        System.out.println("Pass Class");
        else if(marks<40)
        System.out.println("Fail");
        else
        System.out.println("Enter Valid Marks");
    }
}