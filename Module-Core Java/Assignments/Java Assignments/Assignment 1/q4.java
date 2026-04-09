class Employee{
    String name;
    int id;
    double salary;

    void setName(String name){
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
    double getSalary(){
        return this.salary;
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
        Employee e2=new Employee();

        e1.setName("Partik");
        e1.setId(1);
        e1.setSalary(40000);
        e2.setName("Snehal");
        e2.setId(2);
        e2.setSalary(45000);

        e1.display();
        e2.display();
    }
}