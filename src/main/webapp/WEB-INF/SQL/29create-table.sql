-- create table 새 테이블 생성 
-- table 이름 : 작성 규칙 (회사마다 틀림) 
-- 우리 과정에서는 UpperCarmelCase
-- snake_case쓰는 경우도 있고 

CREATE TABLE MyTable01(
	-- 컬럼정의
    -- 컬럼명 값의 타입 
    -- 컬럼명 작성 규칙 (회사 규칙)
    -- 우리과정에서는 UpperCarmelCase 로 한당 대소문자 구분안함 table 만 구분함 이건 db 버전이나 db에 따라 틀림
    Col1 INT,
    Col2 VARCHAR(255)
    
);

-- DESC : 테이블 구조 확인

DESC MyTable01;

SELECT * FROM MyTable01;

INSERT INTO MyTable01 (Col1, Col2)
VALUES (30, '가나다');



