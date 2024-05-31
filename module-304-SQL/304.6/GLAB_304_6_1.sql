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

-- 5. Your product team is requesting data to help them create a bar chart of monthly sales made since the company’s inception. 
-- Write a query to output the month (January, February, etc.), 4-digit year, 
-- and total sales for each month. The first column should be labeled ‘Month,’ 
-- the second column should be labeled ‘Year,’ 
-- and the third column should be labeled ‘Payments Received.’ 
-- Values in the third column should be formatted as numbers with two decimals (e.g., 694,292.68).
SELECT 
   MONTHNAME(payment_date) AS Month, 
   YEAR(payment_date) AS Year,
   FORMAT(SUM(amount), 2) AS 'Payments Received'
FROM payments
GROUP BY YEAR(payment_date), MONTHNAME(payment_date) 
ORDER BY payment_date;

-- 6. Write a query to display the Name, Product Line, Scale, 
-- and Vendor of all of the Car products, both classic and vintage. 
-- The output should display all vintage cars first (sorted alphabetically by name), 
-- and all classic cars last (also sorted alphabetically by name). 
SELECT 
	product_name AS Name, 
    product_line AS "Product Line", 
    product_scale AS "Scale", 
    product_vendor AS "Vendor"
FROM products p, productlines pl
WHERE p.productline_id = pl.id AND product_line IN ("Classic Cars", "Vintage Cars")
ORDER BY product_line DESC, product_name;
