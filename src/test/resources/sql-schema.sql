CREATE DATABASE IF NOT EXISTS IMSTest;
USE IMSTest;
DROP TABLE IF EXISTS `order_items`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `Item`;
DROP TABLE IF EXISTS `Customer`;




CREATE TABLE IF NOT EXISTS Customer (
id int auto_increment,
firstName VARCHAR (255) NOT NULL,
surName VARCHAR (255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Item (
id int auto_increment,
name VARCHAR (255) NOT NULL,
value int (255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS orders (
id int auto_increment,
CustomerID int (255) NOT NULL,
Order_itemsID int (255) NOT NULL,
PRIMARY KEY (id)

);


CREATE TABLE IF NOT EXISTS order_items (
id int auto_increment,
itemID int (255) NOT NULL,
OrdersID int (255) NOT NULL,
PRIMARY KEY (id)

);

