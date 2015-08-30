insert into user (id, user_name, PASSWORD, last_login_ip, last_login_time, login_times) 
select 0, 'admin', '54c84b40e9ff5a31472904a0cd2f0a17', '127.0.0.1', SYSDATE(), 0 from DUAL
where not EXISTS (select 1 from User where id = 0);

insert into User_Info(user_id, nick_name, real_name, role_id, email, create_date,  update_date)
select 0, 'Admin', 'Administrator', 0, 'chengwei710@163.com',now(), now() from dual
where not exists(select 1 from User_Info where user_id = 0);

insert into Role(role_id, role_name, role_type, description, disabled, create_date, create_user, update_date, update_user)
select 0, 'Administrator', 1, 'Super role: All system privileges', 'Y', now(), 0, now(), 0 from dual
where not exists (select 1 from Role where role_id = 0);


insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 1, 'System Administration', 1, null, null, 0, 'N', 'icon-cog', null, 1 from DUAL
where not EXISTS(SELECT 1 from module where module_id = 1);

insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 2, 'User Management', 1, 1, '/pangpang/home', 0, 'Y', 'icon-user', null, 1 from DUAL
where not EXISTS (select 1 from module where module_id = 2);

insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 3, 'Role Management', 1, 1, '/pangpang/home', 1, 'Y', 'icon-ban-circle', null, 1 from DUAL
where not exists (select 1 from module where module_id = 3);

insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 4, 'Module Management', 1, 1, '/pangpang/module', 2, 'Y', 'icon-cog', null, 1 from DUAL
where not EXISTS (select 1 from module where module_id = 4);

insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 5, 'Personal Management', 1, null, null, 1, 'N', 'icon-user-md', null, 1 from dual
where not exists (select 1 from module where module_id = 5);

insert into Module(module_id, module_name, module_type, parent_id, url, list_order, leaf, icon, remark, status)
select 6, 'Personal Message', 1, 5, '/pangpang/home', 1, 'Y', 'icon-envelope', null, 1 from DUAL
where not EXISTS (select 1 from module where module_id = 6);

insert into Role_module(role_id, module_id, privilege)
select 0, 1, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 1);

insert into Role_module(role_id, module_id, privilege)
select 0, 2, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 2);

insert into Role_module(role_id, module_id, privilege)
select 0, 3, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 3);

insert into Role_module(role_id, module_id, privilege)
select 0, 4, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 4);

insert into Role_module(role_id, module_id, privilege)
select 0, 5, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 5);

insert into Role_module(role_id, module_id, privilege)
select 0, 6, 0 from dual where not exists (select 1 from Role_module where role_id = 0 and module_id = 6);

