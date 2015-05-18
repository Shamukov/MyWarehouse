package dao.jpa;
// CRUD
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import dao.DaoI;

public abstract class JpaDao implements DaoI {
	@PersistenceContext
	static protected EntityManager entityManager;
	static EntityManagerFactory entityManagerFactory; 
	{
		entityManagerFactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public JpaDao() {
	}

	@Override
	public <T> void remove(T entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}

	@Override
	public <T> T persist(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}

	@Override
	public <T> T find(Class<T> type, int id) {
		entityManager.getTransaction().begin();
		T entity = entityManager.find(type, id);
		entityManager.getTransaction().commit();
		return entity;
	}

	@Override
	public <T> T update(T entity) {
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public void  close(){
		entityManager.close();
		entityManagerFactory.close();
	}

}
