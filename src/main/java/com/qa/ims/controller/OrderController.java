package com.qa.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

/**
 * Takes in order details for CRUD functionality
 *
 */
public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private CrudServices<Order> orderService;

	public OrderController(CrudServices<Order> orderService) {
		this.orderService = orderService;
	}

	String getInput() {
		return Utils.getInstance().getInput();
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderService.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	/**
	 * Creates an order by taking in user input
	 */

	public Order create() {
		boolean done = false;
		List<Long> items = new ArrayList<>();
		List<Integer> quantitems = new ArrayList<>();
		LOGGER.info("Please enter the customer id");
		Long customer_id = Long.valueOf(getInput());
		LOGGER.info("Please enter the item id");
		items.add(Long.valueOf(getInput()));
		LOGGER.info("Please enter the quantity");
		quantitems.add(Integer.valueOf(getInput()));
		while (!done) {
			LOGGER.info("Would you like to add more items? type y/n");
			String yesno = String.valueOf(Utils.getInstance().getInput().toUpperCase());
			if (yesno.equals("Y")) {
				LOGGER.info("Please enter the item id");
				items.add(Long.valueOf(getInput()));
				LOGGER.info("Please enter the quantity");
				quantitems.add(Integer.valueOf(getInput()));
			} else if (yesno.equals("N")) {
				done = true;
			} else {
				LOGGER.info("Could not select try again");
			}
		}
		LOGGER.info("Please enter the date");
		String date = getInput();
		Order order = orderService.create(new Order(customer_id, items, date).quantitems(quantitems));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing order by taking in user input
	 */
//	
	
	@Override
	public Order update() {
		boolean done = false;
		boolean updateAddItems= false;
		boolean updateDeleteItems= false;
		List<Long> items = new ArrayList<>();
		List<Long> itemsDelete = new ArrayList<>();
		List<Integer> quantitems = new ArrayList<>();
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter the customer id");
		Long customer_id = Long.valueOf(getInput());
		while (!done) {
			LOGGER.info("Would you like to delete items? y/n");
			String yesno = String.valueOf(Utils.getInstance().getInput().toUpperCase());
			if (yesno.equals("Y")) {
				updateDeleteItems = true;
				LOGGER.info("Please enter the item id");
				itemsDelete.add(Long.valueOf(getInput()));
			} else if (yesno.equals("N")) {
				done = true;
			} else {
				LOGGER.info("Invalid selection please try again");
			}
		}
		done = false;
		while (!done) {
			LOGGER.info("Would you like to add items? y/n");
			String yesno = String.valueOf(Utils.getInstance().getInput().toUpperCase());
			if (yesno.equals("Y")) {
				updateAddItems = true;
				LOGGER.info("Please enter the item id");
				items.add(Long.valueOf(getInput()));
				LOGGER.info("Please enter the quantity");
				quantitems.add(Integer.valueOf(getInput()));
			} else if (yesno.equals("N")) {
				done = true;
			} else {
				LOGGER.info("Could not select try again");
			}
		}
		LOGGER.info("Please enter the date");
		String date = getInput();
		Order order = orderService.update(new Order(id, customer_id, items, date).quantitems(quantitems).updateAddItems(updateAddItems).updateDeleteItems(updateDeleteItems).items_id_delete(itemsDelete));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing order by the id of the order
	 */
	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = Long.valueOf(getInput());
		orderService.delete(id);
		LOGGER.info("Order Deleted");
	}

}
