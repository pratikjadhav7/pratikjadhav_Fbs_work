package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class Test {


    public static void main(String[] args) {
	Employee[] employees= {
			new HR(101,"Snehal",40000,3000),
			new Admin(102,"Pratik",30000,2000),
			new SalesManager(103,"Mahesh",35000,3000,30)
	};
	
	for(Employee emp: employees) {
		emp.calSal();
		System.out.println(emp);
	}
}
}
