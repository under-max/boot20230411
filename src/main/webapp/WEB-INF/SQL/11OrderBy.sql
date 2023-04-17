use w3schools;

-- order by 결과의 순서를 정할 때 사용 

SELECT CustomerID, CustomerName, Contactname -- column 명들 
FROM Customers -- table 
WHERE CustomerID < 10
ORDER BY CustomerID ASC; -- 선택할 records 의 조건 

SELECT CustomerID, Contactname -- column 명들 
FROM Customers -- table 
WHERE CustomerID < 10
ORDER BY CustomerID DESC; -- 선택할 records 의 조건

SELECT * FROM Customers
ORDER BY CustomerName DESC;

SELECT *FROM Customers
ORDER BY Country ASC;


-- 모든상품을 상품을 가격순으로 조회 낮은 가격이 먼저 조회 되도록 

SELECT * FROM Products
ORDER BY Price;

-- 모든 직원을 생년월일 순 조회 어린직원이 먼저 조회 되도록 

SELECT * FROM Employees
ORDER BY BirthDate DESC;


-- 컬럼 index 사용 가능 
SELECT * FROM Products 
ORDER BY price;

SELECT * FROM Products 
ORDER BY 6;

SELECT * FROM Products 
ORDER BY 6 desc;

-- 컬럼 index 사용해서 고객을 도시 이름순 정렬 조회 

SELECT * FROM Customers
ORDER BY 5;

SELECT CustomerID, CustomerName, City
FROM Customers ORDER BY 3; -- 컬럼인데스 사용시 SELECT 절에 맞게

-- 여러컬럼 기준 정렬 가능 
SELECT * FROM Customers ORDER BY Country, City;
SELECT *FROM Customers ORDER BY 7, 5;

SELECT CustomerID, CustomerName, Country, City FROM Customers
ORDER BY Country, CIty;

SELECT CustomerID, CustomerName, Country, City FROM Customers
ORDER BY 4, 3;

-- 여러 컬럼 기준으로 정렬시 컬럼당 오름차순 내림차순 지정가능

SELECT * FROM Customers ORDER BY Country ASC, City DESC;
SELECT * FROM Customers ORDER BY Country DESC, City ASC;


-- 상품을 카테고리 (오름차순) 가격 (내림차순) 으로 정렬 조회 
SELECT * FROM Products  ORDER BY CategoryID, Price DESC; 


 
--


 