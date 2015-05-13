package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import model.entity.Client;
import model.entity.ElementOrderGoods;
import model.entity.ElementParty;
import model.entity.Goods;
import model.entity.OrderGoods;
import model.entity.PartyGoods;
import model.entity.Preservation;
import model.entity.Provider;
import model.entity.Sector;
import model.entity.Storage;
import model.entity.TypeGoods;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;

 public class ElementOrderGoodsTest {

	static PersonJpa personJpa;
	
	static private Provider provider;
	static private PartyGoods partyGoods;
	static private Storage storage;
	static private Sector sector;
	static private TypeGoods typeGoods;
	static private Goods goods;
	static private ElementParty elementParty;
	static private Client client;
	static private OrderGoods orderGoods;
	private static Preservation preservation;
	
	ElementOrderGoods element1;
	ElementOrderGoods element2;

	

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();

		storage = personJpa.persist(new Storage(0, 11, "minsktest"));
		sector = personJpa.persist(new Sector(0, 20, storage));
		provider = personJpa.persist(new Provider(0, "testElementOrderGoods1","testElementOrderGoods2", "testElementOrderGoods1111","testElementOrderGoods"));
		partyGoods = personJpa.persist(new PartyGoods(0, new Date(), provider));
		typeGoods = personJpa.persist(new TypeGoods(0, "TesttypeGoogs"));
		goods = personJpa.persist(new Goods(0, "TestGoods", typeGoods));
		elementParty =personJpa.persist( new ElementParty(0, 14, partyGoods, provider, typeGoods, goods));
		preservation = personJpa.persist(new Preservation(0, 20, sector, storage, elementParty, partyGoods, provider, goods, typeGoods));
		client = personJpa.persist(new Client(0, "sania", "111test", "addresstest"));
		orderGoods = personJpa.persist(new OrderGoods(0, new Date(), client));

	}

	@Before
	public void initElement() {
		List<ElementOrderGoods> list = personJpa.findAll(ElementOrderGoods.class);
		for (ElementOrderGoods element : list) {
			personJpa.remove(element);
		}
		element1 = new ElementOrderGoods(0, 10, orderGoods, client, preservation, elementParty, partyGoods, provider, goods, typeGoods, sector, storage);
		element2 = new ElementOrderGoods(0, 24, orderGoods, client, preservation, elementParty, partyGoods, provider, goods, typeGoods, sector, storage);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@AfterClass
	static public void clearDatabasePrepareElements() {
		List<ElementOrderGoods> list = personJpa.findAll(ElementOrderGoods.class);
		for (ElementOrderGoods element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(orderGoods);
		personJpa.remove(client);
		personJpa.remove(preservation);
		personJpa.remove(elementParty);
		personJpa.remove(goods);
		personJpa.remove(typeGoods);
		personJpa.remove(partyGoods);
		personJpa.remove(provider);
		personJpa.remove(sector);
		personJpa.remove(storage);
		
	}

	@Test
	public void findAll() {
		List<ElementOrderGoods> list = personJpa.findAll(ElementOrderGoods.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1,
				personJpa.find(ElementOrderGoods.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1,
				personJpa.find(ElementOrderGoods.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setNumber(12);

		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(ElementOrderGoods.class).size());
	}

}
