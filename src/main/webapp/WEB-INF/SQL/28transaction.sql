use w3schools;

-- transaction 하나의 업무 단위 
-- 하나의 transaction 여러 insert, update, delete
-- 명령문으로 구성될 수 있음  

-- 예) 이체 (A -> B) 5000원
-- A의 돈은 -5000 되어야 하고 Update 
-- B의돈은 +5000 되어야 함 Update 
-- 이 한덩어리가 transaction

CREATE TABLE BANK (
	CustomerName VARCHAR(255),
    Money INT DEFAULT 0
);

SELECT * FROM BANK;

INSERT INTO BANK 
VALUES ('A', 100000);

INSERT INTO BANK 
VALUES ('B', 100000);


-- 이체 5000원 
UPDATE BANK
SET Money = Money - 5000
WHERE CustomerName = 'A';

Update BANK
Set Money = Money + 5000
WHERE CustomerName = 'B';

-- 위의 두개가 모두 성공하거나 모두 실패하거나 해야함
-- transaction을 위해 따로 작성하는 것이 아닌 한번에 해야함 

-- commit 명령이 끝남을 알려줌 
-- 원래대로 원복하고 싶을떄 rollback

-- Commit : Transaction 완료 
-- rollback : Transaction 실패 (시작 이전으로 되돌리기)

-- 자동커밋 (autocommit) 상태임
SET autocommit = 0; -- 자동 커밋 비활성화 (disable) 비활성화 후 수동처리로 transaction 처리
SET autocommit = 1; -- 자동커밋 활성화 (enable);

UPDATE BANK
SET Money = Money - 5000
WHERE CustomerName = 'A';

UPDATE BANK
SET Money = Money + 5000
WHERE CustomerName = 'B';

SELECT * FROM BANK;

ROLLBACK; -- 마지막 커밋으로 되돌리기
-- Transaction 을 완료 할때 Commit
COMMIT;

-- 이체시 오류 (A->B 5000원 이체)
UPDATE BANK
SET Money = Money - 5000
WHERE CustomerName = 'A'; -- 실행됨 

-- 오류 생겼다고 가정 
SELECT * FROM BANK;
ROLLBACK;
COMMIT;
