import  java.util.*;
class Stdents{
    int rollNo;
    String name;
    int marks;

    Scanner sc = new Scanner(System.in);

    void setName(String name){
        this.name=name;
    }
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    

    String getName(){
        return this.name;
    }
    int getrollNo(){
        return this.rollNo;
    }
    int getMarks(){
        return this.marks;
    }
    void display(){
        System.out.println("Student Name:"+this.name);
        System.out.println("Student RollNum:"+this.rollNo);
        System.out.println("Student Marks:"+this.marks);
    }
}
public class q1{
    public static void main(String[] args) {
        Stdents s1 = new Stdents();
        Stdents s2 = new Stdents();

        s1.setName("Pratik");
        s1.setRollNo(27);
        s1.setMarks(97);
        s2.setName("Chetan");
        s2.setRollNo(20);
        s2.setMarks(90);

        System.out.println("Details Of Student-1");
        s1.display();

        System.out.println("Details Of Student-2");
        s2.display();
    }
}