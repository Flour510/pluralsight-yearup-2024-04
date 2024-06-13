USE northwind;

SELECT p.ProductID
	, p.ProductName
    , p.UnitPrice
    , c.CategoryName 
    , s.CompanyName AS SupplierName
FROM Products p
JOIN Suppliers s ON p.SupplierID = s.SupplierID -- can make as many joins as I need
JOIN Categories c ON p.CategoryID = c.CategoryID
ORDER BY p.ProductName
;