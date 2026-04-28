
class PlacedStudent {

    String name, companyName, designation;
    int frn;
    double distanceCovered;

    PlacedStudent() {
        this.name = "Pratik";
        this.companyName = "TCS";
        this.designation = "abcd";
        this.frn = 5;
        this.distanceCovered = 23;
    }

    PlacedStudent(String name, String companyName, String designation, int frn, double distanceCovered) {
        this.name = name;
        this.companyName = companyName;
        this.designation = designation;
        this.frn = frn;
        this.distanceCovered = distanceCovered;
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

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    void setDesignation(String desig) {
        this.designation = desig;
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

    String getCompanyName() {
        return this.companyName;
    }

    String getDesignation() {
        return this.designation;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " FRN : " + this.frn + "Distance Covered : " + this.distanceCovered + "Company Name : " + this.companyName +"Designation:" + this.designation;
    }

    
}

public class q3 {

    public static void main(String[] args) {
        PlacedStudent s1 = new PlacedStudent();
        PlacedStudent s2 = new PlacedStudent();
        PlacedStudent s3 = new PlacedStudent();
        PlacedStudent s4 = new PlacedStudent("Divya", "Wipro", "xyz", 18, 100);

        s1.setName("Snehal");
        s1.setFrn(5);
        s1.setDistanceCovered(2);
        s1.setCompanyName("TCS");
        s1.setDesignation("abcd");
        s2.setName("Chetan");
        s2.setFrn(10);
        s2.setDistanceCovered(5);
        s2.setCompanyName("Microsoft");
        s2.setDesignation("xyz");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
