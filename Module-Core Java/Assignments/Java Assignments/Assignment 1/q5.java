class HR{
    String name;
    int id;
    double salary;
    double comminsion;

    void setName(String name){
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    void setCommision(double commision){
        this.comminsion=commision;
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
    double getCommision(){
        return this.comminsion;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Commision: "+this.comminsion);
    }
}
public class q5{
    public static void main(String[] args) {
        HR e1=new HR();
        HR e2=new HR();

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
    }
}