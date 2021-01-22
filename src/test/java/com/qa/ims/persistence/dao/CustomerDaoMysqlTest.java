package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.qa.ims.IMS;
import com.qa.ims.controller.CustomerController;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.DBUtils;
//import com.qa.ims.persistence.dao.CustomerDaoMysql;

public class CustomerDaoMysqlTest {

	private static final Logger LOGGER = LogManager.getLogger();
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ims_test";


	@Before
	public void setup(){
		DBUtils.getInstance(DB_USER, DB_PASS, DB_URL, true);
	}

	@Test
	public void createTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql();
		String firstName = "john";
		String surname = "doe";
		Customer customer = new Customer(firstName, surname);
		Customer savedCustomer = new Customer(1L,firstName,surname);
		customer = customerDaoMysql.create(customer);
		assertEquals(savedCustomer, customer);
	}
	

	@Test
	public void readAllTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql();
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1L,"Chris", "P"));
		customers.add(new Customer(2L, "Rhys", "T"));
		customers.add(new Customer(3L, "Nic", "J"));
		customerDaoMysql.create(new Customer("Chris", "P"));
		customerDaoMysql.create(new Customer("Rhys", "T"));
		customerDaoMysql.create(new Customer("Nic", "J"));
		assertEquals(customers, customerDaoMysql.readAll());
	}
	
	@Test
	public void updateTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql();
		Customer customer = new Customer("Chris", "P");
		Customer newCustomer = new Customer(1L, "John", "Doe");
		customerDaoMysql.create(customer);
		assertEquals(newCustomer, customerDaoMysql.update(newCustomer));
		assertNotEquals(customer, customerDaoMysql.update(newCustomer));
	}
	
	@Test
	public void deleteTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql();
		customerDaoMysql.delete(1L);
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
