
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

    void setDistanceCovered(int disCov) {
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

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("FRN : " + this.frn);
        System.out.println("Distance Covered : " + this.distanceCovered);
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
        s2.setDistanceCovereqd(5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
