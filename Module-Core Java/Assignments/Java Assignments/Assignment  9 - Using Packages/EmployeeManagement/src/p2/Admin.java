package p2;

import p1.Employee;

public class Admin extends Employee {
    double allowance;
	public Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		
		this.allowance=allowance;
	}
	
  public  double calSal() {
    	return salary+allowance;
    }

  public String toString() {
	  return "\nAdmin -> "+super.toString()+" Allowance: "+this.allowance;
  }
}
