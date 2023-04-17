--  Having 집계함수의 조건 설정 

SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;

-- 5명 이상의 고객이 있는 나라 조회 
SELECT Country, COUNT(CustomerID) NumOfCustomer
FROM Customers
-- WHERE NumOfCustomer >= 5 -- 특정 Record를 거르는 조건 
GROUP BY Country
HAVING COUNT(CustomerID) >= 5;

-- 상품의 평균 가격이 30 달러 이상인 카테고리를 조회 
SELECT CategoryID, AVG(Price) 평균가격 FROM Products
GROUP BY CategoryID
HAVING 평균가격 >= 30;


-- 카테고리별 상품의 최고 가격이 100달려 이상인 카테고리 조회
SELECT CategoryID, MAX(Price) 최고가격 FROM Products
GROUP BY CategoryID
HAVING 최고가격 >= 100;