CREATE DATABASE organisation;

\c organisation;

CREATE TABLE IF NOT EXISTS departments(
 id serial PRIMARY KEY ,
 dept_description VARCHAR,
 dept_deptname VARCHAR,
 dept_empnumber INTEGER);

CREATE TABLE IF NOT EXISTS news(
id serial PRIMARY KEY ,
writtenby VARCHAR,
content VARCHAR,
deptid INTEGER);

CREATE TABLE IF NOT EXISTS users(
id serial PRIMARY KEY ,
name VARCHAR,
position VARCHAR,
deptid INTEGER,
roles VARCHAR);

CREATE DATABASE organisation_test WITH TEMPLATE organisation;
