insert into user (id, user_name, PASSWORD, last_login_ip, last_login_time, login_times) 
select 0, 'admin', '54c84b40e9ff5a31472904a0cd2f0a17', '127.0.0.1', SYSDATE(), 0 from DUAL
where not EXISTS (select 1 from User where id = 0);

insert into User_Info(user_id, nick_name, real_name, role_id, email, create_date,  update_date)
select 0, 'Admin', 'Administrator', 0, 'chengwei710@163.com',now(), now() from dual
where not exists(select 1 from User_Info where user_id = 0);

insert into Role(role_id, role_name, role_type, description, disabled, create_date, create_user, update_date, update_user)
select 0, 'Administrator', 1, 'Super role: All system privileges', 'Y', now(), 0, now(), 0 from dual
where not exists (select 1 from Role where role_id = 0);

