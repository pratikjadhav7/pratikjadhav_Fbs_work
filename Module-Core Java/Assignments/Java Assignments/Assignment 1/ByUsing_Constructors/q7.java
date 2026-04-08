
class Admin {

    String name;
    int id;
    double salary;
    double allowance;

     Admin() {
      this.name="Pratik";
      this.id=1;
      this.salary=12000;
      this.allowance=1800;
    }

     Admin(String name, int id, double salary, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.allowance = allowance;
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
        Admin e2 = new Admin("Snehal",2,25000,2500);


        e1.display();
        e2.display();
    }
}
