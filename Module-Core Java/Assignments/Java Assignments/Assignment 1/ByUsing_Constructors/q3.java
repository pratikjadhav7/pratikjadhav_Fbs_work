class PlacedStudent{
    String name,companyName,designation;
    int frn;
    double distanceCovered;

     PlacedStudent() {
         this.name="Pratik";
         this.companyName="TCS";
         this.designation="abcd";
         this.frn=5;
         this.distanceCovered=23;
    }

  PlacedStudent(String name, String companyName, String designation, int frn, double distanceCovered) {
        this.name = name;
        this.companyName = companyName;
        this.designation = designation;
        this.frn = frn;
        this.distanceCovered = distanceCovered;
    }
    
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("FRN : "+this.frn);
        System.out.println("Distance Covered : "+this.distanceCovered);
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Designation : "+this.designation);
    }
}
public class q3{
    public static void main(String[] args) {
        PlacedStudent s1=new PlacedStudent();
        PlacedStudent s2=new PlacedStudent("Snehal","Google","xyz",18,100);

        s1.display();
        s2.display();
    }
}