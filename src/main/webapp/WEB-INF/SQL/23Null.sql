SELECT * FROM Products ORDER BY 1 desc;

-- if null : null 이면 다른 값으로 변경

SELECT IFNULL(0, 100);
SELECT IFNULL('kim', 'lee'); -- kim
SELECT IFNULL(NULL, 100); -- 100

SELECT ProductID, ProductName, SUpplierID, CategoryID, Unit, Price From Products
ORDER BY 1 DESC;


SELECT ProductID, 
ProductName, 
SUpplierID, 
CategoryID, 
Unit, 
IFNULL(Price, 0) 
From Products
ORDER BY 1 DESC;

SELECT AVG(IFNULL(Price, 0)) as AVERAGE FROM Products 
WHERE CategoryID = 2;

