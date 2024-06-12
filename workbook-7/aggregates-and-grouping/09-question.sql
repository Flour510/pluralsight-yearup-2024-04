USE northwind;

SELECT ProductID,
	   ProductName,
       UnitPrice * UnitsOnHand AS InventoryValue       
FROM Products
ORDER BY InventoryValue DESC, ProductName
;