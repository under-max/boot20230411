-- Unique 중복 허용 안함 

CREATE TABLE MyTable21 (
	Col1 INT, 
    Col2 INT UNIQUE
);

INSERT INTO MyTable21 (Col1, Col2)
VALUES (1,1); -- ok

INSERT INTO MyTable21 (Col1, Col2)
VALUES (2,2); -- ok

INSERT INTO MyTable21 (Col1, Col2)
VALUES (2,3); -- ok

INSERT INTO MyTable21 (Col1, Col2)
VALUES (4,3); -- fail

SELECT * FROM MyTable21;

DESC MyTable21;

-- 예제
CREATE TABLE MyTable22 (
	ssn VARCHAR(13) UNIQUE,
    name VARCHAR(20)
);

INSERT INTO MyTable22 (ssn, name)
VALUES ('1', '정대만');

INSERT INTO MyTable22 (ssn, name)
VALUES ('1', '송태섭'); -- fail

INSERT INTO MyTable22 (ssn, name)
VALUES (NULL, '채소연'); -- 가능

INSERT INTO MyTable22 (ssn, name)
VALUES (NULL, '강백호'); -- 가능

SELECT * FROM MyTable22; 
-- not null unique = primary key
CREATE TABLE MyTable23 (
	Col1 VARCHAR(20) Not Null Unique Default ''
);

desc MyTable23;
