package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import model.entity.Client;
import model.entity.OrderGoods;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;


public class OrderGoodsTest {
	static PersonJpa personJpa;
	static Client client;
	OrderGoods element1;
	OrderGoods element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
		client = personJpa.persist(new Client(0, "11", "12", "13"));

	}

	@Before
	public void initElement() {
		List<OrderGoods> list = personJpa.findAll(OrderGoods.class);
		for (OrderGoods element : list) {
			personJpa.remove(element);
		}
		element1 = new OrderGoods(0, new Date(), client);
		element2 = new OrderGoods(0, new Date(), client);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@AfterClass
	static public void clearDatabasePrepareElements() {
		List<OrderGoods> list = personJpa.findAll(OrderGoods.class);
		for (OrderGoods element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(client);
	}

	@Test
	public void findAll() {
		List<OrderGoods> list = personJpa.findAll(OrderGoods.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1,
				personJpa.find(OrderGoods.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1,
				personJpa.find(OrderGoods.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setDateOrder(new Date());

		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(OrderGoods.class).size());
	}

}
