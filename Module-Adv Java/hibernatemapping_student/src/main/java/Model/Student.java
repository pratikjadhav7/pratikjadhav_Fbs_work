package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	String frn;
	String name;
	
	@OneToOne (cascade = CascadeType.ALL)
	Address address;
	
	@ManyToOne
	Batch batch;
	
	
	public Student(String frn, String name, Address address, Batch batch) {
		super();
		this.frn = frn;
		this.name = name;
		this.address = address;
		this.batch = batch;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getFrn() {
		return frn;
	}
	public void setFrn(String frn) {
		this.frn = frn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", name=" + name + ", address=" + address + ", batch=" + batch + "]";
	}
	
	
}
