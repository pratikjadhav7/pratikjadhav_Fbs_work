package Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import DTO.BatchDTO;
import hibernatemapping1.HibernateConfig;

public class BatchService {

	public List<BatchDTO> getBatchDetails() {
		Session session = HibernateConfig.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

	
		List<BatchDTO> list = session.createQuery("select new DTO.BatchDTO(batchId,batchName) from Batch",BatchDTO.class).getResultList();
		
	

		tx.commit();
		
		return list;
	}
}
