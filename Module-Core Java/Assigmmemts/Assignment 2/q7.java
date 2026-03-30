import java.util.*;
public class q7{
    public static void main(String[] args) {
      int age;
      
      System.out.print("Enter Your Age:");
      Scanner sc = new Scanner(System.in);
      age = sc.nextByte();

      if(age<=12)
      System.out.print("Child");
      else if(age>12 && age<=19)
      System.out.print("Teenager");
      else if(age>=20 && age<=59)
      System.out.print("Adult");
      else
      System.out.print("Senior");

    }
}