package ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Employee implements Comparable<Employee>{
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
	public int compareTo(Employee e) {
		return this.id-e.id;
		
		//return this.name.compareTo(e.name);
	}
	
	@Override
	public boolean equals(Object obj) {

	    Employee e = (Employee)obj;

	    return this.id == e.id &&
	           this.name.equals(e.name) &&
	           this.salary == e.salary;
	}
	
}
public class Comparable_sorting {

    public static void main(String [] args) {
    	
    	ArrayList<Employee> a = new ArrayList<Employee>();
    	
    	a.add(new Employee(101,"Pratik",30000));
    	a.add(new Employee(99,"Snehal",35000));
    	a.add(new Employee(105,"Mahesh",40000));
    	a.add(new Employee(103,"Chetan",30000));
    	a.add(new Employee(102,"Divya",30000));
    	    	
    	System.out.println(a);
    	
    	Collections.sort(a);
    	
    	System.out.println(a);
    	
    	System.out.println(a.contains(new Employee(101,"Pratik",30000)));
    }
}
