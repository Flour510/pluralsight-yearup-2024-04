USE northwind;

SELECT SupplierID,
	COUNT(*) AS NumberOfItemsSupplied
FROM Products
GROUP BY SupplierID;