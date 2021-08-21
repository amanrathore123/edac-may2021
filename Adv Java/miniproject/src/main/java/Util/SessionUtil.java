package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

private static SessionFactory sessionFactory;
	
	private SessionUtil() {
	}
	
	public static SessionFactory getFactory() {
		
		if(sessionFactory==null || sessionFactory.isClosed()) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} 
		return sessionFactory;		
	}
	
	public void closeFactory() {
		if(sessionFactory!=null || sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
}
