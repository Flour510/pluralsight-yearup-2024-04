USE northwind;

SELECT ProductName
	, UnitPrice
    , UnitsInStock
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC
	, ProductName ASC -- ascending is default so you dont really have to put it 
;

