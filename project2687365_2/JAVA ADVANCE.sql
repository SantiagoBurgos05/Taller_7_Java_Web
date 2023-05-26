CREATE DATABASE project2687365;
USE project2687365;
CREATE TABLE users_tbl(
user_id int not null primary key auto_increment,
user_firstname VARCHAR(40) not null,
user_lastname VARCHAR(40) not null,
user_email VARCHAR(60) not null,
user_password VARBINARY(255)
);
INSERT INTO project2687365.users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('santiago'), UPPER('burgos'), 'buzon@correo.com',AES_ENCRYPT('contraseña','$2a$12$jgbB8ox.i5.O5sQ0pv7pDuguBJh0nww02ITSZuMFm1NPoLvGFYK0O'));

SELECT *,CAST(AES_DECRYPT(user_password,'$2a$12$jgbB8ox.i5.O5sQ0pv7pDuguBJh0nww02ITSZuMFm1NPoLvGFYK0O') AS CHAR(50))end_data FROM users_tbl WHERE user_id = 1;

CREATE TABLE category_tbl(
category_id int not null primary key auto_increment,
category_name VARCHAR(40) not null
);

CREATE TABLE product_tbl(
product_id int not null primary key auto_increment,
product_name VARCHAR(400) not null,
product_value decimal(10,200) not null,
category_id int not null
);

alter table product_tbl
add constraint category_id
foreign key (category_id)
references category_tbl (category_id);

select * from users_tbl;
select * from category_tbl;
select * from product_tbl;