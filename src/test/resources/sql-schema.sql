DROP TABLE IF EXISTS `order_items`;
DROP TABLE IF EXISTS `Orders`;
DROP TABLE IF EXISTS `customer`;
DROP TABLE IF EXISTS `Item`;



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
PRIMARY KEY (id),
FOREIGN KEY(CustomerID) REFERENCES Customer(id),
FOREIGN KEY(Order_itemsID) REFERENCES Order_items(id));

CREATE TABLE IF NOT EXISTS order_items (
id int auto_increment,
itemID int (255) NOT NULL,
OrdersID int (255) NOT NULL,
PRIMARY KEY (id),
FOREIGN key(itemID) references Item(id),
foreign key(OrdersID) references Orders(id)

);

