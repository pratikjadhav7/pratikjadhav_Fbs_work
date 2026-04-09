
class HR {

    String name;
    int id;
    double salary;
    double comminsion;

    HR() {
        this.name = "Chetan";
        this.id = 1;
        this.salary = 65761;
        this.comminsion = 500;
    }

    public HR(String name, int id, double salary, double comminsion) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.comminsion = comminsion;
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

    void setCommision(double commision) {
        this.comminsion = commision;
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

    double getCommision() {
        return this.comminsion;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Commision: " + this.comminsion);
    }
}

public class q5 {

    public static void main(String[] args) {
        HR e1 = new HR();
        HR e2 = new HR();
        HR e3 = new HR();
        HR e4 = new HR("Divya",2,45000,400);

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e1.setCommision(500);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);
        e2.setCommision(400);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
