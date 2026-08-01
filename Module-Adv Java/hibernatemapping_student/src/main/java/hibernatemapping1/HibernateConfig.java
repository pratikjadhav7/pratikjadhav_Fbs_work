package hibernatemapping1;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Address;
import Model.Batch;
import Model.Student;

public class HibernateConfig {

	private static SessionFactory sf;
	static {
		
		try {
			Properties properties=new Properties();
			
			InputStream is = HibernateConfig.class.getClassLoader().getResourceAsStream("application.properties");
			properties.load(is);
			
			Configuration config = new Configuration();
			config.setProperties(properties);
			config.addAnnotatedClass(Student.class);
			config.addAnnotatedClass(Address.class);
			config.addAnnotatedClass(Batch.class);
			
			sf=config.buildSessionFactory();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public  static SessionFactory getSessionFactory() {
		return sf;
	}
}
