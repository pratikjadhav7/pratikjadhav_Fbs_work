
class Admin {

    String name;
    int id;
    double salary;
    double allowance;

    Admin() {
        this.name = "Pratik";
        this.id = 1;
        this.salary = 12000;
        this.allowance = 1800;
    }

    Admin(String name, int id, double salary, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.allowance = allowance;
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

    @Override
    public String toString() {
        return "Name: " + this.name+"ID: " + this.id+" Salary: " + this.salary+" Allowance: " + this.allowance;
    }
    
}

public class q7 {

    public static void main(String[] args) {
        Admin e1 = new Admin();
        Admin e2 = new Admin();
        Admin e3 = new Admin();
        Admin e4 = new Admin("Divya",2,25000,2500);

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e1.setAllowance(1400);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);
        e2.setAllowance(1100);

       System.out.println(e1.toString());
       System.out.println(e2.toString());
       System.out.println(e3.toString());
       System.out.println(e4.toString());
    }
}
