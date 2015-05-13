package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import model.entity.ElementParty;
import model.entity.Goods;
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

public class PreservationTest {
	static PersonJpa personJpa;

	static private Provider provider;
	static private PartyGoods partyGoods;
	static private Storage storage;
	static private Sector sector;
	static private TypeGoods typeGoods;
	static private Goods goods;
	static private ElementParty elementParty;

	Preservation element1;
	Preservation element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();

		provider = personJpa
				.persist(new Provider(0, "testPreservation1",
						"testPreservation2", "testPreservation1111",
						"testPreservation"));
		partyGoods = personJpa.persist(new PartyGoods(0, new Date(), provider));
		storage = personJpa.persist(new Storage(0, 11, "minsktest"));
		sector = personJpa.persist(new Sector(0, 20, storage));

		typeGoods = personJpa.persist(new TypeGoods(0, "TesttypeGoogs"));
		goods = personJpa.persist(new Goods(0, "TestGoods", typeGoods));
		elementParty = personJpa.persist(new ElementParty(0, 14, partyGoods,
				provider, typeGoods, goods));

	}

	@Before
	public void initElement() {
		List<Preservation> list = personJpa.findAll(Preservation.class);
		for (Preservation element : list) {
			personJpa.remove(element);
		}
		element1 = new Preservation(0, 12, sector, storage, elementParty,
				partyGoods, provider, goods, typeGoods);
		element2 = new Preservation(0, 43, sector, storage, elementParty,
				partyGoods, provider, goods, typeGoods);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@AfterClass
	static public void clearDatabasePrepareElements() {
		List<Preservation> list = personJpa.findAll(Preservation.class);
		for (Preservation element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(elementParty);
		personJpa.remove(partyGoods);
		personJpa.remove(provider);
		personJpa.remove(goods);
		personJpa.remove(typeGoods);
		personJpa.remove(sector);
		personJpa.remove(storage);

	}

	@Test
	public void findAll() {
		List<Preservation> list = personJpa.findAll(Preservation.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1,
				personJpa.find(Preservation.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1,
				personJpa.find(Preservation.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setVolume(0111);

		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Preservation.class).size());
	}

}
