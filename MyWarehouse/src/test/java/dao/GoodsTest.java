package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.Goods;
import model.entity.TypeGoods;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;

 
 public class GoodsTest {
	static PersonJpa personJpa;
	static TypeGoods foreignElement;
	Goods element1;
	Goods element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
		foreignElement = personJpa.persist(new TypeGoods(0, "testTypeGoods"));

	}

	@Before
	public void initElement() {
		List<Goods> list = personJpa.findAll(Goods.class);
		for (Goods element : list) {
			personJpa.remove(element);
		}
		element1 = new Goods(0, "testGoods11", foreignElement);
		element2 = new Goods(0, "testGoods21", foreignElement);
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@AfterClass
	static public void clearDatabasePrepareElements() {
		List<Goods> list = personJpa.findAll(Goods.class);
		for (Goods element : list) {
			personJpa.remove(element);
		}
		personJpa.remove(foreignElement);
	}

	@Test
	public void findAll() {
		List<Goods> list = personJpa.findAll(Goods.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1, personJpa.find(Goods.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1, personJpa.find(Goods.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setDefinition("testUpdate");

		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(Goods.class).size());
	}

}
