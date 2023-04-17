-- 내장함수 
-- count : 레코드 수 리턴

SELECT * FROM Customers;

SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(CustomerName) FROM Customers;

SELECT COUNT(CUstomerID) FROM Customers
WHERE Country = 'Brazil';

-- DISTINCT : 중복제거 
SELECT Country AS 나라 FROM Customers;
SELECT DISTINCT Country FROM Customers;

SELECT COUNT(DISTINCT Country) FROM Customers;

-- 전체 직원수 
SELECT COUNT(EmployeeID) FROM Employees;

-- 상파울로에 사는 고객 수
SELECT COUNT(CIty) FROM Customers
WHERE City = 'São Paulo';

-- 공급자가 있는 나라 수 중복제거
SELECT COUNT(DISTINCT Country) FROM Suppliers;


