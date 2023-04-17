-- Alias : 별칭

SELECT * FROM Customers;

SELECT CustomerID, CustomerName FROM Customers;

SELECT CustomerID as ID, CustomerName as Name 
FROM Customers;

-- as 생략 가능

SELECT CustomerID ID, CustomerName Name
FROM Customers;

SELECT CustomerID id, CustomerName Name
FROM Customers 
ORDER BY ID;


SELECT Country, COUNT(CustomerID)  
FROM Customers
GROUP BY Country;

SELECT Country, COUNT(CustomerID) as NumOFCustomer 
FROM Customers
GROUP BY Country;

SELECT Country c, COUNT(CustomerID) NumOFCustomer 
FROM Customers
GROUP BY Country;

SELECT Country c, COUNT(CustomerID) NumOFCustomer 
FROM Customers
GROUP BY Country
ORDER BY NumOfCustomer;

-- keyword 사용시 `` 그러나 사용하지 않는것이 좋음
SELECT Country AS `FROM`, CustomerName FROM Customers;