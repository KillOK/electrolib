package ua.killok.dao.dao.implementation;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import ua.killok.dao.dao.template.DAO;
import ua.killok.dao.model.interfaces.LibEntity;
import ua.killok.dao.util.DAOSessionFactory;

/**
 * 
 * Use this class if you need more then one DAO object on one page.
 * This class let you use only one Hibernate session for all objects on your page.
 *
 */
public class MultiDaoImpl implements DAO{
	
	private  Session session;
	
	/**
	 * @param session - HbernateSession for data management. 
	 * Use DAOSessionFactory().getSession() to create new session or MultiDaoImpl.getSession() if object with session already exists.
	 * You must close each session you use after work with object finish.
	 */
	public MultiDaoImpl(Session session) {
		this.session = session;
	}
	
	/**
	 * Remember to set or open session or correct work
	 */
	public MultiDaoImpl() {}
	
	/**
	 * @return existing hibernateSession for other MultiaoImpl objects
	 */
	public Session getSession() {
		return session;
	}
	
	/**
	 * @param session - HbernateSession for data management. Use DAOSessionFactory.getSession();
	 * you should close every used session after work finish
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public <T extends LibEntity> void add(T obj) throws SQLException {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
	}

	@Override
	public <T extends LibEntity> void update (T obj) throws SQLException {
		session.beginTransaction();
		session.update(obj);
		session.getTransaction().commit(); 
	}

	@Override
	public <T extends LibEntity> void delete (T obj) throws SQLException {
		session.beginTransaction();
		session.delete(obj);
		session.getTransaction().commit();
	}

	@Override
	public LibEntity get(int id, Class<? extends LibEntity> cl) throws SQLException {
		LibEntity result = null;
		result = session.load(cl, id);
		return result;
		
	}
	
	/**
	 * Method return you list of entities from data base 
	 * @param cl - entity class, list of which you want to get
	 * @return List of entities
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<? extends LibEntity> listObj(Class<? extends LibEntity> cl) throws SQLException {
		List<? extends LibEntity> list = session.createCriteria(cl).list();
		return list;
	}
	
	/**
	 * Session management methods
	 */
	public void openNewSession() {
		session = new DAOSessionFactory().getSession();
	}
	
	/**
	 * Ensure that other objects don't use current session
	 */
	public void closeSession() {
		if(session!=null&&session.isOpen())session.close();
	}
	
}
