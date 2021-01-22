package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.DBUtils;
//import com.qa.ims.persistence.dao.CustomerDaoMysql;

public class CustomerDaoMysqlTest {

	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ims_test";


	@Before
	public void setup(){
		DBUtils.getInstance(DB_USER, DB_PASS, DB_URL, true);
	}

	@Test
	public void createTest() {
		CustomerDaoMysql customerDao = new CustomerDaoMysql();
		String firstName = "Matt";
		String surname = "Garbett";
		Customer customer = new Customer(firstName, surname);
		Customer savedCustomer = new Customer(1L,firstName,surname);
		customer = customerDao.create(customer);
		assertEquals(savedCustomer, customer);
	}
	

	@Test
	public void readAllTest() {
		CustomerDaoMysql customerDAO = new CustomerDaoMysql();
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1L,"Chris", "P"));
		customers.add(new Customer(2L, "Rhys", "T"));
		customers.add(new Customer(3L, "Nic", "J"));
		customerDAO.create(new Customer("Chris", "P"));
		customerDAO.create(new Customer("Rhys", "T"));
		customerDAO.create(new Customer("Nic", "J"));
		assertEquals(customers, customerDAO.readAll());
	}
	
	@Test
	public void updateTest() {
		CustomerDaoMysql customerDAO = new CustomerDaoMysql();
		Customer customer = new Customer("Chris", "P");
		Customer newCustomer = new Customer(1L, "Ben", "Allen");
		customerDAO.create(customer);
		assertEquals(newCustomer, customerDAO.update(newCustomer));
		assertNotEquals(customer, customerDAO.update(newCustomer));
	}
	
	@Test
	public void deleteTest() {
		CustomerDaoMysql customerDAO = new CustomerDaoMysql();
		customerDAO.delete(1L);
	}

}
