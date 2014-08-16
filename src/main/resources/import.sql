
-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212');

insert into User(id, user_name, password, last_login_ip, last_login_time, login_times, disabled, need_change_pwd,pwd_change_date)
values(1, 'conway', '', null, null, 0, 'N', 'N', null);