package springframeworkdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	public StudentService getStudentService() {
		return studentService;
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public StudentController() {
		System.out.println("StudentController ka obj bana");
	}
	public void test() {
		studentService.demo();
		System.out.println("Student Controller working");
	}
}
