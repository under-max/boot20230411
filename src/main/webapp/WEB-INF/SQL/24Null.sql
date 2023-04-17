-- NUll 과의 연산은 모두 false 
SELECT * FROM Products WHERE CategoryID = 2; -- 14

SELECT * FROM Products 
WHERE CategoryID = 2 
AND PRICE >= 25.00; -- 4

SELECT * FROM Products 
WHERE CategoryID = 2 
AND PRICE < 25.00; -- 8

SELECT * FROM Products
WHERE CategoryID = 2
AND IFNULL(PRICE, 0) < 25.00; -- 10

SELECT * FROM Products
WHERE CategoryID = 2
AND Price IS NULL;

SELECT ProductName, Price * 1300 FROM Products
WHERE CategoryID = 2; -- 산술 연산 결과도 null 

SELECT ProductName, ifnull(price, 0) FROM Products
WHERE CategoryID = 2;