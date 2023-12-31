create database coffee_order charset utf8 collate utf8_bin;

create table user (
    user_id int auto_increment primary key ,
    username varchar(255) unique not null,
    password varchar(255) not null,
    full_name varchar(255),
    user_deleted boolean,
    source varchar(50),
    avatar varchar(255)
);

create table category (
    cat_id int auto_increment primary key,
    cat_name varchar(255) not null,
    cat_deleted boolean,
    cat_icon varchar(255)
);

create table goods_detail (
    goods_id int auto_increment primary key,
    goods_name varchar(255) not null,
    goods_price decimal(10,2) not null,
    goods_number int,
    goods_weight int,
    goods_introduce varchar(255),
    goods_deleted boolean,
    goods_state int,
    goods_cat varchar(255),
    pic_url varchar(255)
);

create table `order` (
    order_id varchar(32) primary key,
    user_id int,
    goods_id int,
    address varchar(255),
    status varchar(32),
    create_time timestamp default current_timestamp,
    update_time timestamp default current_timestamp on update current_timestamp,
    order_detail varchar(255),
    total_count int,
    total_price decimal(10,2),
    order_deleted boolean,
    foreign key (user_id) references user(user_id),
    foreign key (goods_id) references goods_detail(goods_id)
);