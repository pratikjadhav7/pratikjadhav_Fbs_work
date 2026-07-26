package demohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Employee emp = new Employee(101,"Divya",35000,"Kolhapur");
		emp.setMobNo(1234);
		Transaction tx = session.beginTransaction();
//		session.persist(emp);
		
		session.merge(emp);
		
//		Employee emp = session.get(Employee.class, 101);
		System.out.println(emp);
		tx.commit();
		
	}
}
