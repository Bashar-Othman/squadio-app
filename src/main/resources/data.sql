

INSERT INTO roles(id,name) VALUES(1,'user');
INSERT INTO roles(id,name) VALUES(2,'admin');

INSERT INTO USERS  (id,password, username, email) 
VALUES('qbnKoolq','$2a$10$n5L1l4cUWLNt4JKUZrGhNeLfEMsCOs3Nxf83jFv4ay5hw1dJKDZVq','Admin','Admin@test.com'),
('qbnKddlq70','$2a$10$PzDN4vvXh0LkMenNHYtNBenu5sCFFsvOdkGQ1T681lNqBiP8uE/5G','Mohamed','Mohamed@test.com'),
('qbnVcxz90','$2a$10$g.CtKqbh5TahN9T83O23RuwGQDi5k8QMGXWfOR0b5rZ3hqKZG6Gpi',	'John','John@test.com'),
('qbnOlkf100','$2a$10$s/FPQ65ywZmf.MA9Sxh6Hep8gbAqw7/36DWvWu1.qv3fcoQJkuuDm','Kumar','Kumar@test.com');

INSERT INTO USER_ROLES (user_id,role_id)
VALUES ('qbnKoolq',2),
('qbnKddlq70',1),
('qbnVcxz90',1),
('qbnOlkf100',1);


INSERT INTO 
	ACCOUNTS (id,account_type,account_number, user_id, iban,balance,currency) 
VALUES
  	('CbIJb0i3vQ','SAVING','128376876123', 'qbnKddlq70', 'AE000128376876123003' ,'11201.22','USD'),
  	('YrIuty66t3','SAVING','128376876456' ,'qbnVcxz90', 'AE000128376876124004' ,'50000','USD'),
  	('PzIJb0i3gg','SAVING','128376876789', 'qbnOlkf100', 'AE000128376876125005' ,'444541','USD');



INSERT INTO 
	STATEMENTS (id,account_id,account_number,description,amount,date_of_trs,currency) 
VALUES
  	('qww1111','CbIJb0i3vQ','128376876123', 'purchase of item abc', '1233.2' ,'2020-09-12','USD'),
  	('asas1122','YrIuty66t3','128376876456', 'purchase of item KAKA', '1000.5' ,'2022-01-01','USD'),
  	('sxc3221','PzIJb0i3gg','128376876789', 'purchase of item NANA', '40.50' ,'2020-12-08','USD');

