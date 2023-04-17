-- in 특정 값 중에 있으면....
SELECT * FROM Customers 
WHERE Country = 'Germany' OR Country = 'France';

SELECT * FROM Customers 
WHERE Country IN ('Germany', 'France');

-- 3,5번 카테고리에 속한 상품들 

SELECT * FROM Products
WHERE CategoryID IN (3,5)
GROUP BY Price;

-- 1,3,5,7 번 카테고리에 속한 상품들 조회 
SELECT * FROM Products
WHERE CategoryID = 1
OR CategoryID = 3
OR CategoryID = 5
OR CategoryID = 7
OR CategoryID = 9;

SELECT * FROM Products
WHERE CategoryID IN (1,3,5,7,9);

-- berlin london madrid paris 에 있는 고객들 조회

SELECT * FROM Customers
WHERE City IN ('Berlin', 'London', 'Madrid', 'Paris');

SELECT * 
FROM Customers
WHERE (City NOT IN ('Berlin', 'London', 'Madrid', 'Paris'));


-- 1,3,5,7 카테고리가 아닌 상품들 조회 

SELECT ProductID as 상품아이디, ProductName as 상품명,
CategoryID as 카테고리아이디, Unit as 수량,
Price as 가격
FROM Products
WHERE CategoryID NOT IN (1,3,5,7,9)
ORDER BY Price;