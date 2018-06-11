package logic.util.store;

import java.sql.SQLException;
import java.util.List;

import ua.killok.dao.dao.implementation.MultiDaoImpl;
import ua.killok.dao.dao.template.DAO;
import ua.killok.dao.model.entities.Book;
import ua.killok.dao.model.interfaces.LibEntity;
import ua.killok.dao.util.DAOSessionFactory;

public class BookCache implements DAO{
	
	private static MultiDaoImpl dao;
	
	@SuppressWarnings("rawtypes")
	private static List bookList;
	
	private BookCache() {
		dao = new MultiDaoImpl(new DAOSessionFactory().getSession());
		try {
			bookList = dao.listObj(Book.class);
		} catch (SQLException e) {
			System.out.println("Couldn't load BookList from DAO");
			e.printStackTrace();
		}
	}
	
	public void refreshBookList(){
		try {
			bookList = dao.listObj(Book.class);
		} catch (SQLException e) {
			System.out.println("Couldn't refresh BookList");
			e.printStackTrace();
		}
	}
	
	private final static BookCache INSTANCE = new BookCache();
	
	public static BookCache getInstance() {
		return INSTANCE;
	}
	
	
	
	
	@Override
	public <T extends LibEntity> void add(T obj) throws SQLException {
		dao.add(obj);
		refreshBookList();
	}

	@Override
	public <T extends LibEntity> void update(T obj) throws SQLException {
		dao.update(obj);
		refreshBookList();
	}

	@Override
	public <T extends LibEntity> void delete(T obj) throws SQLException {
		dao.delete(obj);
		refreshBookList();
	}

	@Override
	public LibEntity get(int id, Class<? extends LibEntity> cl) throws SQLException {
		return dao.get(id, cl);
	}


	@Override
	public List<? extends LibEntity> listObj(Class<? extends LibEntity> cl) throws SQLException {
		return dao.listObj(cl);
	}
	
	@SuppressWarnings("unchecked")
	public List<? extends LibEntity> listBooks() throws SQLException {
		return bookList;
	}

}
