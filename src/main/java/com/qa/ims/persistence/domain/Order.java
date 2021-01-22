package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long id;
	private Long customer_id;
	private Long item_id;
	private String date_ordered;
	private List<Long> items_id = new ArrayList<>();
	private Integer quantity; 
	private List<Integer> quantitems = new ArrayList<>();
	private Double total_price;
	private Boolean updateAddItems;
	private Boolean updateDeleteItems;
	private List<Long> items_id_delete = new ArrayList<>();

	public Order() {

	}

	public Order(Long customer_id, List<Long> items_id, String date_ordered) {
		this.customer_id = customer_id;
		this.items_id = items_id;
		this.date_ordered = date_ordered;
	}

	public Order(Long id, Long customer_id, List<Long> items_id, String date_ordered) {
		this.id = id;
		this.customer_id = customer_id;
		this.date_ordered = date_ordered;
		this.items_id = items_id;
	}

	public Order(Long id, Long customer_id, Long item_id, Integer quantity, String date_ordered) {
		this.id = id;
		this.customer_id = customer_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.date_ordered = date_ordered;
	}

	public Long getId() {
		return id;
	}

	public void setOrder_id(Long id) {
		this.id = id;
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
	
	public List<Integer> getQuantitems() {
		return quantitems;
	}

	public void setQuantitems(List<Integer> quantitems) {
		this.quantitems = quantitems;
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	public Order quantitems(List<Integer> quantitems) {
		this.quantitems = quantitems;
		return this;
	}
	
	public Boolean getUpdateAddItems() {
		return updateAddItems;
	}

	public void setUpdateAddItems(Boolean updateAddItems) {
		this.updateAddItems = updateAddItems;
	}

	public Boolean getUpdateDeleteItems() {
		return updateDeleteItems;
	}

	public void setUpdateDeleteItems(Boolean updateDeleteItems) {
		this.updateDeleteItems = updateDeleteItems;
	}
	
	public List<Long> getItems_id_delete() {
		return items_id_delete;
	}

	public void setItems_id_delete(List<Long> items_id_delete) {
		this.items_id_delete = items_id_delete;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order otherOrder = (Order) obj;
		if (customer_id == null) {
			if (otherOrder.customer_id != null)
				return false;
		} else if (!customer_id.equals(otherOrder.customer_id))
			return false;
		if (id == null) {
			if (otherOrder.id != null)
				return false;
		} else if (!id.equals(otherOrder.id))
			return false;
		if (item_id == null) {
			if (otherOrder.item_id != null)
				return false;
		} else if (!item_id.equals(otherOrder.item_id))
			return false;
		if (quantity == null) {
			if (otherOrder.quantity != null)
				return false;
		} else if (!quantity.equals(otherOrder.quantity))
			return false;
		return true;
	}
	
	public Order updateAddItems(boolean updateAddItems) {
		this.updateAddItems = updateAddItems;
		return this;
	}
	public Order updateDeleteItems(boolean updateDeleteItems) {
		this.updateDeleteItems = updateDeleteItems;
		return this;
	}

	public Order total_price(Double total_price) {
		this.total_price = total_price;
		return this;
	}
	
	public Order items_id_delete(List<Long> items_id_delete) {
		this.items_id_delete = items_id_delete;
		return this;
	}
	@Override
	public String toString() {
		return "Order [order_id= " + id + ", customer_id= " + customer_id + ", item_id= " + item_id + ", quantity= " + quantity + ", date_ordered= "
				+ date_ordered + ", total price= �" + total_price +"]";
	}

}
