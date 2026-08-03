package springframeworkdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	
	

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public StudentService() {
		System.out.println("Student Service ka obj bana");
	}
	
	public void demo() {
		System.out.println("StudentService is Working!");
		studentRepository.repo();
	}
}
