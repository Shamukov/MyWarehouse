package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.Storage;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;
 
 public class StorageTest {
	static PersonJpa personJpa;
	Storage element1;
	Storage element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
	}

	@Before
	public void initElement() {
		List<Storage> list = personJpa.findAll(Storage.class);
		for (Storage client : list) {
			personJpa.remove(client);
		}
		element1 = new Storage(0, 11, "12");
		element2 = new Storage(0, 21, "23");
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@Test
	public void findAll() {
		List<Storage> list = personJpa.findAll(Storage.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(Storage.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(Storage.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setName("test123");
		element1.setVolume(001);
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Storage.class).size());
	}
}
