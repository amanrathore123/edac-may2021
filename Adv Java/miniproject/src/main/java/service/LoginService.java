package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pojo.Admin;

public class LoginService {

	public static boolean login(Admin admin) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Query<Admin> query =  session.createQuery("from Admin where email = :em and password = :pw ");
		query.setParameter("em", admin.getEmail());
		query.setParameter("pw", admin.getPassword());
		
		List<Admin> adminList =  query.getResultList();
		
		for (Admin admin2 : adminList) {
			System.out.println("admin 1 :"+ admin2);
		}
		
		if(adminList == null || adminList.isEmpty())
			return false;
		
		String dbemail=adminList.get(0).getEmail();
		String dbpwd=adminList.get(0).getPassword();
		
		if(dbemail.equals(admin.getEmail()) && dbpwd.equals(admin.getPassword())) {
			return true;
		}
		
		return false;
	}
}
