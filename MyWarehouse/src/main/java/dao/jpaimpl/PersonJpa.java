package dao.jpaimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.metamodel.EntityType;

import model.entity.Goods;
import model.entity.Preservation;
import model.entity.basicentity.BasicEntity;
import dao.jpa.JpaDao;

public class PersonJpa extends JpaDao {
	public PersonJpa() {
		super();
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> type) {
		Query query = entityManager.createQuery("Select e from "
				+ type.getName() + " e");
		return (List<T>) query.getResultList();
	};

	public ArrayList<String> getAllNameEntity() {
		ArrayList<String> list = new ArrayList<String>();
		for (EntityType<?> entityType : entityManager.getMetamodel()
				.getEntities())
			list.add(entityType.getName());
		return list;
	}

	@SuppressWarnings("unchecked")
	public Class<? extends BasicEntity> getEntityClass(String name) {
		for (EntityType<?> entityType : entityManager.getMetamodel()
				.getEntities())
			if (entityType.getName().toUpperCase().equals(name.toUpperCase()))
				return (Class<? extends BasicEntity>) entityType.getJavaType();
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<? extends BasicEntity> findAllPreservation() {
		Query query = entityManager.createQuery("Select e from Preservation e  where e.volume !=0 ");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Preservation> findPreservationCondition(int count) {
		String request = "Select e from Preservation e where e.volume != 0 ";
		if(count != -1)
			request+=" and e.volume > "+count;
		
		Query query = entityManager.createQuery(request);
		
		return query.getResultList();
	}

	public int findNameId(String nameLine) {
		Query query = entityManager.createQuery("Select e from Goods e  where e.definition like '"+nameLine+"'");
		@SuppressWarnings("unchecked")
		List<Goods> list = query.getResultList();
		if(list.size() == 0)
			return -1;
		return list.get(0).getId();
				
		
	}
	
}
