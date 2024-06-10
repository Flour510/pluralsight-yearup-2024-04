USE northwind;

SELECT ProductName
	, UnitPrice
    , UnitsInStock
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnOrder > 0
ORDER BY ProductName
;