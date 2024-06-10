USE northwind;

SELECT ProductID
	, ProductName
    , UnitPrice
    , UnitsInStock
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC
;