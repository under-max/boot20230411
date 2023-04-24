use w3schools;

SELECT * FROM Employees ORDER BY 1 DESC;

INSERT INTO Employees (EmployeeID, LastName, FirstName)
VALUES (11, '박지성', '두개의심장');

INSERT INTO Employees (LastName, FirstName)
VALUES ('차범근', '차붐');

SELECT * FROM Employees ORDER BY 1 DESC;

-- 테이블 정보보기 
DESC Employees;

-- Customers 테이블의 자동증가 컬럼을 찾기 
DESC Customers;

INSERT INTO Customers 
(CustomerName, ContactName)
VALUES ('정대만', 'daeman');

SELECT * FROM Customers
ORDER BY 1 DESC;

SELECT * FROM Suppliers
ORDER BY 1 DESC;

-- 문제1) 새 공급자 데이터 추가 (SupplierId, SupplierName, City)
-- 자동 증가 컬럼은 직접값을 넣지 않고 

DESC Suppliers;

INSERT INTO Suppliers (SupplierName, City)
VALUES ("정대만", "SEOUL");

SELECT * FROM Customers
GROUP BY 1 DESC;



