package HashSet;

import java.util.*;


class Employee implements Comparable<T>{
	String name;
	int id;
	double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", id=" + id + ", sal=" + sal;
	}
	@Override
	public int hashCode() {
	    return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {

	    Employee e = (Employee)obj;

	    return this.id == e.id;
	}


}
public class Comparator_sorting {
 
	 public static void main(String[]args) {
		 HashSet h = new HashSet();
		 
		 h.add(new Employee("Pratik",101,30000));
		 h.add(new Employee("Mahesh",155,40000));
		 h.add(new Employee("Chetan",100,35000));
		 h.add(new Employee("Snehal",99,45000));
		 
		 System.out.println(h);
		 
		 System.out.println(h.contains(new Employee("Pratik",101,30000)));
		 
		 
		 
	 }
}
