

create table pangpang.User (
	id int primary key, 
	user_name varchar(20) not null, 
	password varchar(32) not null, 
	last_login_ip varchar(15),
	last_login_time timestamp,
	login_times smallint,
	disabled char(1) default 'N',
	need_change_pwd char(1) default 'N',
	pwd_change_date date
);

create table pangpang.User_Info(
	user_id int,
	nick_name varchar(20),
	real_name varchar(30),
	sex char(1),
	age smallint,
	dept_id int,
	role_id int,
	company varchar(50),
	email varchar(50),
	telephone varchar(20),
	mobile varchar(20),
	address varchar(200),
	remark varchar(100),
	create_date timestamp default current_timestamp,
	update_date timestamp
);

alter table pangpang.User_Info
  add constraint FK_User_Info_User_ID foreign key (user_id)
  references pangpang.User(id);
  
create table pangpang.Role(
	role_id int primary key,
	role_name varchar(30),
	role_type smallint,
	description varchar(500),
	disabled char(1),
	create_date date,
	create_user int,
	update_date date,
	update_user int
);


create table pangpang.User_role(
    user_id int,
	role_id int
);

alter table pangpang.User_role
  add constraint FK_User_role_User_ID foreign key (user_id)
  references pangpang.User(id);
alter table pangpang.User_role
  add constraint FK_User_role_Role_ID foreign key (role_id)
  references pangpang.Role(role_id);
  
create table pangpang.Module(
	module_id int primary key,
	parent_id int,
	module_name varchar(50),
	LEAF char(1),
	URL varchar(100),
	list_order smallint,
	module_type smallint,
	status smallint,
	icon varchar(50),
	remark varchar(200) 
);

create table pangpang.Role_module(
	role_id int,
	module_id int,
	privilege int default 0
);

alter table pangpang.Role_module
  add constraint FK_Role_module_Role_ID foreign key (role_id)
  references pangpang.Role(role_id);
alter table pangpang.Role_module
  add constraint FK_Role_module_module_ID foreign key (module_id)
  references pangpang.Module(module_id);
alter table pangpang.Role_module
  modify column privilege int default 0 comment '1:update, 2:add, 4:remove, 8:grant';