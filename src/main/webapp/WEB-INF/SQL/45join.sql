drop database w3schools;
use w3schools;

-- join 
SELECT * FROM Products;

DESC Products;

SELECT * FROm Categories;

ALTER TABLE Products
ADD FOREIGN KEY (CategoryId) 
REFERENCES Categories(CategoryId);

SELECT * FROM Suppliers;

ALTER TABLE Products
ADD FOREIGN KEY (SupplierId)
REFERENCES Suppliers(SupplierId);

Select * FROM Products;

ALTER TABLE OrderDetails
ADD FOREIGN KEY (OrderId)
REFERENCES Orders(OrderId);

ALTER TABLE OrderDetails
ADD FOREIGN KEY (ProductId) 
REFERENCES Products(ProductId);

DESC Orders;

ALTER TABLE Orders
ADD FOREIGN KEY (CustomerId)
REFERENCES Customers(CustomerId);

ALTER TABLE Orders
ADD FOREIGN KEY (EmployeeId)
REFERENCES Employees(EmployeeId);

ALTER TABLE Orders
ADD FOREIGN KEY (shipperId)
REFERENCES Shippers(ShipperId);

DESC Shippers;
DESC Employees;
SELECT * FROM Shippers;
SELECT * FROM Products;

-- 여러정보 한번에 알고 싶다 

SELECT * FROM Products
WHERE ProductId = 1;
SELECT * FROM Categories
WHERE CategoryId = 1;

SELECT * FROM Products JOIN Categories ON
Products.CategoryId = Categories.CategoryId
where Products.ProductId = 1;