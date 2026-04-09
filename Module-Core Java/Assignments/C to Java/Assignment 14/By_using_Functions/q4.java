
class HR {

    int id;
    String Name;
    float salary;
    float commission;

    void setID(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.Name = name;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    void setCommission(float com) {
        this.commission = com;
    }

    int getID(){
        return this.id;
    }
    String getName(){
        return this.Name;
    }
    float getSalary(){
        return this.salary;
    }
    float getCommission(){
        return this.commission;
    }

    void display(){
        System.out.println("ID:"+this.id);
        System.out.println("Name:"+this.Name);
        System.out.println("Salary:"+this.salary);
        System.out.println("Commission:"+this.commission);
    }
}
public class q4{
    public static void main(String[] args) {
        HR h1=new HR();
        HR h2=new HR();

        h1.setID(1);
        h1.setName("Pratik");
        h1.setSalary(23433);
        h1.setCommission(200);
        h2.setID(2);
        h2.setName("Snehal");
        h2.setSalary(92343);
        h2.setCommission(300);

        h1.display();
        h2.display();
    }
}