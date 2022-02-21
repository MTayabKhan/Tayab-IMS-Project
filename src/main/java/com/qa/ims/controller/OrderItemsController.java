package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.qa.ims.persistence.dao.OrderItemsDAO;

import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;

public class OrderItemsController implements CrudController<OrderItems>{

	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderItemsDAO orderitemsDAO;
	private Utils utils;
	
	public OrderItemsController(OrderItemsDAO orderitemsDAO, Utils utils) {
		super();
		this.orderitemsDAO = orderitemsDAO;
		this.utils = utils;
	}

	@Override
	public List<OrderItems> readAll() {
		List<OrderItems> orderitems = orderitemsDAO.readAll();
		for (OrderItems orderitem : orderitems) {
			LOGGER.info(orderitem);
		}
		return orderitems;
	}
	@Override
	public OrderItems create() {
		LOGGER.info("Please enter the ID of the item");
		Long itemID = utils.getLong();
		LOGGER.info("Please enter the ID of the order");
		Long OrdersID = utils.getLong();
		OrderItems orderitems = orderitemsDAO.create(new OrderItems(itemID, OrdersID));
		LOGGER.info("Item added to Order!");
		return orderitems;
	}

	@Override
	public OrderItems update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the ID of the new item you want to add");
		Long itemID = utils.getLong();
		LOGGER.info("Please enter the ID of the order you want to add the item to");
		Long OrdersID = utils.getLong();
		OrderItems orderitems = orderitemsDAO.update(new OrderItems(id, itemID, OrdersID));
		LOGGER.info("Order Updated");
		return orderitems;
	}


	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the Order and Items relation you would like to delete");
		Long id = utils.getLong();
		return orderitemsDAO.delete(id);
	}

}