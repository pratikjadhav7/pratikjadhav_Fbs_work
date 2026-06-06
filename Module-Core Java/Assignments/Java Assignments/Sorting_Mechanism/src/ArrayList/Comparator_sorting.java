package ArrayList;


import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SortByName implements Comparator<Employee>{
	
	public int compare(Employee o1,Employee o2) {
		return o1.name.compareTo(o2.name);
		//return Double.compare(o1.salary,o2.salary);
	}
	
}

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary;
	}
	
	@Override
	public boolean equals(Object obj) {

	    Employee e = (Employee)obj;

	    return this.id == e.id &&
	           this.name.equals(e.name) &&
	           this.salary == e.salary;
	}
	
	
}
public class Comparator_sorting {

    public static void main(String [] args) {
    	
    	ArrayList<Employee> a = new ArrayList<Employee>();
    	
    	a.add(new Employee(101,"Pratik",30000));
    	a.add(new Employee(99,"Snehal",35000));
    	a.add(new Employee(105,"Mahesh",40000));
    	a.add(new Employee(103,"Chetan",30000));
    	a.add(new Employee(102,"Divya",30000));
    	
    	System.out.println(a);
    	
    	SortByName sbn = new SortByName();
    	
    	Collections.sort(a,sbn);
    	
    	System.out.println(a);
    	
    	System.out.println(a.contains(new Employee(99,"Snehal",35000)));
    	
    }
}
