-- +, -, *, /, % 

SELECT * FROM Products;

SELECT ProductName, Price * 1300 FROM Products;

SELECT ProductName, Price * 1300 as WonPrice 
FROM Products;

SELECT ProductName, Price / 100 FROM Products;
SELECT ProductName, Price + 100 FROM Products;
SELECT ProductName, Price - 100 FROM Products;

-- 문자열 연결 
SELECT City + Country FROM Customers; -- 안됨 
SELECT concat(City, Country) FROM Customers; -- 됨

SELECT concat(City, " ",  Country) FROM Customers; 
SELECT concat(City, " ",  Country) CityOfCountry FROM Customers; 

-- 직원 이름 "firstName, LastName" 형식으로 조회 
SELECT CONCAT(FirstName, " " , LastName) as Name FROM Employees;

-- 원화로 (*1300) 로 10만원 이상인 상품들을 조회 
SELECT ProductName, Price * 1300 as WonPrice FROM Products
WHERE Price * 1300 >= 100000;


-- 부분 문자열 : SUbString
-- 첫번쨰 파라미터 : 원본 문자열
-- 두번쨰 파라미터 : 시작 인덱스 
-- 세번째 파라미터 : 길이 
SELECT SUBSTRING('Hello world', 3, 3); -- llo

SELECT CustomerName FROM Customers;
SELECT SUBSTRING(CustomerName, 1, 3) FROM Customers;

-- 고객 테이블에서 고객명 나라이름 (앞 3글자만) 조회 
SELECT SUBSTRING(CustomerName, 1, 3), SUBSTRING(Country, 1, 3) FROM Customers;

