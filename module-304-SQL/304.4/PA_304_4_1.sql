-- 1. Display the name, product line, and buy price of all products. 
-- The output columns should display as: “Name,” “Product Line,” and “Buy Price.” 
-- The output should display the most expensive items first. 
SELECT 
	p.product_name AS Name, 
    pl.product_line AS "Product Line", 
    p.buy_price AS "Buy Price"
FROM products p, productlines pl
WHERE p.productline_id = pl.id
ORDER BY p.buy_price DESC;

-- 2. Display the first name, last name, and city name of all customers from Germany. 
-- The output columns should display as: “First Name,” “Last Name,” and “City.” 
-- The output should be sorted by “Last Name” (ascending).
SELECT 
	c.contact_firstname AS "First Name",
    c.contact_lastname AS "Last Name",
    c.city AS "City"
FROM customers c
WHERE c.country = "Germany"
ORDER BY c.contact_lastname;

-- 3. Display each of the unique values of the status field in the orders table. 
-- The output should be sorted alphabetically, ascending.
-- Hint: The output should show exactly six rows.
SELECT DISTINCT status
FROM orders
ORDER BY status;

-- 4. Display all fields from the payments table for payments 
-- made on or after January 1, 2005. 
-- The output should be sorted by the payment date from highest to lowest.
SELECT *
FROM payments
WHERE payment_date > "2005-01-01"
ORDER BY payment_date DESC;

-- 5. Display the last Name, first Name, email address, and job title 
-- of all employees working out of the San Francisco office. 
-- The output should be sorted by “Last Name.”


-- 6. Display the name, product line, scale, 
-- and vendor of all of the car products, both classic and vintage. 
-- The output should display all vintage cars first 
-- (sorted alphabetically by name), 
-- and all classic cars last (also sorted alphabetically by name). 
