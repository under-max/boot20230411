use w3schools;

desc MyTable30;
CREATE TABLE MyTable30 (
	Col1 INT,
    Col2 VARCHAR(30)
);

INSERT INTO MyTable30 (Col1, Col2)
VALUES (30, 'Java');

SELECT * FROM MyTable30;

INSERT INTO MyTable30 (Col1)
VALUES ('33'); -- 가능

INSERT INTO MyTable30 (Col1)
VALUES ('three'); -- fail

Insert into MyTable30 (Col2)
VALUES (77);


-- 
CREATE TABLE MyTable31 (
	Col1 DATE,
    Col2 DATETIME
);

desc MyTable31;

-- yyyy-mm-dd
-- yyyy-mm--dd hh:mm:ss
INSERT INTO MyTable31 (Col1, Col2)
VALUES('2023-04-20', '2023-04-20 09:32:12');

SELECT * FROM MyTable31; 

CREATE TABLE MyTable32 (
	Name VARCHAR(30),
    Age INT,
    Price DEC(10,2),
    Birth DATE,
    Inserted DATETIME
);

SELECT * FROM MyTable32;

DROP TABLE MyTalbe32;

CREATE TABLE MyTable33 (
	Title VARCHAR(200),
    Published DATE,
    Price INT,
    Updated DATETIME,
    Weight Dec(10, 3)
);

SELECT * FROM MyTable32;

desc MyTable32;

SELECT * FROM MyTable33;

DESC MyTable33;

          
DESC Customers;

DESC Suppliers;

DESC Employees;