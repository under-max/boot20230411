-- DataBase(schema) : 테이블이 있는곳

-- Database 만들기 CREATE DATABASE

CREATE DATABASE mydb;

use mydb;

create table MyTable11 (
	Title VARCHAR(10),
    Price INT
);

-- 데이터 베이스 지우기 
-- DROP DATABASE mydb 주의!!!!

DROP DATABASE mydb;

use w3schools;

-- mydb1 데이터베이스 만들기 
CREATE DATABASE mydb1;

-- mydb1에 새로운 테이블 만들기 
CREATE TABLE MyTable12 (
	Col1 VARCHAR(20),
    Col2 INT, 
    Col3 DATE
);
-- mydb1 데이터 베이스 삭제하기 
DROP DATABASE mydb1;

-- w3schools 데이터 베이스 사용하기 
use w3schools;

SELECT * FROM w3schools.MyTable08;
