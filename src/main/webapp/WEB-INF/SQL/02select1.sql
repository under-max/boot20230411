-- 모든필드 
SELECT * FROM Customers;

-- customerName 필드만
SELECT CustomerName FROM Customers;
SELECT CustomerName as 고객이름 FROM Customers;

SELECT ContactName FROM Customers;
SELECT Country FROM Customers;

SELECT ContactName, ContactName FROM Customers;
SELECT ContactName, ContactName, Country FROM Customers;

-- 문제1) employees 테이블에서 birthDate, firstName, LastName 을 조회 

SELECT BirthDate as 생일, 
		FirstName as 이름,
        LastName as 성
        FROM Employees;

SELECT ContactName as 이름, 
		City as 도시
        FROM Customers;

Select CategoryName as 카테고리명,
		Description as  설명
        FROM Categories;