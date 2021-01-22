package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class OrderDaoMysqlTest {
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ims_test";

	@Before
	public void setup() {
		DBUtils.getInstance(DB_USER, DB_PASS, DB_URL, true);

	}

	
//	@Test
//	public void createTest() {
//		OrderDaoMysql orderDaoMysql = new OrderDaoMysql();
//		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql();
//		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
//		customerDaoMysql.create(new Customer("Matt", "Smith"));
//		itemDaoMysql.create(new Item("Apple", 1.99));
//		Long customer_id = 1L;
//		Long item_id = 1L;
//		List<Long> items_id = new ArrayList<>();
//		items_id.add(item_id);
//		List<Integer> quantitems = new ArrayList<>();
//		quantitems.add(20);
//		Order order = new Order(customer_id, items_id, "October").quantitems(quantitems);
//		Order savedOrder = new Order(1L, customer_id, items_id, "October").quantitems(quantitems);
//		assertEquals(savedOrder, orderDaoMysql.create(order));
//	}
//
//	
//	@Test
//	public void readAllTest() {
//		OrderDaoMysql orderDaoMysql = new OrderDaoMysql();
//		CustomerDaoMysql customerDAO = new CustomerDaoMysql();
//		ItemDaoMysql itemDaoMysql = new ItemDaoMysql();
//		customerDAO.create(new Customer("Matt", "Smith"));
//		itemDaoMysql.create(new Item("Apple", 1.99));
//		List<Order> orders = new ArrayList<>();
//		Long item_id = 1L;
//		List<Long> items_id = new ArrayList<>();
//		items_id.add(item_id);
//		Long item_id2 = 1L;
//		List<Long> items_id2 = new ArrayList<>();
//		items_id2.add(item_id2);
//		List<Integer> quantities = new ArrayList<>();
//		quantitems.add(20);
//		List<Integer> quantities2 = new ArrayList<>();
//		quantitems2.add(20);
//		orders.add(new Order(1L, 1L, items_id, "October").quantitems(quantitems));
//		orders.add(new Order(1L, 1L, items_id2, "September").quantitems(quantitems2));
//		orderDAO.create(new Order(1L, items_id, "October").quantitems(quantitems));
//		orderDAO.create(new Order(1L, items_id2, "September").quantitems(quantitems2));
//		assertEquals(orders, orderDaoMysql.readAll());
//}
//	@Test
//	public void updateTest() {
//		OrderDaoMysql orderDaoMysql = new OrderDaoMysql();
//		Long item_id = 1L;
//		List<Long> items_id = new ArrayList<>();
//		items_id.add(item_id);
//		Long item_id2 = 1L;
//		List<Long> items_id2 = new ArrayList<>();
//		items_id2.add(item_id2);	
//		Order order = new Order(1L, items_id, "October");
//		Order newOrder= new Order(2L, items_id2, "September");
//		orderDaoMysql.create(order);
//		assertEquals(newOrder, orderDaoMysql.update(newOrder));
//		assertNotEquals(order, orderDaoMysql.update(newOrder));
//	}
	@Test
	public void deleteTest() {
		OrderDaoMysql orderDaoMysql = new OrderDaoMysql();
		
		orderDaoMysql.delete(1L);
	}
}
