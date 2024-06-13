USE northwind;

SELECT p.ProductID, 
       p.ProductName, 
       p.UnitPrice, 
       s.CompanyName AS SupplierName
FROM Products p
JOIN Suppliers s ON p.SupplierID = s.SupplierID 
WHERE p.UnitPrice > 75 
ORDER BY p.ProductName;  