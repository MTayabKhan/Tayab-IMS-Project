USE `ims` ;
DROP TABLE IF EXISTS `order_items`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `Item`;
DROP TABLE IF EXISTS `Customer`;
CREATE TABLE Customer (
id int auto_increment,
firstName VARCHAR (255) NOT NULL,
surName VARCHAR (255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Item (
id int auto_increment,
name VARCHAR (255) NOT NULL,
value int (255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Orders (
id int auto_increment,
CustomerID int (255) NOT NULL,
Order_itemsID int (255) NOT NULL,
PRIMARY KEY (id)


);

CREATE TABLE order_items (
id int auto_increment,
itemID int (255) NOT NULL,
OrdersID int (255) NOT NULL,
PRIMARY KEY (id)


);
ALTER TABLE orders ADD CONSTRAINT fk_customerID FOREIGN KEY (CustomerID) REFERENCES customer(id);
ALTER TABLE orders ADD CONSTRAINT fk_order_itemsID FOREIGN KEY (order_itemsID) REFERENCES order_items(id);

ALTER TABLE order_items ADD CONSTRAINT fk_ordersID FOREIGN KEY (OrdersID) REFERENCES Orders(id);
ALTER TABLE order_items ADD CONSTRAINT fk_item FOREIGN KEY (itemID) REFERENCES Item(id);
