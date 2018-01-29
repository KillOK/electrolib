package ua.killok.dao;

import java.sql.SQLException;
import java.util.List;

import ua.killok.dao.dao.implementation.DaoImpl;
import ua.killok.dao.tables.entyties.Book;
import ua.killok.dao.tables.models.LibEntity;
import ua.killok.dao.util.HibernateUtil;
/*
 * Jut to try
 */
public class DaoImplTest {
	public static void main(String[] args) throws SQLException {
		DaoImpl gd = new DaoImpl();
		
		/*byte[] bt = {1, 4};
		Book b = new Book("SecondBook",bt, "Description2", new java.sql.Date(new java.util.Date().getTime()));*/
		
		Book bok = (Book)gd.get(2, Book.class);
		System.out.println(bok.getName());
		
		gd.closeSession();
		gd.openSession();
		
		List<? extends LibEntity> l = gd.listObj(Book.class);
		for(LibEntity b:l)System.out.println(((Book)b).getName());
		
		/*Book bok = (Book)gd.get(2, Book.class);
		bok.setName("SecondBook");
		bok.setShortDescription("SecondDesc");
		gd.update(bok);*/
		
		
		gd.closeSession();
		HibernateUtil.closeSessionFactory();
		
		HibernateUtil.configureSessionFactory();
		HibernateUtil.getSessionFactory();
		gd.openSession();
		Book bok1 = (Book)gd.get(1, Book.class);
		System.out.println(bok1.getName());
		
		gd.closeSession();
		HibernateUtil.closeSessionFactory();
		
		/*System.exit(0);*/
	}
}
