package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import model.entity.PartyGoods;
import model.entity.Provider;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;

 
 public class PartyGoodsTest {
	static PersonJpa personJpa;
	static Provider foreignElement;
	PartyGoods element1;
	PartyGoods element2;
	

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
		foreignElement = personJpa.persist(new Provider(0, "11", "12","13","14"));
		
	}

	@Before
	public void initElement() {
		List<PartyGoods> list = personJpa.findAll(PartyGoods.class);
		for (PartyGoods element : list) {
			personJpa.remove(element);
		}
		element1 = new PartyGoods(0,new Date(),foreignElement);
		element2 = new PartyGoods(0, new Date(),foreignElement);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}
	
	@AfterClass static public void clearDatabasePrepareElements(){
		List<PartyGoods> list = personJpa.findAll(PartyGoods.class);
		for (PartyGoods element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(foreignElement);
	}
	@Test
	public void findAll() {
		List<PartyGoods> list = personJpa.findAll(PartyGoods.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(PartyGoods.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(PartyGoods.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setDatePartyGoods(new Date());
		
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(PartyGoods.class).size());
	}

	


}
