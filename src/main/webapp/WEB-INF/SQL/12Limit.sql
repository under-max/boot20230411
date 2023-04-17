-- Limit 조회 레코드 수 제한 

SELECT * FROM Customers
LIMIT 5;

SELECT * FROM Products
LIMIT 3;

-- 가격이 높은 상품 3개 조회
SELECT * FROM Products 
ORDER BY Price DESC 
LIMIT 3;

SELECT * FROM Products
WHERE CategoryID = 2 
ORDER BY Price DESC
LIMIT 3;

-- 나이많은 직원 3명 조회 

SELECT  * FROM Employees
ORDER BY BirthDate 
LIMIT 3; 

-- 브라질 고객 중 아무나 3명 조회 
SELECT * FROM Customers
WHERE Country = 'Brazil'
Limit 3;


-- 3번 카테고리 상품 중 가격이 싼 상품 2개 조회 
SELECT * FROM Products 
WHERE CategoryID = 3
ORDER BY Price  
LIMIT 2;