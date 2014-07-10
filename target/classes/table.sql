create table User (
	id number(8) primary key, 
	user_name varchar(20) not null, 
	password varchar(32) not null, 
	last_login_ip varchar(15),
	last_login_time timestamp,
	login_times number(2),
	disabled char(1) default 'N',
	need_change_pwd char(1) default 'N',
	pwd_change_date date
);

create table User_Info(
	user_id number(8),
	nick_name varchar(20),
	real_name varchar(30),
	sex char(1),
	age number(3),
	dept_id number(8),
	role_id nubmer(8),
	company varchar(50),
	email varchar(50),
	telephone varchar(20),
	mobile varchar(20),
	address varchar(200),
	remark varchar(100),
	create_date date default sysdate,
	update_date date
);

alter table User_Info
  add constraint FK_User_Info_User_ID foreign key (user_id)
  references User(id);
  
create table Role(
	role_id number(8) primary key,
	role_name varchar(30),
	role_type number(3),
	description varchar(500),
	disabled char(1),
	create_date date,
	create_user number(8),
	update_date date,
	update_user number(8)
);


create table User_role(
    user_id number(8),
	role_id number(8)
);

alter table User_role
  add constraint FK_User_role_User_ID foreign key (user_id)
  references User(id);
alter table User_role
  add constraint FK_User_role_Role_ID foreign key (role_id)
  references Role(role_id);
  
create table Module(
	module_id number(10) primary key,
	parent_id number(10),
	module_name varchar(50),
	LEAF char(1),
	URL varchar(100),
	list_order number(2),
	module_type number(2),
	remark varchar(200) 
);

create table Role_module(
	role_id number(8),
	module_id number(10)
);

alter table Role_module
  add constraint FK_Role_module_Role_ID foreign key (role_id)
  references Role(role_id);
alter table Role_module
  add constraint FK_Role_module_Role_ID foreign key (module_id)
  references Module(module_id);