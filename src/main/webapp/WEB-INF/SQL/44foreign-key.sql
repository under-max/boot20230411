-- 학생명, 전화번호(여러개 가능)
drop table Student;
drop table StudentPhone;
-- 제1정규화 만족
CREATE TABLE Student( 
	Id Int PRIMARY Key AUTO_INCREMENT,
    Name VARCHAR(50)    
);

-- 전화번호 여러개 가능 하므로 따로 뺌 
-- 전화번호가 어느 학생의 전화번호인지 알아야 하는데 어떤 데이터와 관련이있는지 컬럼을 넣어야 하는데 보통 Key 컬럼을 넣게됨
-- 참조하고 있다고 하는게 참조 키 foreign-key (외래키 참조키) 
-- 여기서 StudentId는 PrimaryKey Student의
Create Table StudentPhone(
	Id Int Primary Key AUTO_INCREMENT,
	StudentId Int,
	Phone VARCHAR(50),
    FOREIGN KEY (StudentId) REFERENCES Student(Id)
);

DESC Student;
DESC StudentPhone;
-- 자연키 예
CREATE TABLE StudentPhone (
	StudentId Int, 
    Phone VARCHAR(50),
    PRIMARY KEY (StudentId, Phone)
);

-- 데이터 입력
INSERT INTO Student (Name) VALUES ('손흥민');
INSERT INTO Student (Name) VALUES ('박지성');

SELECT * FROM Student;

INSERT INTO StudentPhone (StudentId, Phone) VALUES(1, '010-9999-8888'); 
INSERT INTO StudentPhone (StudentId, Phone) VALUES(2, '010-8888-9999');

SELECT * FROM StudentPhone;

INSERT INTO StudentPhone (3, '010-7777-7777'); 
-- fail Student id 

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (Null, '010-5555-5555');
-- 이건 가능 

SELECT * FROM StudentPhone;

DELETE FROM StudentPhone
WHERE StudentId IS NULL;

ALTER TABLE StudentPhone 
MODIFY COLUMN StudentId INT NOT NULL;

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (1, '010-7777-7777');

SELECT * FROM StudentPhone ORDER BY StudentId ASC;


DELETE FROM Student 
WHERE Id = 2;
-- fail if you wan't a delete this data, must be delete foreign reference at StudentPhone

-- 외래키 제약사항이 있는 테이블의 데이터를 먼저 지워야 함 
DELETE FROM StudentPhone
WHERE StudentId = 2;

DELETE FROM Student 
WHERE Id = 2;

SELECT * FROM Student;
