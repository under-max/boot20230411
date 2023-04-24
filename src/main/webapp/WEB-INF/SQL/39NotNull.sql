-- NotNull Null 허용 안함 

CREATE TABLE MyTable17 (
	Col1 INT,
    Col2 INT NOT NULL
);

INSERT INTO MyTable17 (Col1, Col2)
Values (100, 200);

INSERT INTO MyTable17 (Col2)
VALUES (200);

INSERT INTO MyTable17 (Col1)
VALUES (100); -- fail not null 이기 때문에 반드시 들어가야함 

-- 연습) MyTable18 , 두개 컬럼, VARCHAR(20)
-- 두번쨰 컬러만 NOT NULL 제약사항 적용 

CREATE TABLE MyTable18 (
	Col1 VARCHAR(20),
    Col2 VARCHAR(20) NOT NULL
);

INSERT INTO MyTable18 (Col1, Col2)
Values ('abc', 'def');

INSERT INTO MyTable18 (Col2)
Values ('ghi');

INSERT INTO MyTable18 (Col1)
Values ('abc'); -- fail not null 있으므로 값입력 필요

DESC MyTable18;

-- 
CREATE TABLE MyTable19 (
	Col1 INT DEFAULT 0,
    Col2 INT NOT NULL
);

DESC MyTable19;

INSERT INTO MyTable19 
VALUES (100,200);

INSERT INTO MyTable19 (Col2)
VALUES (200);

select * from MyTable19;

INSERT INTO MyTable19 (Col1)
VALUES (100); -- fail 

Insert Into MyTable19 
VALUES (Null, 200); -- 가능

SELECT * FROM MyTable19;

-- not null default 조합 가능 
CREATE TABLE MyTable20 (
	Col1 INT, -- Null 허용 DEFAULT 없음 
	Col2 INT Not null, -- null 허용안함, default 없음 
    CoL3 INT DEFAULT 0, -- null 허용 default 0
    Col4 INT NOT NULL DEFAULT 0 -- null 허용 안함 default 0
);

DESC MyTable20;

