
class SalesManager {

    String name;
    int id;
    double salary;
    double incentive;
    double target;

    SalesManager() {
        this.name = "Divya";
        this.id = 2;
        this.salary = 65000;
        this.incentive = 1000;
        this.target = 150;
    }

    SalesManager(String name, int id, double salary, double incentive, double target) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
    }

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    void setTarget(double target) {
        this.target = target;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    double getSalary() {
        return this.salary;
    }

    double getIncentive() {
        return this.incentive;
    }

    double getTarget() {
        return this.target;
    }

    @Override
    public String toString() {
        return "Name: " + this.name+" ID: " + this.id+" Salary: " + this.salary+" incentive: " + this.incentive+" Target: " + this.target;
    }
    
}

public class q6 {

    public static void main(String[] args) {
        SalesManager e1 = new SalesManager();
        SalesManager e2 = new SalesManager();
        SalesManager e3 = new SalesManager();
        SalesManager e4 = new SalesManager("Chetan",4,40000,15000,100);

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e1.setIncentive(4000);
        e1.setTarget(40);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);
        e2.setIncentive(5000);
        e2.setTarget(50);

       System.out.println(e1.toString());
       System.out.println(e2.toString());
       System.out.println(e3.toString());
       System.out.println(e4.toString());
    }
}
