-- 여러테이블 조회 
SELECT * FROM Products;

SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8
SELECT COUNT(*) FROM Suppliers; -- 29

desc Products; -- 6
desc Categories; -- 3
Desc Suppliers; -- 8

SELECT * FROM Products Join Categories JOIN Suppliers;

SELECT COUNT(*) FROM
Products Join Categories JOIN Suppliers; -- 17864

SELECT * FROM 
Products p JOIN Categories c ON p.CategoryID = c.CategoryID
			JOIN Suppliers s ON p.CategoryID = s.SupplierID; -- 77개행
            
-- 예) 1번 상품의 상품명, 카테고리명 공급자명 

SELECT p.ProductName, c.CategoryName, s.SupplierName
FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID
				JOIN Suppliers s on p.SupplierID = s.SupplierID
                WHERE p.ProductID = 1;
                
-- 예제) 특정주문에 대한 상세한 내용 1996-07-04에 주문한 상품명 조회 
SELECT * FROM Orders; -- ordersDate 
SELECT * FROM OrderDetails; -- 가교
SELECT * FROM Products; -- ProductsName 
            
SELECT ProductName 
FROM Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
				JOIN Products p ON od.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';

-- '1996-07-04의 매출 조회'
-- 정보 roders, 특정주문 몇개 OrderDetail 필요 price
DESC Orders; -- 정보
DESC OrderDetails; -- 갯수 특정주문
DESC Products; -- 가격

SELECT SUM(od.Quantity * p.Price)
FROM OrderDetails od JOIN Products p On od.productId = p.ProductID
					JOIN Orders o ON od.OrderID = o.OrderID
WHERE o.OrderDate = '1996-07-04';

-- 일별 매출 조회 (날짜 순으로 결과 조회)
DESC OrderDetails; -- Quantity
DESC Products; -- price
DESC Orders; -- OrderDate 

SELECT OrderDate, SUM(p.Price * od.Quantity) as Total
FROM OrderDetails od JOIN Products p ON od.ProductID = p.ProductID
						JOIN Orders o ON od.OrderID = o.OrderID
GROUP BY OrderDate;

-- 직원별 처리금액
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;
SELECT * FROM Employees;
SELECT
 e.EmployeeID,
 e.LastName,
 e.FirstName,
 SUM(p.Price * od.Quantity) 매출 
FROM Orders o JOIN Employees e ON o.EmployeeID = e.EmployeeID
              JOIN OrderDetails od ON o.OrderID = od.OrderID
              JOIN Products p ON od.ProductID = p.ProductID
WHERE o.OrderDate BETWEEN '1997-01-01' AND '1997-01-31'
GROUP BY e.EmployeeID
ORDER BY 매출 DESC;

-- 상품별 판매금액
SELECT p.ProductID, p.ProductName, SUM(od.Quantity * p.Price) 판매금액 
FROM 
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY p.ProductID
ORDER BY 판매금액 DESC;

-- 고객별 소비금액
SELECT c.CustomerID, c.CustomerName, SUM(p.Price * od.Quantity) 구매금액 
FROM
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
		     JOIN Customers c ON o.CustomerID = c.CustomerID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC;

-- JOIN시 공통값
SELECT * FROM OrderDetails; -- orderId, ProductId, Quanitity
SELECT * FROM Orders; -- OrderId, CustomerID, EmployeeID, ShipperID 
SELECT * FROM Products; -- SupplierID, CategoryId, ProductId 
SELECT * FROM Categories; -- CategoriesID
SELECT * FROM Customers; -- CustomerId
SELECT * FROM Shippers; -- ShipperId
SELECT * FROM Suppliers; -- SupplierId 
 
SELECT *
FROM 
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID;


