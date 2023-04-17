-- null : 값이 없음 
-- null vs '' : 데이터베이스 마다 다름 

-- IS NULL : 값이 NULL인가? 
SELECT * FROm Suppliers 
WHERE ContactName = '';

SELECT * FROM Suppliers 
WHERE ContactName IS NULL;

-- NULL 이 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL;

SELECT * FROM Suppliers
WHERE NOT ContactName IS NOT NULL;

-- Customers 테이블에서 address 컬럼이 null 인 레코드 조회 
-- ADDRESS 컬럼이 Null 이 아닌 레코드 조회
SELECT * FROM Customers 
WHERE Address IS NULL
ORDER BY 1 DESC;

SELECT * FROM Customers 
WHERE Address IS NOT NULL 
ORDER BY 1 DESC;

-- 집게함수에서 Null 제외 
SELECT COUNT(CustomerID) FROM Customers;

SELECT COUNT(Address) FROM Customers;

SELECT COUNT(*) FROM Customers; -- Null 있어도 무시하고 전체 갯수

-- 공급자 테이블에서 supplierID 컬럼의 값 수 구하기 
-- 공급자 테이블에서 ContactName컬럼의 값 수 구하기 

SELECT COUNT(SupplierID) FROM Suppliers;

SELECT COUNT(ContactName) FROM Suppliers;

