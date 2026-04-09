
class SalesManager {

    String name;
    int id;
    double salary;
    double incentive;
    double target;

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
    
    void setTarget(double target){
        this.target=target;
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
    double getTarget(){
        return this.target;
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
        SalesManager e2 = new SalesManager();

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

        e1.display();
        e2.display();
    }
}
