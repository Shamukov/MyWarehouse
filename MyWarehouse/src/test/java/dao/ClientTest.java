package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.Client;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;

public class ClientTest {
	static PersonJpa personJpa;
	Client element1;
	Client element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
	}

	@Before
	public void initElement() {
		List<Client> list = personJpa.findAll(Client.class);
		for (Client client : list) {
			personJpa.remove(client);
		}
		element1 = new Client(0, "11", "12", "13");
		element2 = new Client(0, "21", "22", "23");
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@Test
	public void findAll() {
		List<Client> list = personJpa.findAll(Client.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(Client.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(Client.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setName("test123");
		element1.setAddress("testCity");
		element1.setScore("testNumber");
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Client.class).size());
	}
}
