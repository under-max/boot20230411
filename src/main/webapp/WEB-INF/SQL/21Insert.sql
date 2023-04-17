-- Insert : 테이블에 새 레코드 입력
use w3schools;
SELECT * FROM Customers;

INSERT INTO Customers
(CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES 
(92, '박지성', '두개의심장','LONDON', 'SEOUL', '1234567', 'KOREA');

SELECT * FROM Customers 
WHERE CustomerID = 92;

INSERT INTO Customers 
VALUES 
(93, '박지성', '차붐', '프랑크푸르트', 'SEOUL', '1234567', 'KOREA');

SELECT * FROM Customers 
ORDER BY CustomerID DESC;

-- 특정 칼럼에만 값을 넣을떄 컬럼명 작성해야 함 

INSERT INTO Customers 
(CustomerID, CustomerName, City, Country)
VALUES
(94, '송태섭', 'Tokyo', 'Japan');

SELECT * FROM Customers 
ORDER BY CustomerID DESC;

-- 문제 1 suppliers 테이블에 30번쨰 공급자 행을 추가 (모든 열)
INSERT INTO Suppliers 
VALUES
(30, 'Tomas Ronald', 'Ronald', '49 will street', 'Wasinton', '123456', 'USA', '(123) 456-789');

-- 문제 2 Suppliers 테이블에 31번째 공급자 추가 
-- SypplierID, SupplierName, City, Country

INSERT INTO Suppliers (SupplierID, SupplierName, City, Country)
VALUES (31, 'nichhe', 'Frankfrut', 'Germany');

SELECT * FROM Suppliers
ORDER BY SupplierID DESC;