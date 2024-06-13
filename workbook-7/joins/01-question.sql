USE northwind;

SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM Products
ORDER BY CategoryName, ProductName
;