
class Employee {

    String name;
    int id;
    double salary;

     Employee() {
        this.name="Chetan";
        this.id=2;
        this.salary=45000;
    }

     Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    double getSalary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return "Name: " + this.name+" ID: " + this.id+" Salary: " + this.salary;
    }
    
}

public class q4 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee("Divya",3,50000);

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);

       System.out.println(e1.toString());
       System.out.println(e2.toString());
       System.out.println(e3.toString());
       System.out.println(e4.toString());
    }
}
