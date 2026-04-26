
class Employee {

    int id;
    String name;
    double salary;

    public Employee() {
        this.id = 0;
        this.name = "Not Given";
        this.salary = 00;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setID(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

}

class Admin extends Employee {

    double allowance;

    public Admin() {
        super();
        this.allowance = 00;
    }

    public Admin(double allowance, int id, String name, double salary) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    double getAllowance() {
        return this.allowance;
    }

    void display() {
        System.out.println("----- Admin Department ------");
        super.display();
        System.out.println("Alowance: " + allowance);
    }
}

class SalesManager extends Employee {

    double incentive, target;

    public SalesManager() {
        super();
        this.incentive = 00;
        this.target = 00;
    }

    public SalesManager(double incentive, double target, int id, String name, double salary) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    void setTarget(double target) {
        this.target = target;
    }

    double getIncentive() {
        return this.incentive;
    }

    double getTarget() {
        return this.target;
    }

    void display() {
        System.out.println("-----SalesManager Department-----");
        super.display();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee {

    double commision;

    public HR() {
        super();
        this.commision = 00;
    }

    public HR(double commision, int id, String name, double salary) {
        super(id, name, salary);
        this.commision = commision;
    }

    void setCommission(double commission) {
        this.commision = commission;
    }

    double getCommission() {
        return this.commision;
    }

    void display() {
        System.out.println("-----HR Department----");
        super.display();
        System.out.println("Commission: " + commision);
    }
}

public class EmployeeHierarchy {

    public static void main(String[] args) {
        Admin a = new Admin(2000, 1, "Pratik", 40000);
        a.display();

        Admin a2 = new Admin();
        a2.id=(101);
        a2.setName("Mahesh");
        a2.setAllowance(1200);
        a2.setSalary(40000);
        a2.display();
        SalesManager sm = new SalesManager(4000, 20000, 3, "Snehal", 30000);
        sm.display();

        HR h = new HR(1000, 5, "Chetan", 35000);
        h.display();
    }
}
