package Model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Batch {

	@Id
	String batchId;
	String batchName;
	LocalTime time;
	
	@OneToMany(mappedBy = "batch")
	@JsonIgnore
	List<Student> students;

	public Batch(String batchId, String batchName, LocalTime time) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.time = time;
	}

	
	public Batch(String batchId, String batchName) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
	}


	public Batch() {
		// TODO Auto-generated constructor stub
	}
	
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", time=" + time + ", students=" + students
				+ "]";
	}
	
	
}
