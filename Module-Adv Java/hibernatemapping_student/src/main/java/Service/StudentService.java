package Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Model.Batch;
import Model.Student;
import hibernatemapping1.HibernateConfig;

public class StudentService {

	public Student addStudent(Student student) {

	    Session session = HibernateConfig.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();

	    Batch batch = session.get(Batch.class, student.getBatch().getBatchId());

	    student.setBatch(batch);

	    session.persist(student);

	    tx.commit();

	    session.close();

	    return student;
	}

	public List<Student> getAllStudents() {
	    Session session = HibernateConfig.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();

	    
	   List<Student> list = session.createQuery("from Student",Student.class).getResultList();

	    tx.commit();

	    session.close();

	    return list;
	}

}
