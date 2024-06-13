USE northwind;

SELECT o.OrderID
	, o.OrderDate
    , o.ShipName
    , o.ShipAddress
FROM Orders o
HAVING '%Sasquatch Ale%'
;