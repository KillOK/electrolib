package ua.killok.dao.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*
 * Class for hibernateSessioFactory management
 */
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() {}
	
	static {configureSessionFactory();}
	
	public static void configureSessionFactory(){sessionFactory = new Configuration().configure().buildSessionFactory();}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void closeSessionFactory(){
		if(!HibernateUtil.getSessionFactory().isClosed())HibernateUtil.getSessionFactory().close();
	}
	
	
}
