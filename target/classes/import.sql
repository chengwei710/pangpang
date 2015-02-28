insert into Member (id, name, email, phone_number) 
select 0, 'John Smith', 'john.smith@mailinator.com', '2125551212' from dual
where not exists(select 1 from Member where id = 0);

insert into Role(role_id, role_name, role_type, description, disabled, create_date, create_user, update_date, update_user)
select 0, 'Administrator', 1, 'Super role: All system privileges', 'Y', now(), 0, now(), 0 from dual
where not exists (select 1 from Role where role_id = 0);

	
insert into User(id, user_name, password, last_login_ip, last_login_time, login_times, disabled, need_change_pwd,pwd_change_date)
select 0, 'admin', '1234', '0.0.0.0', now(), 0, 'N', 'N', now() from dual
where not exists(select 1 from User where id = 0);

insert into User_Info(user_id, nick_name, real_name, role_id, email, create_date,  update_date)
select 0, 'Admin', 'Administrator', 0, 'chengwei710@163.com',now(), now() from dual
where not exists(select 1 from User_Info where user_id = 0);