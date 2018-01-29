package ua.killok.dao.util;

import org.hibernate.Session;
/*
 *SessionFactory for hibernateSession management
 */
public class DAOSessionFactory {
	
	private Session session;
	
	public DAOSessionFactory() {}
	
	/*
	 * Returns current hibernate Session for data access
	 * @return session
	 */
	public  Session getSession() {
		if(session==null||!session.isOpen()) {
			session = HibernateUtil.getSessionFactory().openSession();
		}
		return session;
	}
	
	
	
	/*
	 * This method was generated automatically so I don know why i saved it here and I can't advice you to use it)
	 * @param session - new session object which you want to use, but i can't realize where did you find this 
	 */
	public void setSession(Session session) {
		this.session = session;
	}
	
	/*
	 * Returns new hibernate Session for data access
	 * close current session if exists
	 * @return session
	 */
	public Session openSession() {
		if(session!=null&&session.isOpen())session.close();
		this.session = HibernateUtil.getSessionFactory().openSession();
		return session;
	}
	
	/*
	 * Let the Session END
	 */
	public void closeSession() {
		if(session!=null) {
			session.close();
		}
	}
	
}
