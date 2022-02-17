package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemsController implements CrudController<Item> {
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemsDAO itemsDAO;
	private Utils utils;

	
	public ItemsController(ItemsDAO itemsDAO, Utils utils) {
		super();
		this.itemsDAO = itemsDAO;
		this.utils = utils;
	}
	@Override
	
	public List<Item> readAll() {
		List<Item> item = itemsDAO.readAll();
		for (Item items : item) {
			LOGGER.info(items);
		}
		return item;
	
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter a name for the product");
		String name = utils.getString();
		LOGGER.info("Please enter the value of the product");
		Double value = utils.getDouble();
		Item item = itemsDAO.create(new Item(name, value));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a name for the product");
		String name = utils.getString();
		LOGGER.info("Please enter the value of the product");
		Double value = utils.getDouble();
		Item item = itemsDAO.update(new Item(id, name, value));
		LOGGER.info("Item Updated");
		return item;
		
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemsDAO.delete(id);
		
	}

}
