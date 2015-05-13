package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.entity.TypeGoods;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.jpaimpl.PersonJpa;
 
 public class GoodsTypeTest {
	static PersonJpa personJpa;
	TypeGoods element1;
	TypeGoods element2;

	@BeforeClass
	public static void init() {
		personJpa = new PersonJpa();
	}

	@Before
	public void initElement() {
		List<TypeGoods> list = personJpa.findAll(TypeGoods.class);
		for (TypeGoods client : list) {
			personJpa.remove(client);
		}
		element1 = new TypeGoods(0,"12");
		element2 = new TypeGoods(0,"23");
		element1 = personJpa.persist(element1);
		element2 = personJpa.persist(element2);
	}

	@Test
	public void findAll() {
		List<TypeGoods> list = personJpa.findAll(TypeGoods.class);
		assertEquals(list.get(0), element1);
		assertEquals(list.get(1), element2);
		assertTrue("size != 2", list.size() == 2);
	}

	@Test
	public void persiste() {
		assertEquals(element1,
				personJpa.find(TypeGoods.class, element1.getId()));
	}

	@Test
	public void find() {
		assertEquals(element1,
				personJpa.find(TypeGoods.class, element1.getId()));
	}

	@Test
	public void update() {
		element1.setName("testupdate");
		assertEquals(personJpa.update(element1), element1);
	}

	@Test
	public void remove() {
		personJpa.remove(element1);
		personJpa.remove(element2);
		assertTrue(0 == personJpa.findAll(TypeGoods.class).size());
	}
}
