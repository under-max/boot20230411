SELECT * FROM Customers WHERE CustomerID >=10 AND CustomerID <= 20;
SELECT * FROM Customers WHERE CustomerID BETWEEN 10 AND 20 GROUP BY City DESC;


-- 50년대생 직원들 조회

SELECT * FROM Employees WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31' GROUP BY BirthDate;
SELECT * FROM Employees WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';

-- 가격이 10달러대 상품들 10.00 ~ 10.99 상품들 
SELECT * FROM Products WHERE Price BETWEEN 10.00 AND 19.99 GROUP BY Price;

SELECT * FROM Products WHERE Price >= 10.00 AND Price < 20.00;