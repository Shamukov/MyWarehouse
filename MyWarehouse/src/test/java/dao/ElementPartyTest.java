package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import model.entity.ElementParty;
import model.entity.Goods;
import model.entity.PartyGoods;
import model.entity.Provider;
import model.entity.TypeGoods;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;
 
 public class ElementPartyTest {

	static PersonJpa personJpa;

	static Provider provider;
	static PartyGoods partyGoods;
	static TypeGoods typeGoods;
	static Goods goods;

	ElementParty element1;
	ElementParty element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();

		provider = personJpa
				.persist(new Provider(0, "testElementParty1",
						"testElementParty2", "testElementParty1111",
						"testElementParty"));
		partyGoods = personJpa.persist(new PartyGoods(0, new Date(), provider));
		typeGoods = personJpa.persist(new TypeGoods(0, "TesttypeGoogs"));
		goods = personJpa.persist(new Goods(0, "TestGoods", typeGoods));

	}

	@Before
	public void initElement() {
		List<ElementParty> list = personJpa.findAll(ElementParty.class);
		for (ElementParty element : list) {
			personJpa.remove(element);
		}
		element1 = new ElementParty(0, 11, partyGoods, provider, typeGoods, goods);
		element2 = new ElementParty(0, 23, partyGoods, provider,  typeGoods, goods);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@AfterClass
	static public void clearDatabasePrepareElements() {
		List<ElementParty> list = personJpa.findAll(ElementParty.class);
		for (ElementParty element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(partyGoods);
		personJpa.remove(provider);
		personJpa.remove(goods);
		personJpa.remove(typeGoods);
	}

	@Test
	public void findAll() {
		List<ElementParty> list = personJpa.findAll(ElementParty.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1,
				personJpa.find(ElementParty.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1,
				personJpa.find(ElementParty.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setNumber(01111);;

		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(ElementParty.class).size());
	}

}
