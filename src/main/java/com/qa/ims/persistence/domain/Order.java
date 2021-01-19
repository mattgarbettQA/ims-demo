package com.qa.ims.persistence.domain;

import java.util.Date;

public class Order {

	private Long id;
	private Long orderitems_id;
	private Long customer_id;
	private Long item_id;
	private Date date_ordered;

	public Order(Long orderitems_id, Long customer_id, Long item_id, Date date_ordered) {
		this.orderitems_id = orderitems_id;
		this.customer_id = customer_id;
		this.item_id = item_id;
		this.date_ordered = date_ordered;
	}

	public Order(Long id, Long orderitems_id, Long customer_id, Long item_id, Date date_ordered) {
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

	public void setOrderitems_id(Long ordItem_id) {
		this.orderitems_id = ordItem_id;
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

	public Date getDate_ordered() {
		return date_ordered;
	}

	public void setDate_ordered(Date date_ordered) {
		this.date_ordered = date_ordered;
	}
	
	@Override
	public String toString() {
		return "Order [order_id= " + id + ", customer_id= " + customer_id + ", item_id= " + item_id + ", date_ordered= "
				+ date_ordered + "]";
	}
}
