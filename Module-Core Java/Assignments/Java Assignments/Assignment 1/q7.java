
class Admin {

    String name;
    int id;
    double salary;
    double allowance;

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
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

    double getAllowance() {
        return this.allowance;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("allowance: " + this.allowance);
    }
}

public class q7 {

    public static void main(String[] args) {
        Admin e1 = new Admin();
        Admin e2 = new Admin();

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e1.setAllowance(1400);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);
        e2.setAllowance(1100);

        e1.display();
        e2.display();
    }
}
