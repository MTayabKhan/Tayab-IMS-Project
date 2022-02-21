package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrderItems {

	private Long id;
	private Long itemID;
	private Long OrdersID;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getItemID() {
		return itemID;
	}
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}
	public Long getOrdersID() {
		return OrdersID;
	}
	public void setOrdersID(Long ordersID) {
		OrdersID = ordersID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(OrdersID, id, itemID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return Objects.equals(OrdersID, other.OrdersID) && Objects.equals(id, other.id)
				&& Objects.equals(itemID, other.itemID);
	}
	public OrderItems(Long id, Long itemID, Long ordersID) {
		super();
		this.id = id;
		this.itemID = itemID;
		OrdersID = ordersID;
	}

	
	
	@Override
	public String toString() {
		return "OrderItems [id = " + id + ", itemID = " + itemID + ", OrdersID=" + OrdersID + "]";
	}
		public OrderItems(Long itemID, Long ordersID) {
			super();
			this.itemID = itemID;
			OrdersID = ordersID;
		}
	
	
}
