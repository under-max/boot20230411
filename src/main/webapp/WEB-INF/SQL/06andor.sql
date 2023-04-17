
-- AND
SELECT * 
FROM Customers 
WHERE CustomerID > 4 
AND Country = 'Germany';

SELECT *
FROM Employees
WHERE LastName >= 'M' and BirthDate > '1960-01-01';

-- 카테고리 id가 2이고 가격이 20.00 이상인 상품들 조회 

SELECT * FROM Products;

SELECT *
FROM Products
WHERE CategoryID = 2 
AND Price > 20.00;


-- 1950-0101 ~ 1959-12-31 사이에 태어난 직원들 

SELECT * 
FROM Employees
WHERE BirthDate > '1950-01-01' 
AND BirthDate < '1959-12-31';

-- OR

SELECT * FROM Customers
WHERE Country = 'Germany';
SELECT * FROM Customers
WHERE Country = 'France';

SELECT * FROM Customers
WHERE Country = 'Germany' OR Country = 'France';

-- 도시가 런던 또는 마드리드에 있는 고객들 조회 

SELECT * FROM Customers
WHERE City = 'London' OR City = 'Madrid'
ORDER BY City DESC;

SELECT * FROM Products
WHERE CategoryID = 1 OR CategoryID = 2
ORDER BY CategoryID;

