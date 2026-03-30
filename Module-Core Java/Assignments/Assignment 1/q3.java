
import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        int yr;
        System.out.print("Enter Year:");
        Scanner sc = new Scanner(System.in);
        yr=sc.nextInt();
        
        if(yr%4==0 && yr%100!=0 || yr%400==0){
            System.err.println("Leap Year!");
        }else{
            System.err.println("Not Leap Year!");
        }
    }
}