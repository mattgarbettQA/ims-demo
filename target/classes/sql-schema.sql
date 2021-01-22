create database if not exists ims;
create table if not exists ims.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table if not exists ims.items(item_id int primary key auto_increment, item_name varchar(40), price decimal(10,2));
create table if not exists ims.orders(order_id int primary key auto_increment, customer_id int, date_ordered varchar(40), total_price decimal(10,2), foreign key(customer_id) references customers(id));
create table if not exists ims.orderItems(orderitems_id int primary key auto_increment, order_id int, item_id int, quantity int, foreign key(order_id) references orders(order_id), foreign key(item_id) references items(item_id));