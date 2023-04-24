-- ALTER TABLE MoDIFY COLUMN : 제약사항 추가 

CREATE TABLE MyTable28 (
	Col1 INT, 
    Col2 INT, 
    Col3 INT, 
    Col4 INT
);

DESC MyTable28;

ALTER TABLE MyTable28
MODIFY COLUMN Col1 INT UNIQUE;

ALTER TABLE MyTable28 
MODIFY COLUMN Col2 INT Not Null;

-- col3 에 default 0 제약사항 추가 
ALTER TABLE MyTable28
MODIFY COLUMN Col3 INT DEFAULT 0;

-- col4 에 not null unique default 100제약사항 추가 
ALTER TABLE MyTable28
MODIFY COLUMN Col4 INT NOT NULL UNIQUE DEFAULT 100;


-- Add Primary Key : PRIMARY KEY 추가
CREATE TABLE MyTable29 (
	Col1 INT, 
    Col2 INT, 
    Col3 INT
);

Alter Table MyTable29 
ADD PRIMARY KEY (Col1, Col2);

DESC MyTable29;