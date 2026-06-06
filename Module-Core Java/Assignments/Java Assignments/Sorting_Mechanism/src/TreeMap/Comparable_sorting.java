package TreeMap;

import java.util.*;

class Mykey implements Comparable<Mykey>{
	int key;

	public Mykey(int key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "Mykey key=" + key;
	}
	
	public int compareTo(Mykey k) {
		return this.key-k.key;
	}
	
}
class Employee{
	int id;
	String nameString;
	double salary;
	public Employee(int id, String nameString, double salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee id=" + id + ", nameString=" + nameString + ", salary=" + salary;
	}
	
	
	
}
public class Comparable_sorting {

	public static void main(String[]args) {
		
		TreeMap<Mykey,Employee> tm = new TreeMap<Mykey,Employee>();
		
		tm.put(new Mykey(101),new Employee(101,"Pratik",20000));
		tm.put(new Mykey(100),new Employee(100,"Chetan",10000));
		tm.put(new Mykey(105),new Employee(105,"wertyu",25000));
		tm.put(new Mykey(99),new Employee(99,"ettyy",40000));
		tm.put(new Mykey(90),new Employee(90,"defrg",35000));
		
		System.out.println(tm);
		
		System.out.println(tm.containsKey(new Mykey(101)));
		
		
	}
}
