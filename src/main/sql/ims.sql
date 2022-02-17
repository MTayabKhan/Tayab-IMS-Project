-- CREATE TABLE Customer (
-- id int auto_increment,
-- firstName VARCHAR (255) NOT NULL,
-- surName VARCHAR (255) NOT NULL,
-- PRIMARY KEY (id)
-- );

-- CREATE TABLE Items (
-- id int auto_increment,
-- name VARCHAR (255) NOT NULL,
-- value int (255) NOT NULL,
-- PRIMARY KEY (id)
-- );

-- CREATE TABLE Orders (
-- id int auto_increment,
-- CustomerID int (255) NOT NULL,
-- PRIMARY KEY (id),
-- FOREIGN KEY(CustomerID) REFERENCES Customer(id)
-- );

-- CREATE TABLE order_items (
-- id int auto_increment,
-- itemID int (255) NOT NULL,
-- OrdersID int (255) NOT NULL,
-- PRIMARY KEY (id),
-- FOREIGN key(itemID) references Items(id),
-- foreign key(OrdersID) references Orders(id)

-- );

-- ALTER TABLE orders
-- ADD COLumn Order_itemsID INT (255) NOT NULL AFTER CustomerID;
select * from orders;
