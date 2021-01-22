package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDaoMysqlTest {
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ims_test";

	@Before
	public void setup() {
		DBUtils.getInstance(DB_USER, DB_PASS, DB_URL, true);
	}

	@Test
	public void createTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
		String itemName = "Apple";
		Item item = new Item(itemName, 1.99);
		Item savedItem = new Item(1L, "Tomato", 1.99);
		assertEquals(savedItem, itemDaoMysql.create(item));
	}

	@Test
	public void readAllTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
		List<Item> items = new ArrayList<>();
		items.add(new Item(1L, "Orange", 1.59));
		items.add(new Item(2L, "Kiwi", 21.00));
		items.add(new Item(3L, "Apple", 1.99));
		itemDaoMysql.create(new Item("Orange", 1.59));
		itemDaoMysql.create(new Item("Potato", 12.00));
		itemDaoMysql.create(new Item("Apple", 1.99));
		assertEquals(items, itemDaoMysql.readAll());
	}

	@Test
	public void updateTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
		Item item = new Item("Orange", 1.59);
		Item newItem = new Item(1L, "Kiwi", 21.00);
		itemDaoMysql.create(item);
		assertEquals(newItem, itemDaoMysql.update(newItem));
		assertNotEquals(item, itemDaoMysql.update(newItem));
	}

	@Test
	public void deleteTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
		itemDaoMysql.delete(1L);
	}
}
