-- CREATE TABLE Customer (
-- id int auto_increment,
-- firstName VARCHAR (255) NOT NULL,
-- surName VARCHAR (255) NOT NULL,
-- PRIMARY KEY (id)
-- );

-- CREATE TABLE Item (
-- id int auto_increment,
-- name VARCHAR (255) NOT NULL,
-- value int (255) NOT NULL,
-- PRIMARY KEY (id)
-- );

-- CREATE TABLE Orders (
-- id int auto_increment,
-- CustomerID int (255) NOT NULL,
-- Order_itemsID int (255) NOT NULL,
-- PRIMARY KEY (id),
-- FOREIGN KEY(CustomerID) REFERENCES Customer(id),
-- FOREIGN KEY(Order_itemsID) REFERENCES Order_items(id)
-- );

-- CREATE TABLE order_items (
-- id int auto_increment,
-- itemID int (255) NOT NULL,
-- OrdersID int (255) NOT NULL,
-- PRIMARY KEY (id),
-- FOREIGN key(itemID) references Item(id),
-- foreign key(OrdersID) references Orders(id)

-- );

-- select * from orders;

-- select * from item;
-- Insert into order_items (id, itemID, OrdersID) values (5, 5, 1);
-- select * from order_items;
Select o.id, c.firstName, c.surName, i.name, i.value from (((orders o 
JOIN customer c on o.CustomerID=c.id)
Join order_items oi on o.order_itemsID=oi.id)
join item i on oi.itemID=i.id)
Group by o.id
order by o.id;


