package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.Provider;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;
 
 public class ProviderTest {
	static PersonJpa personJpa;
	Provider element1;
	Provider element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
	}

	@Before
	public void initElement() {
		List<Provider> list = personJpa.findAll(Provider.class);
		for (Provider client : list) {
			personJpa.remove(client);
		}
		element1 = new Provider(0, "11", "12","13","14");
		element2 = new Provider(0, "21", "22","23","24");
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@Test
	public void findAll() {
		List<Provider> list = personJpa.findAll(Provider.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(Provider.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(Provider.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setName("test123");
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Provider.class).size());
	}
}
