


CREATE TABLE IF NOT EXISTS departments(
 id int PRIMARY KEY ,
 dept_description VARCHAR,
 dept_deptname VARCHAR,
 dept_empnumber INTEGER);

CREATE TABLE IF NOT EXISTS news(
id int PRIMARY KEY ,
writtenby VARCHAR,
content VARCHAR,
deptid INTEGER);

CREATE TABLE IF NOT EXISTS users(
id int PRIMARY KEY ,
name VARCHAR,
position VARCHAR,
deptid INTEGER,
roles VARCHAR);

CREATE TABLE IF NOT EXISTS departments_users(
id int PRIMARY KEY ,
deptid INTEGER,
userId VARCHAR);
