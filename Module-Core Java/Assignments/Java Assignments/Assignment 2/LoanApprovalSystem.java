

class Bank{
    void approveLoan(Student s){
        if(s.percentage>80)
            System.out.println("Loan Ammount:200000");
        
        else if(s.percentage<=80 && s.percentage>=60)
            System.out.println("100000");
        
        else if(s.percentage<60 && s.percentage>=40)
            System.out.println("50000");
        
        else
            System.out.println("No Loan Approved");
        
    }
    void approveLoan(Employee e){
      if(e.salary>1200000)
      System.out.println("Loan Ammounr:700000");
      else if(e.salary>1000000 && e.salary<=1200000)
      System.out.println("Loan Ammount:600000");
      else if(e.salary>600000&&e.salary<=1000000)
      System.out.println("Loan Ammount:500000");
      else if(e.salary>400000 && e.salary<=600000)
      System.out.println("Loan Ammount:400000");
      else
      System.out.println("No Loan Approved");
    }

}


class Student {

    String name;
    int rollNo;
    double percentage;

    Student(String name, int rollNo, double  percentage) {

        this.name=name;
        this.rollNo=rollNo;
        this.percentage=percentage;
    }
}
class Employee{
    int id;
    String name;
    double salary;

    Employee(String name,int id,double salary){
      this.name=name;
      this.id=id;
      this.salary=salary;
    }
}

public class LoanApprovalSystem {

    public static void main(String[] args) {
        Bank b=new Bank();
        Student s= new Student("Pratik",5,90);
        Employee e = new Employee("Chetan",10,500000);

        b.approveLoan(e);
        b.approveLoan(s);


    }

}
