package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orders {
	private Long id;
	private Long CustomerID;
	private Long Order_itemsID;
	private List<Item> ItemList = new ArrayList<>();
	private Double Items_value;

	public Double getItems_value() {
		return Items_value;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", CustomerID=" + CustomerID + ", ItemList=" + ItemList + ", Order_itemsID="
				+ Order_itemsID + ", Items_value=" + Items_value + "]";
	}

	public void setItems_value(Double items_value) {
		Items_value = items_value;
	}

	public Orders(Long customerID, Long order_itemsID) {
		super();
		CustomerID = customerID;
		Order_itemsID = order_itemsID;
	}

	public Long getOrder_itemsID() {
		return Order_itemsID;
	}

	public Orders(Long id, Long customerID, Long order_itemsID) {
		super();
		this.id = id;
		CustomerID = customerID;
		Order_itemsID = order_itemsID;
	}

	public void setOrder_itemsID(Long order_itemsID) {
		Order_itemsID = order_itemsID;
	}

	public Orders(Long id, Long CustomerID, List<Item> ItemList) {
		this.setId(id);
		this.setCustomerID(CustomerID);
		this.setItemList(ItemList);
	}

	public List<Item> getItemList() {
		return ItemList;
	}

	public void setItemList(List<Item> itemList) {
		this.ItemList = itemList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(Long customerID) {
		this.CustomerID = customerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CustomerID, ItemList, Items_value, Order_itemsID, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(CustomerID, other.CustomerID) && Objects.equals(ItemList, other.ItemList)
				&& Objects.equals(Items_value, other.Items_value) && Objects.equals(Order_itemsID, other.Order_itemsID)
				&& Objects.equals(id, other.id);
	}
}
