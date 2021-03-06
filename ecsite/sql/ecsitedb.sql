set names utf8;
set foreign_key_checks = 0;

drop database if exists ecsite;
create database if not exists ecsite;
use ecsite;

drop table if exists item_info_transaction;
drop table if exists login_user_transaction;
drop table if exists login_master_transaction;
drop table if exists user_buy_item_transaction;

/* 商品情報テーブル ここから */
create table item_info_transaction(
	id int not null primary key auto_increment,
	item_category varchar(30),
	item_name varchar(30),
	item_price int,
	item_stock int,
	item_image varchar(256),
	insert_date datetime,
	update_date datetime
);
insert into item_info_transaction values
	(1,"Fruits","さくらんぼ",400,100,"./img/item/さくらんぼ.png",now(),now()),
	(2,"Fruits","洋梨",150,100,"./img/item/洋梨.png",now(),now()),
	(3,"Fruits","オレンジ",100,100,"./img/item/オレンジ.png",now(),now()),
	(4,"Fruits","レモン",150,100,"./img/item/レモン.png",now(),now()),
	(5,"Fruits","りんご",100,100,"./img/item/りんご.png",now(),now()),
	(6,"Desserts","ショートケーキ",300,100,"./img/item/ショートケーキ.png",now(),now()),
	(7,"Desserts","パンケーキ",500,100,"./img/item/パンケーキ.png",now(),now()),
	(8,"Desserts","エクレア",150,100,"./img/item/エクレア.png",now(),now()),
	(9,"Desserts","クッキー",100,100,"./img/item/クッキー.png",now(),now()),
	(10,"Desserts","マカロン",450,100,"./img/item/マカロン.png",now(),now()),
	(11,"Foods","エビフライ弁当",550,100,"./img/item/エビフライ弁当.png",now(),now()),
	(12,"Foods","唐揚げのり弁当",550,100,"./img/item/唐揚げのり弁当.png",now(),now()),
	(13,"Foods","カレーライス",500,100,"./img/item/カレーライス.png",now(),now()),
	(14,"Foods","かつ丼",500,100,"./img/item/かつ丼.png",now(),now()),
	(15,"Foods","ラーメン",500,100,"./img/item/ラーメン.png",now(),now()),
	(16,"Seasonings","ケチャップ",250,100,"./img/item/ケチャップ.png",now(),now()),
	(17,"Seasonings","マヨネーズ",250,100,"./img/item/マヨネーズ.png",now(),now()),
	(18,"Seasonings","ソース",250,100,"./img/item/ソース.png",now(),now()),
	(19,"Seasonings","サラダ油",250,100,"./img/item/サラダ油.png",now(),now()),
	(20,"Seasonings","醤油",250,100,"./img/item/醤油.png",now(),now());
/* 商品情報テーブル ここまで */

/* 会員情報テーブル ここから */
create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);
insert into login_user_transaction values
	(1,"internous","internous","guest",now(),now()),
	(2,"internous2","internous2","guest2",now(),now()),
	(3,"internous3","internous3","guest3",now(),now());
/* 会員情報テーブル ここまで */

/* カート情報テーブル ここから */
create table cart_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
insert_date datetime,
delete_date datetime
);
/* カート情報テーブル ここまで */

/* 購入商品情報テーブル ここから */
create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);
/* 購入商品情報テーブル ここまで */

/* 管理者情報テーブル ここから */
create table login_master_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
master_name varchar(50),
insert_date datetime,
updated_date datetime
);
insert into login_master_transaction values
	(1,"master","master","test",now(),now()),
	(2,"master2","master2","test2",now(),now()),
	(3,"master3","master3","test3",now(),now());
/* 管理者情報テーブル ここまで */
