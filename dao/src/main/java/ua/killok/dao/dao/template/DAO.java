package ua.killok.dao.dao.template;

import java.sql.SQLException;
import java.util.List;

import ua.killok.dao.model.interfaces.LibEntity;

/**
 * Generic DAO interface
 */
public interface DAO {
		
		/**
		 * Method which insert entities into the database by entity object
		 * @param LibEntity - object, which you want to insert into the database
		 */
		public <T extends LibEntity> void add (T obj) throws SQLException;
		
		/**
		 * Method updates entities in the database by entity object
		 * @param LibEntity - object, which you want to update in the database
		 */
		public <T extends LibEntity> void update (T obj) throws SQLException;
		
		/**
		 * Method removes entities from the database by entity object
		 * @param LibEntity - object, which you want to remove from database
		 */
		public <T extends LibEntity> void delete (T obj) throws SQLException;
		
		/**
		 * Method return you entity from data base by id
		 * @param id - entity id
		 * @param cl - entity class, list of which you want to get
		 * @return List of entities
		 */
		public LibEntity get(int id, Class<? extends LibEntity> cl) throws SQLException;
		
		/**
		 * Method return you list of entities from data base 
		 * @param cl - entity class, list of which you want to get
		 * @return List of entities
		 */
		public List<? extends LibEntity> listObj(Class<? extends LibEntity> cl) throws SQLException;

	}