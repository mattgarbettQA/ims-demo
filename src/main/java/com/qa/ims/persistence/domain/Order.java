package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long id;
	private Long orderitems_id;
	private Long customer_id;
	private Long item_id;
	private String date_ordered;
	private List<Long> items_id = new ArrayList<>();

	public Order() {

	}

	public Order(Long id) {
		super();
		this.id = id;
	}

	public Order(Long customer_id, String date_ordered) {
		this.customer_id = customer_id;
		this.date_ordered = date_ordered;
	}

	public Order(Long id, Long customer_id, String date_ordered) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.date_ordered = date_ordered;
	}

	public Order(Long id, Long customer_id, List<Long> items_id, String date_ordered) {
		super();
		this.customer_id = customer_id;
		this.date_ordered = date_ordered;
		this.items_id = items_id;
	}

	public Order(Long id, Long orderitems_id, Long customer_id, Long item_id, String date_ordered) {
		this.id = id;
		this.orderitems_id = orderitems_id;
		this.customer_id = customer_id;
		this.item_id = item_id;
		this.date_ordered = date_ordered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long order_id) {
		this.id = order_id;
	}

	public Long getOrderitems_id() {
		return orderitems_id;
	}

	public void setOrderitems_id(Long orderitems_id) {
		this.orderitems_id = orderitems_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public String getDate_ordered() {
		return date_ordered;
	}

	public void setDate_ordered(String date_ordered) {
		this.date_ordered = date_ordered;
	}

	public List<Long> getItems_id() {
		return items_id;
	}

	public void setItems_id(List<Long> items_id) {
		this.items_id = items_id;
	}

	@Override
	public String toString() {
		return "Order [order_id= " + id + ", customer_id= " + customer_id + ", item_id= " + item_id + ", date_ordered= "
				+ date_ordered + "]";
	}

}
