
class Student {

    String name;
    int frn;
    double distanceCovered;

    Student() {
        this.name = "Pratik";
        this.frn = 5;
        this.distanceCovered = 23;
    }

    Student(String name, int frn, int dis) {
        this.name = name;
        this.frn = frn;
        this.distanceCovered = dis;
    }

    void setName(String name) {
        this.name = name;
    }

    void setFrn(int frn) {
        this.frn = frn;
    }

    void setDistanceCovered(double  disCov) {
        this.distanceCovered = disCov;
    }

    String getName() {
        return this.name;
    }

    int getFrn() {
        return this.frn;
    }

    double getDistanceCovered() {
        return this.distanceCovered;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+" FRN: "+this.frn+" Distance Covered: "+this.distanceCovered;
    }

    
}

public class q2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student("Snehal",10,40);

        s1.setName("Divya");
        s1.setFrn(5);
        s1.setDistanceCovered(2);
        s2.setName("Chetan");
        s2.setFrn(10);
        s2.setDistanceCovered(5);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
