package ua.killok.dao.dao.implementation;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import ua.killok.dao.dao.template.DAO;
import ua.killok.dao.model.interfaces.LibEntity;
import ua.killok.dao.util.DAOSessionFactory;

public class DaoImpl implements DAO{
	
	private DAOSessionFactory dsf =new DAOSessionFactory();
	private  Session session =  dsf.getSession();

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
	public void openSession() {
		closeSession();
		session = dsf.openSession();
	}
	
	public void closeSession() {
		if(session!=null&&session.isOpen())session.close();
	}
	
}

