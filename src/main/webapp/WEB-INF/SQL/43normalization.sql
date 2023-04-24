-- 정규화
-- 첫번째 정규화 first normal form 1nf (p215)
-- 358p 참고
-- 규칙1 열은 원자적 값만을 포함한다
-- 규칙2 같은 데이터가 여러 열에 반복되지 말아야 한다
-- 규칙3 각 행은 유일무이한 기본키를 가지고 있어야 한다(primary key)

-- 책 (p216 ~ p217)  
-- 기본키 (primary key): 각 레코드를 다른 레코드와 구분하는 열 
-- 1) 기본키는 null 이 될 수 없다 
-- 2) 기본키는 record가 삽일 될 때 같이 값이 있어야 한다 
-- 3) 기본키는 간결해야 한다 
-- 4) 기본키의 값은 변경 불가능하다
-- > 기본키를 위한 열을 새로 만든다 가장좋은 방법이긴 하지만 항상 그런것은 아님 natural key의 사용가능성도 염두해 두어야함

-- 가장 좋은 기본키는 기본키를 위한 열을 새로 만드는 것

-- 예제) 학생이름, 전화번호
use w3schools;
CREATE TABLE Student (
	StudentId Int PRIMARY Key AUTO_INCREMENT,
    Name VARCHAR(50)    
);

Drop Table Student;


Create Table StudentPhone (
	Id Int PRIMARY Key AUTO_INCREMENT,
	StudentId Int,
    Phone VARCHAR(50)
);
drop table StudentPhone;

-- 예제) 교제 정보를 저장할 테이블 작성 
CREATE TABLE Books (
	BookId Int PRIMARY Key AUTO_INCREMENT,
    Title VARCHAR(50),
    Author VARCHAR(50),
    Price Int,
    Publisher VARCHAR(50),
    PublisherTel VARCHAR(20)
);



-- 두번째 정규화 second normal form 2nf (p369)
-- 규칙1) 1NF 여야 한다 
-- 규칙2) 부분적 함수 의존이 없다.
-- 특정컬럼 변경시 다른 컬럼이 변경되면 의존되어있다함 이러하면 안됨

-- 세번째 정규화 third normal form 3nf (p374)
-- 규칙1) 2nf 이다 
-- 규칙2) 이행적 종속이 없다 
-- 이행적 종속이란 우승자 생년 월일은 우승자에 종속되어 있음 이러한 경우 종속되어있는 2개의 행은 따로 분리 하는 것이 이행적 종속을 없애는 법 
