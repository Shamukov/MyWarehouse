package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.Sector;
import model.entity.Storage;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;

 
 public class SectorTest {
	static PersonJpa personJpa;
	static Storage foreignElement;
	Sector element1;
	Sector element2;
	

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
		foreignElement = personJpa.persist(new Storage(0,111,"minsk"));
		
	}

	@Before
	public void initElement() {
		List<Sector> list = personJpa.findAll(Sector.class);
		for (Sector element : list) {
			personJpa.remove(element);
		}
		element1 = new Sector(0, 11,foreignElement);
		element2 = new Sector(0, 22,foreignElement);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}
	
	@AfterClass static public void clearDatabasePrepareElements(){
		List<Sector> list = personJpa.findAll(Sector.class);
		for (Sector element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(foreignElement);
	}
	@Test
	public void findAll() {
		List<Sector> list = personJpa.findAll(Sector.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(Sector.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(Sector.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setVolume(00011111);
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Sector.class).size());
	}

	

}
