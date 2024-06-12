USE northwind;

SELECT * 
FROM products
WHERE CategoryID = (
	SELECT CategoryID
    FROM categories
    WHERE CategoryName = 'Seafood'
);