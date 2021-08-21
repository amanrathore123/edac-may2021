package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pojo.Admin;

public class RegisterService {

	public static boolean register(Admin admin) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Query query = session.createQuery("from Admin where email = :em ");
		query.setParameter("em", admin.getEmail());
	
		List<Admin> adminList = query.getResultList();
		
		if (adminList == null || adminList.isEmpty()) {
			Transaction tx = session.beginTransaction();
			session.save(admin);
			tx.commit();
			session.close();
			return true;
		} else
			return false;

	}

}
