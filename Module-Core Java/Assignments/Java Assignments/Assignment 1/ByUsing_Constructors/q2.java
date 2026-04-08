class Student{
    String name;
    int frn;
    double distanceCovered;

   Student(){
    this.name="Pratik";
    this.frn=5;
    this.distanceCovered=23;
   }
   Student(String name,int frn,int dis){
    this.name=name;
    this.frn=frn;
    this.distanceCovered=dis;
   }
     void display(){
        System.out.println("Name : "+this.name);
        System.out.println("FRN : "+this.frn);
        System.out.println("Distance Covered : "+this.distanceCovered);
    }
}
public class q2{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Chetan",10,40);


        s1.display();
        s2.display();
    }
}