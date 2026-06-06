package LinkedList;


import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class SortByName implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
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
	
	public boolean equals(Employee e) {
		return this.id==e.id&&this.name==e.name&&this.salary==e.salary;
	}
	
	
	
}
public class Comparator_sorting {

    public static void main(String [] args) {
    	
    	LinkedList<Employee> l = new LinkedList<Employee>();
    	
    	l.add(new Employee(101,"Pratik",30000));
    	l.add(new Employee(99,"Snehal",35000));
    	l.add(new Employee(105,"Mahesh",40000));
    	l.add(new Employee(103,"Chetan",30000));
    	l.add(new Employee(102,"Divya",30000));
    	
    	System.out.println(l);
    	
    	SortByName sbn = new SortByName();
    	
    	Collections.sort(l,sbn);
    	
    	System.out.println(l);
    	
    	System.out.println(l.contains(new Employee(99,"Snehal",35000)));
    	
    }
}
