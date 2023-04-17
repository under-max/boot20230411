-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers -- 테이블명
SET CustomerName = '서태웅' -- 변경할 컬럼과 값
WHERE CUstomerID = 1; -- 변경할 레코드의 조건