package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orders {
	private Long id;
	private Long CustomerID;
	private List<Item> ItemList = new ArrayList<>();
	
	
	public Orders(Long id, Long CustomerID) {
		this.setId(id);
		this.setCustomerID(CustomerID);
		
	}
	
	public Orders(Long id, Long CustomerID, List<Item> ItemList) {
		this.setId(id);
		this.setCustomerID(CustomerID);
		this.setItemList(ItemList);
	}
	
	public List<Item> addItemList(Long i, String a, Double b){
		Item Item = new Item(i, a, b);
		ItemList.add(Item);
		return ItemList;
	}
	
	public List<Item> removeItemList(Long i, String a, Double b){
		Item Item = new Item(i, a, b);
		ItemList.remove(Item);
		return ItemList;
	}
	
	public List<Item> getItemList() {
		return ItemList;
	}

	public void setItemList(List<Item> itemList) {
		ItemList = itemList;
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
		CustomerID = customerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CustomerID, id);
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
		return Objects.equals(CustomerID, other.CustomerID) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", CustomerID=" + CustomerID + "]";
	}

}
