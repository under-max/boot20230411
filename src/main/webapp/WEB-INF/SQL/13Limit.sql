-- LIMIT 3 위에서 부터 3개 

-- LIMIT n,m  n번부터 m 개

SELECT * FROM Customers ORDER BY CustomerID
LIMIT 0, 3;

SELECT * FROM Customers ORDER BY CustomerID
LIMIT 3, 3;

SELECT * FROM Customers ORDER BY CustomerID
LIMIT 6, 3;

-- 두번쨰로 나이가 많은 직원 조회 
SELECT * FROM Employees 
GROUP BY BirthDate
LIMIT 1, 1;


-- 2번 카테고리 상품 중 두번쨰로 가격이 비싼 상품 조회 
SELECT * FROM Products
WHERE CategoryID = 2
GROUP BY Price DESC
LIMIT 1, 1;
