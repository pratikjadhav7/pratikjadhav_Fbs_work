package springframeworkdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	//	ApplicationContext appcon = new ClassPathXmlApplicationContext("appcontext.xml");
		
		ApplicationContext appcon = new AnnotationConfigApplicationContext(AppContext.class);
		
		StudentController  sc= appcon.getBean("studentController",StudentController.class);
		sc.test();
	}
}
