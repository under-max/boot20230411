-- Catesian Product (곱집합 ) 카테시안 곱

SELECT Count(*) FROM Products; -- 77

SELECT Count(*) FROM Categories; -- 8

SELECT COUNT(*) FROM Products JOIN Categories; -- 616 

SELECT * FROM Products JOIN Categories;
-- category id가 중첩되는데 이 아이들만 뽑아야함 
-- on : Join 조건
-- 그냥 Join 하면 카세디안 곱으로 나오므로 주의 
SELECT * FROM Products JOIN Categories 
ON Products.CategoryID = Categories.CategoryID;

-- Join 후 컬럼수 : 왼쪽 table 컬럼 수 + 오른쪽 table 컬럼 수
DESC Products; -- 6컬럼
DESC Categories; -- 3컬럼
SELECT * FROM Products Join Categories
ON Products.CategoryId = Categories.CategoryId; -- 9 칼럼

SELECT ProductName, CategoryName 
FROM Products Join Categories
On Products.CategoryID = Categories.CategoryID;

-- 상품명, 그 상품을 공급하는 공급자 명 
DESC Suppliers;
SELECT * FROM Products;

SELECT * FROM Products Join Suppliers;
SELECT * FROM Suppliers;


SELECT ProductName, SupplierName
FROM Products JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
ORDER BY 2;


-- ALIAS 사용으로 코드 줄이기 (별칭) 
SELECT CustomerName as Name FROM Customers;

SELECT ProductName, SupplierName 
FROM Products as p JOIN Suppliers as s
ON p.SupplierID = s.SupplierID;

-- 만약 Join한 테이블에 같은 컬럼명이 있다면?
SELECT p.SupplierID, s.SupplierID
FROM Products as p JOIN Suppliers as s
ON p.SupplierID = s.SupplierID;
