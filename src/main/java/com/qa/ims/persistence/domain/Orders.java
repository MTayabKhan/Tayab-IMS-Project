package com.qa.ims.persistence.domain;



import java.util.Objects;

public class Orders {
	private Long id;
	private Long CustomerID;
	private Long Order_itemsID;
	private String firstName;
	private String itemName;
	private Long sum;


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


	public Orders(Long id, String firstName, String itemName, Long sum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.itemName = itemName;
		this.sum = sum;
	}


	

	public void setOrder_itemsID(Long order_itemsID) {
		Order_itemsID = order_itemsID;
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
		return Objects.hash(CustomerID, Order_itemsID, id);
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
		return Objects.equals(CustomerID, other.CustomerID) && Objects.equals(Order_itemsID, other.Order_itemsID)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", CustomerID =" + CustomerID + ", Order_itemsID =" + Order_itemsID + "]";
	}
	
}


