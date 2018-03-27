package ua.killok.dao;

import java.sql.SQLException;
import java.util.Set;

import ua.killok.dao.dao.implementation.DaoImpl;
import ua.killok.dao.model.entities.Book;
import ua.killok.dao.model.entities.BookContent;
import ua.killok.dao.util.HibernateUtil;
/*
 * Jut to try
 */
public class DaoImplTest {
	public static void main(String[] args) throws SQLException {
		DaoImpl gd = new DaoImpl();
		
		/*byte[] bt = {1, 4};
		Book b = new Book("SecondBook",bt, "Description2", new java.sql.Date(new java.util.Date().getTime()));*/
		
		/*Book bok = (Book)gd.get(2, Book.class);
		System.out.println(bok.getName());
		
		gd.closeSession();
		gd.openSession();
		
		List<? extends LibEntity> l = gd.listObj(Book.class);
		for(LibEntity b:l)System.out.println(((Book)b).getName());*/
		
		/*Book bok = (Book)gd.get(2, Book.class);
		bok.setName("SecondBook");
		bok.setShortDescription("SecondDesc");
		gd.update(bok);*/
		
		
		/*gd.closeSession();
		HibernateUtil.closeSessionFactory();
		
		HibernateUtil.configureSessionFactory();
		HibernateUtil.getSessionFactory();
		gd.openSession();
		Book bok1 = (Book)gd.get(1, Book.class);
		System.out.println(bok1.getName());*/
		
		
		/*System.out.println(((Book)((BookContent)gd.get(1, BookContent.class)).getBook()).getName());*/
		
		/*Book b = (Book) gd.get(3, Book.class);
		Set<Author> s = b.getAuthors();
		for (Author a: s)System.out.println(a.getName()+" "+a.getSurname());*/
		
		Book b = (Book) gd.get(3, Book.class);
		System.out.println(b.getName());
		
		Set<BookContent> bc = b.getBookContent();
		for (BookContent bk : bc) {
			byte[] h = bk.getFile();
			System.out.println("h.equals(null) = "+h.equals(null));
			System.out.println(bk.getFileName());
		}
		
		gd.closeSession();
		HibernateUtil.closeSessionFactory();
		
		/*System.exit(0);*/
	}
}
