USE northwind;

SELECT p.ProductName, c.CategoryName 
FROM Products p
JOIN Categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (SELECT MAX(UnitPrice) FROM Products)
ORDER BY p.ProductName
;