package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Orders;

import com.qa.ims.utils.Utils;

public class OrdersController implements CrudController<Orders> {
	private OrdersDAO ordersDAO;
	private Utils utils;
	public static final Logger LOGGER = LogManager.getLogger();

	public OrdersController(OrdersDAO ordersDAO, Utils utils) {
		super();
		this.ordersDAO = ordersDAO;
		this.utils = utils;
	}

	@Override
	public List<Orders> readAll() {
		List<Orders> orders = ordersDAO.readAll();
		for (Orders order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Orders create() {
		LOGGER.info("Please enter a CustomerID for the product");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter the Order_ItemsID of the product");
		Long Order_itemsID = utils.getLong();
		Orders orders = ordersDAO.create(new Orders(customerID, Order_itemsID));
		LOGGER.info("Order created");
		return orders;
	}

	@Override
	public Orders update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a CustomerID for the order");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter the Order_itemID of the order");
		Long Order_itemsID = utils.getLong();
		Orders item = ordersDAO.update(new Orders(id, customerID, Order_itemsID));
		LOGGER.info("Item Updated");
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return ordersDAO.delete(id);
	}

}
