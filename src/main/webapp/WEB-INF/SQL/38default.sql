-- default 기본값 정할 수 있음 

DROP TABLE MyTable14;
CREATE TABLE MyTable14 (
	Col1 INT, 
    Col2 INT DEFAULT 99
);

INSERT INTO MyTable14 (Col1, Col2)
VALUES (100, 200);

INSERT INTO MyTable14 (Col1)
VALUES (100);

INSERT INTO MyTable14 (Col2)
VALUES (200);

SELECT * FROM  MyTable14;

CREATE TABLE MyTable15 (
	Col1 VARCHAR(30),
    Col2 VARCHAR(30) DEFAULT '기본'
);

-- 연습) 3개행 추가 
-- 1) Col1 과 Col2에 모두 값 넣기 
INSERT INTO MyTable15 (Col1, Col2)
VALUES ('값1', '값1');

-- 2) Col2에만 값 넣기
INSERT INTO MyTable15 (Col2)
VALUES ('값2');

-- 3) Col1에만 값 넣기 
INSERT INTO MyTable15 (Col1)
VALUES ('값3');

SELECT * FROM MyTable15;


CREATE TABLE MyTable16 (
	Col1 DATE DEFAULT '2000-01-01',
    Col2 DATE DEFAULT NOW(),
    Col3 DATETIME DEFAULT '1900-01-01 00:00:00',
    Col4 DATE DEFAULT NOW()
);

Insert INTO MyTable16 (Col1)
Values ('3000-03-03');

Insert INTO MyTable16 (Col2)
Values ('4000-04-04');

Insert INTO MyTable16 (Col3)
Values ('5000-05-05 05:05:05');

Insert INTO MyTable16 (Col4)
Values ('6000-06-06 06:06:06');

SELECT * FROM MyTable16;


