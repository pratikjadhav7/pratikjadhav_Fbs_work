
class Employee {

    static double companyBonus;

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    static void updateBonus(double newBonus){
           companyBonus=newBonus;
    }

    double calculateSalary(){
       return  salary + (salary*companyBonus/100);
    }
    
    void displayTotalSalary(){
           System.out.println("Employee ID: "+this.id);
           System.out.println("Employee Name: "+this.name);
           System.out.println("Employee Salary: "+this.salary);
           System.out.println("Total Salary: "+calculateSalary());
    }
}

public class EmployeeSalarycalculation {

    public static void main(String[] args) {

            Employee.updateBonus(8);
             Employee e1=new Employee(1,"Partik",40000);
             Employee e2=new Employee(2,"Snehal",35000);
             e1.displayTotalSalary();
             e2.displayTotalSalary();

             Employee.updateBonus(10);
             Employee e3=new Employee(1,"Chetan",40000);
             Employee e4=new Employee(2,"Sanket",35000);
             e3.displayTotalSalary();
             e4.displayTotalSalary();

    }
}
