-- Not 해당하지 않은 것만 

SELECT * FROM Customers;

SELECT * FROM Customers WHERE Country = 'Germany';

SELECT * FROM Customers WHERE NOT Country = 'Germany';

-- 런던에 있지 않은 고객들 조회

SELECT * FROM Customers WHERE NOT Country = 'London';

-- 50년대생이 아닌 직원들 조회 

SELECT * FROM Employees WHERE NOT (BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31');
SELECT * FROM Employees WHERE (BirthDate < '1950-01-01' OR BirthDate > '1959-12-31');
-- 1,2번 카테고리가 아닌 상품들
SELECT * FROM Products WHERE NOT (CategoryID = 1 OR CategoryID = 2);
SELECT * FROM Products WHERE (CategoryID <> 1 AND CategoryID <> 2);
