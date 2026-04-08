
class SalesManager {

    String name;
    int id;
    double salary;
    double incentive;
    double target;

    SalesManager() {
       this.name="Pratik";
       this.id=2;
       this.salary=65000;
       this.incentive=1000;
       this.target=150;
    }

    SalesManager(String name, int id, double salary, double incentive, double target) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
    }
    
   

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("incentive: " + this.incentive);
        System.out.println("Target: " + this.target);
    }
}

public class q6 {

    public static void main(String[] args) {
        SalesManager e1 = new SalesManager();
        SalesManager e2 = new SalesManager("Snehal",4,40000,15000,100);


        e1.display();
        e2.display();
    }
}
