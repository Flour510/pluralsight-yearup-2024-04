USE northwind;

SELECT *
FROM Products
WHERE SupplierID IN (
	SELECT SupplierID
    FROM Suppliers
    WHERE CompanyName = 'Tokyo Traders'
);
