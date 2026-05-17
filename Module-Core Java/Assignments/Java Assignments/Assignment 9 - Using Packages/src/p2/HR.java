package p2;

import p1.Employee;

public class HR extends Employee {
     double commission;
	public HR(int id,String name,double salary,double commission) {
		super(id,name,salary);
		this.commission=commission;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double calSal() {
		return salary+commission;
	}
    
	public String toString() {
		return "\nHR -> "+super.toString() +" Commission: "+this.commission+
				"Total Salary: "+calSal();
	}
	
}
