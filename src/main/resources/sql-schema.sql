create database if not exists ims;
create table if not exists ims.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table if not exists ims.items(item_id int primary key auto increment, item_name varchar(40), price decimal(10,2));
create table if not exists ims.orders(order_id int primary key auto_increment, customer_id int, date_ordered date, foreign key(customer_id) references customers(id));
create table if not exists ims.orderItems(orderitems_id primary key auto_increment, order_id int, item_id int, foreign key(order_id) references orders(order_id), foreign(item_id) references items(items_id));