-- Numberic (수)

-- int 정수형
-- decimal, dec 실수형 

CREATE TABLE MyTable04 (
	Col1 INT
);

INSERT INTO MyTable04 (Col1)
VALUES (33);

INSERT INTO MyTable04 (Col1)
VALUES (1234567890); -- ok

INSERT INTO MyTable04 (Col1)
VALUES (999999999); -- ok

INSERT INTO MyTable04 (Col1)
VALUES (3.14); -- 3으로 들어감 
 
select * from MyTable04; 

-- 연습) MyTable05 만들기
-- 두개의 칼럼이 모두 정수 저장 가능 

CREATE TABLE MyTable05 ( -- 4바이트 정수값으로 들어감 
	Col1 int,
    Col2 int
);

Insert into MyTable05 (Col1, Col2)
VALUES (2147483647, - 2147483648); -- ok

Insert into MyTable05 (Col1, Col2)
VALUES (2147483648, - 2147483649); -- fail

DESC MyTable05;

-- DEC 실수형 
-- DEC(총길이, 소수점 이하 길이)

CREATE TABLE MyTable06 (
	Col1 DEC(5, 2),
	Col2 DEC(3, 1)
);

desc MyTable06;

Insert into MyTable06 (Col1)
Values (444.44);

Insert into MyTable06 (Col1)
Values (-444.44);

Insert Into MyTable06 (Col1)
Values (1000.99); -- fail

Insert Into MyTable06 (Col1)
Values (999.999); -- fail

-- 연습) MyTable07 만들기
-- 두개 컬럼 (실수형) , 총길이, 소수점 이하 길이 직접 작성 

CREATE TABLE MyTable07 (
	Col1 DEC(4,2),
    Col2 DEC(2,2)
);

DESC MyTable07;

Insert Into MyTable07 (Col1, Col2)
Values(44.44, 0.22);



-- Character(String) 문자형
-- VarChar(길이) 길이가 가변적임
CREATE TABLE MyTable02(
	Col1 VARCHAR(3), -- 길이가 3인 문자열 까지 저장
    Col2 VARCHAR(5)
);

SELECT * FROM MyTable02;
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abc', 'abcde'); -- ok

INSERT INTO MyTable02 (Col1, Col2)
VALUES ('ab', 'abcd'); -- ok

INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abcd', 'abcdef'); -- fail 단 db나 옵션에 따라 짤려서 들어가는 경우도 있으므로 주의 

-- 연습) 
-- MyTable03 
-- 3개의 컬럼 
-- 첫번쨰 컬럼 type : 문자열 10개까지 저장가능
-- 두번쨰 컬럼 type : 문자열 100개까지 저장가능
-- 세번째 컬럼 type : 문자열 1000개 까지 저장 가능

CREATE TABLE MyTable03 (
	Col1 VARCHAR(10),
    Col2 VARCHAR(100),
    Col3 VARCHAR(1000)
);

DROP TABLE MyTable03;
DROP TABLE MyTable04;
DROP TABLE MyTable05;
DESC MyTable03;


-- 날짜 시간 date
-- date 날짜 (YYYY- MM-DD)
-- DateTime 날짜 시간 (YYYY-MM-DD hh:mm:ss)

Create table MyTable08 (
	Col1 Date,
    Col2 DateTime
);

DESC MyTable08;

INSERT INTO MyTable08 (Col1)
VALUES ('2023-04-19');

SELECT * FROM MyTable08;

Insert into MyTable08 (Col1)
VALUES ('9999-12-31');

Insert into MyTable08 (Col1)
VALUES ('1000-01-01');

INSERT INTO MyTable08 (Col2)
VALUES ('2023-04-19 11:41:30');

INSERT INTO MyTable08 (Col2)
VALUES ('9999-12-31 23:59:59');

INSERT INTO MyTable08 (Col2)
VALUES ('1000-01-01 00:00:00');

SELECT NOW();

INSERT INTO MyTable08 (Col1, Col2)
VALUES (now(), now());

SELECT * FROM MyTable08;

-- 예제) 반 학생들의 정보를 넣고 싶음 MyTable09 (학생 정보) 
-- 학생이름, 성별, 생년월일, 기타정보, 시험성적 

CREATE TABLE MyTable09 (
	StudentName VARCHAR(20),
    Gender VARCHAR(1),
    BrithDate DATE,
    TestScore DEC(5, 2),
    Extra VARCHAR(1000)
);

INSERT INTO MyTable09 (StudentName, Gender, BrithDate, TestScore, Extra)
VALUES ("손흥민", "여자", "2000-02-02", 99.99, '축구선수');

-- 연습) 내가 가지고 있는 교재 정보 저장 MyTable10

CREATE TABLE MyTable10 (
	Title VARCHAR(50),
    Author VarChar(20),
    Price INT,
    PublicationDate DATE
);

INSERT INTO MyTable10 (Title, Author, Price, PublicationDate)
VALUES ('Spring', '방구석코더', 25000, '2022-05-08');

INSERT INTO MyTable10 (Title, Author, Price, PublicationDate)
VALUES ('React', "vitos", 24000, '2021-08-05');

SELECT * FROM MyTable10;