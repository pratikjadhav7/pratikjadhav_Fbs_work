package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Student;

public class HibernateConfig {

	private  static SessionFactory sf;
	static {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		
		 sf = config.buildSessionFactory();
	}
	
	public  static SessionFactory getSessionFactory() {
		return sf;
	}
}
