class Employee{
    String name;
    int id;
    double salary;

     Employee() {
        this.name="Pratik";
        this.id=2;
        this.salary=45000;
    }

     Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
    }
}
public class q4{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("Snehal",3,50000);

        e1.display();
        e2.display();
    }
}