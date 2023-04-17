-- = 같다
-- <> 다르다

SELECT * FROM Customers; -- 91 개

SELECT * FROM Customers
WHERE Country = 'mexico'; -- 5개

SELECT * FROM Customers
WHERE Country <> 'mexico'; -- 86개

SELECT * FROM Customers 
WHERE Country != 'Mexico'; -- 86개 위와 동일 표현

-- 문제 나라가 USA 가 아닌 공급자들 조회 

SELECT * FROM Suppliers
WHERE Country != 'USA';

SELECT SupplierName as 공급자명 FROM Suppliers
WHERE Country != 'USA';

-- > : 크다 
SELECT * FROM Products
WHERE Price > 10;

SELECT * FROM Products
WHERE Price > 90;

SELECT * FROM Products;

SELECT * FROM Employees;

SELECT * FROM Employees
WHERE BirthDate > '1950-02-02';

-- 작다

SELECT * FROM Products
WHERE Price < 5.00;

SELECT * FROM Customers
WHERE CustomerName < 'c';

-- <= : 작거나 같다 
-- >= : 크거나 같다

SELECT * FROM Products
WHERE price >= 10.00;

SELECT * FROM Products
WHERE Price <= 10.00;

SELECT * FROM Employees
WHERE BirthDate <= '1958-09-19';

SELECT * FROM Employees
WHERE BirthDate >= '1958-09-19';
