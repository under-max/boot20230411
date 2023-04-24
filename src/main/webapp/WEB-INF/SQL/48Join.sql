DESC Orders;
SELECT * FROM Orders o Join Customers c
ON o.CustomerID = c.CustomerId; -- 830

SELECT * FROM Orders o RIGHT Join Customers c
ON o.CustomerID = c.CustomerId; -- 832 주문한적이 없는 고객 존재

SELECT * FROM Orders o RIGHT Join Customers c
ON o.CustomerID = c.CustomerId
WHERE o.OrderId IS NULL; 

-- 예) 주문을 처리한적 없는 직원 조회 

DESC Orders;

SELECT * FROM Orders o RIGHT JOIN Employees e
ON o.EmployeeID = e.EmployeeID
WHERE o.OrderID IS NULL;

SELECT * FROM Orders;

-- 여러테이블 JOIN 