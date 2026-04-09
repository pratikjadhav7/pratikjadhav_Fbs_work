class Admin{
    int id;
    String name;
    float salary;
    float allowance;

    void setID(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setSalary(float salary){
        this.salary=salary;
    }
    void setAllowance(float allowance){
         this.allowance=allowance;
    }

    int getID(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    float getSalary(){
        return this.salary;
    }
    float allowance(){
        return this.allowance;
    }

    void display(){
        System.out.println("Admin ID:"+this.id);
        System.out.println("Admin Name:"+this.name);
        System.out.println("Admin Salary:"+this.salary);
        System.out.println("Admin Allowance:"+this.allowance);
    }
}
public class q3{
    public static void main(String[] args) {
        Admin a1=new Admin();
        Admin a2=new Admin();
  
        System.err.println("Enter Details For Admin");
        
        a1.setID(1);
        a1.setName("Pratik");
        a1.setSalary(23434);
        a1.setAllowance(232);
        a1.setID(2);
        a2.setName("Chetan");
        a2.setSalary(59004);
        a2.setAllowance(2900);
        

        System.out.println("Details Of Admin");
        a1.display();
        a2.display();
    }
}