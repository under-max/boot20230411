-- Delete : 테이블의 Record 지우기 

-- 매우 주의!!! 

DELETE FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; --  지울 레코드 조건

-- 검증방법 SELECT로 확인 후 DELETE 실행
-- 지우기 전 같은 테이블 같은 조건으로 SELECT 하기~!!! 
SELECT * FROM Customers 
WHERE CustomerID = 94;

-- 93번 고객 지우기 
SELECT * FROM Customers
WHERE CustomerID = 93;

DELETE FROM Customers
WHERE CustomerID = 93;

-- 78번 상품 지우기 
SELECT * FROM Products
WHERE ProductID = 78;

DELETE FROM Products
WHERE ProductID = 78;

-- 79번 상품 지우기 

SELECT * FROm Products
WHERE ProductID = 79;

DELETE FROM Products
WHERE ProductID = 79;