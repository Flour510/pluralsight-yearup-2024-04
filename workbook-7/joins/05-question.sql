USE northwind;

SELECT o.OrderID
	, o.ShipName
    , o.ShipAddress
    , s.CompanyName AS ShippingCompanyName
FROM Orders o
JOIN Shippers s ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry = 'Germany'
ORDER BY o.OrderID
;