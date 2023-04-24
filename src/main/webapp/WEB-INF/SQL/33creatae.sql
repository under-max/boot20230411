-- create-table
DESC MyTable10;

-- 테이블 복사 

-- SHOW CREATE TABLE : 테이블 생성 명령 보기 복사해서 붙여넣기로 table 복사 가능 
SHOW CREATE TABLE MyTable10;

CREATE TABLE `MyTable11` (
   `Title` varchar(50) DEFAULT NULL,
   `Author` varchar(20) DEFAULT NULL,
   `Price` int(11) DEFAULT NULL,
   `PublicationDate` date DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 
 DESC MyTable10;
 DESC MyTable11;
 
 -- 같은 컬럼명 타입으로 새로운 테이블 만들기 데이터도 같이 들어감 
 CREATE TABLE MyTable13 AS SELECT * FROM MyTable10;
 
 DESC MyTable13;
 SELECT * FROM MyTable13;
 