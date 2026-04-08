class HR{
    String name;
    int id;
    double salary;
    double comminsion;

     HR() {
        this.name="Pratik";
        this.id=1;
        this.salary=65761;
        this.comminsion=500;
    }

    public HR(String name, int id, double salary, double comminsion) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.comminsion = comminsion;
    }

    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Commision: "+this.comminsion);
    }
}
public class q5{
    public static void main(String[] args) {
        HR e1=new HR();
        HR e2=new HR("Snehal",2,45000,400);

        e1.display();
        e2.display();
    }
}