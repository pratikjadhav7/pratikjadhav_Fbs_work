import java.util.*;
class Student{
    int rollNo;
    String name;
    int marks;
}
public class q1{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Student Name:");
        s1.name=sc.next();
        System.out.println("Student RollNo:");
        s1.rollNo=sc.nextInt();
        System.out.println("Student Marks:");
        s1.marks=sc.nextInt();
       
        System.out.println("Student Name:");
        s2.name=sc.next();
        System.out.println("Student RollNo:");
        s2.rollNo=sc.nextInt();
        System.out.println("Student Marks:");
        s2.marks=sc.nextInt();
        
        System.out.println("Student Name: "+s1.name);
        System.out.println("Student RollNO: "+s1.rollNo);
        System.out.println("Student marks: "+s1.marks);
        System.out.println("Student Name: "+s2.name);
        System.out.println("Student RollNO: "+s2.rollNo);
        System.out.println("Student marks: "+s2.marks);

    }
}