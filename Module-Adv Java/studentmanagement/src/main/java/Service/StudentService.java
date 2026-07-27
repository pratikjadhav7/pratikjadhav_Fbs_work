package Service;

import java.util.List;

import Model.Student;
import Repository.StudentRepository;

public class StudentService {

	StudentRepository studentRepo = new StudentRepository();
	public boolean addStudent(Student student){
		
		return studentRepo.addStudent(student);
	}
	public Student searchStudentByRollNo(int rollno) {
		
		return studentRepo.searchStudentByRollNo(rollno);
	}
	public List<Student> displayAllStudents() {
		
	return	studentRepo.displayAllStudents();
		
	}
}
