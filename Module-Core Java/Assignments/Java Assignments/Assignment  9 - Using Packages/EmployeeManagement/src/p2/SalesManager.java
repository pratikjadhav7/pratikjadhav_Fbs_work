package p2;

import p1.Employee;

public class SalesManager extends Employee {
      double incentive,target;
	public SalesManager(int id,String name,double salary,double incentive,double target) {
		super(id,name,salary);
		this.incentive=incentive;
		this.target=target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public double getTarget() {
		return target;
	}
	public void setTarget(double target) {
		this.target = target;
	}
	
	public double calSal() {
		return salary+incentive;
	}
	@Override
	public String toString() {
		return "\nSalesManager ->"+super.toString() +" Incentive: "+ incentive + " Target: " + target;	
	}
}
