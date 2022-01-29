# squadio-app

Description 
Squadio-App is a Users-Accounts financial system. exposes Rest APIs with JWT authentication/Authorization process .
******************************************************************************************************************
How to Run :
The system is built on top of Spring Boot framework and Java programming language .

All you need is to open the project in IntelliJ or Netbeans as a maven project .

---------------------------------------------------------------------------------------------------------------------
Project Anatomy :
Spring Boot 
H2 database  : http://localhost:8080/h2/login.jsp (username : sa , password : password )
Java 8 or higher .

Authentication & Authorization :
localhost:8080/api/auth/signin( To get the access token and put it as Authorization header)

POST :
{
    "username":"Admin",
    "password":"admin"
    
}

The response :
{
    "id": "qbnKoolq",
    "username": "Admin",
    "email": "Admin@test.com",
    "roles": [
        "admin"
    ],
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBZG1pbiIsImlhdCI6MTY0MzQ2NDk4OCwiZXhwIjoxNjQzNTUxMzg4fQ.ZQJSkaHcX8J_MjEQV8ekUajTwsxvF-jryzz7Ab4adY1mbdP0Ii069e61QHSDCh8-hUlYStdCCqdQIyT6cZE2Cw",
    "tokenType": "Bearer"
}

or 
{
    "username":"Muhamed",
    "password":"user"
    
}

APIs useage :
Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBZG1pbiIsImlhdCI6MTY0MzQ2NDk4OCwiZXhwIjoxNjQzNTUxMzg4fQ.ZQJSkaHcX8J_MjEQV8ekUajTwsxvF-jryzz7Ab4adY1mbdP0Ii069e61QHSDCh8-hUlYStdCCqdQIyT6cZE2Cw

GET : localhost:8080/api/v1/users 

by default . the system will create table at runtime with desired users and credentials .


CREATE TABLE ACCOUNTS (
 *******************
);


CREATE TABLE STATEMENTS(
  *********************
);

ALTER TABLE ACCOUNTS
    ADD FOREIGN KEY (USER_ID) 
    REFERENCES USERS(id);

ALTER TABLE STATEMENTS
    ADD FOREIGN KEY (account_id) 
    REFERENCES ACCOUNTS(id);
    
    
    INSERT INTO roles(id,name) VALUES(1,'user');
INSERT INTO roles(id,name) VALUES(2,'admin');

INSERT INTO USERS  (id,password, username, email) 
***********************************

INSERT INTO USER_ROLES (user_id,role_id)
VALUES***********************


INSERT INTO 
	ACCOUNTS (id,account_type,account_number, user_id, iban,balance,currency) 
VALUES
  	******************************



INSERT INTO 
	STATEMENTS (id,account_id,account_number,description,amount,date_of_trs,currency) 
VALUES
  	******************************************

-----------------------------------------------------------------------------------------------------------

Application configuration :

