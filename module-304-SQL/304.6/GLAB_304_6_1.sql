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
ORDER BY SUM(od.quantity_ordered * od.price_each) DESC;

-- 2. SOLUTION 
SELECT 
	p.product_name AS 'Product Name', 
	SUM(od.quantity_ordered) AS 'Total # Ordered', 
    SUM(od.quantity_ordered * od.price_each) AS 'Total Sale'
FROM products p LEFT JOIN orderdetails od 
ON p.id=od.product_id
GROUP BY p.product_name, p.buy_price
ORDER BY 3 DESC;

-- 3. Write a query that lists order status and the number of orders with that status. 
-- Column headers should be “Order Status” and “Total Orders.” Sort alphabetically by status.
SELECT status AS "Order Status", COUNT(id) AS "Total Orders"
FROM orders 
GROUP BY status
ORDER BY status;

-- 4. Write a query to list, for each product line, 
-- the total number of products sold from that product line. 
-- The first column should be “Product Line” and the second should be “total Sold.” 
-- Order by the second column, descending.
SELECT product_line AS "Product Line", count(p.id) AS "Total Sold"
FROM productlines pl, products p, orderdetails od
WHERE p.productline_id = pl.id AND od.product_id = p.id
GROUP BY pl.id
ORDER BY 2 DESC;

-- 4. SOLUTION
SELECT 
     pl.product_line AS 'Product Line', 
     count(od.product_id) AS 'total Sold'
FROM productlines pl JOIN products p 
ON pl.id = p.productline_id
 JOIN orderdetails od ON p.id = od.product_id
GROUP BY pl.product_line
ORDER BY 2 DESC;

