-- 1. Write a query to display each customer’s name (as “Customer Name”), 
-- along with the name of the employee who is responsible for that customer’s orders. 
-- The employee name should be in a single “Sales Rep” column, 
-- formatted as “lastName, firstName.” 
-- The output should be sorted alphabetically by customer name.
SELECT 
	c.customer_name AS 'Customer Name', 
    CONCAT(e.lastname, ', ', e.firstname) AS 'Sales Rep'
FROM customers c 
JOIN employees e 
ON c.sales_rep_employee_id = e.id
ORDER BY c.customer_name;

-- 2. To determine which products are the most popular with our customers. 
-- For each product, list the total quantity ordered, 
-- along with the total sale generated (total quantity ordered * priceEach) for that product. 
-- The column headers should be “Product Name,” “Total # Ordered,” 
-- and “Total Sale.” List the products by “Total Sale” descending.
SELECT 
	p.product_name AS "Product Name",
	SUM(od.quantity_ordered) AS "Total # Ordered", 
    SUM(od.quantity_ordered * od.price_each) AS "Total Sale"
FROM products p, orderdetails od
WHERE od.product_id = p.id
GROUP BY p.id
ORDER BY "Total Sale" DESC;

