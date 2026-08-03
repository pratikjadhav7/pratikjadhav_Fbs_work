package springframeworkdemo;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

	public StudentRepository() {
		System.out.println("Repo ka obj bana");
	}
	
	public void repo() {
		System.out.println("Repo is Working");
	}
}
