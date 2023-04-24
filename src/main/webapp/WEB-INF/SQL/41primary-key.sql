-- PRIMARY KEY : not null unique 

CREATE TABLE MyTable24 (
	Col1 INT PRIMARY KEY -- not null + unique
    
);

DESC MyTable24;

CREATE TABLE MyTable25 (
	Col1 INT,
    PRIMARY KEY(Col1)
);
DESC MyTable25;

CREATE TABLE MyTable26 (
	Col1 Int,
    Col2 Int,
    Primary Key(Col1, Col2)
);

DESC MyTable26;
INSERT INTO MyTable26 (Col1, Col2)
VALUES (1,1); -- ok;

INSERT INTO MyTable26 (Col1, Col2)
VALUES (2,2); -- ok;

INSERT INTO MyTable26 (Col1, Col2)
VALUES (1,2); -- 가능; 조합해서 안되도록 Primary Key 상태임

SELECT * FROM MyTable26;

Create table MyTable27 (
	Col1 Int, 
    Col2 Int, 
    Primary Key(Col1),
    Primary Key(Col2)
); -- Primary Key 는 여러번 줄수 없으므로 fail

-- 제약사항 Constraints
-- DEFAULT UNIQUE NOT NULL PRIMARY KEY 
