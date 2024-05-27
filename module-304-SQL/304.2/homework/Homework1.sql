-- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line
SELECT count(*) as count, productline_id FROM products GROUP BY productline_id;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   
-- Employee name will be duplicated in the result set.   
-- I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name
SELECT c.customer_name, c.contact_firstname, c.contact_lastname, 
	   e.firstname AS sale_rep_firstname, e.lastname AS sale_rep_lastname
FROM customers c, employees e
WHERE c.sales_rep_employee_id = e.id;

-- question 0.3
-- I want to see a list of employees in each office.   
-- Show the office name and the employee name
SELECT o.city AS office, CONCAT(e.firstname," ", e.lastname) AS employee_name
FROM offices o, employees e
WHERE e.office_id = o.id;

-- question 0.4
-- I want to see the totaly number of each employee type based on job title.. 
-- result should the job title and the number of employess with that job title.
SELECT job_title,count(*) as count FROM employees GROUP BY job_title;

-- question 0.5
-- I want to see a list of all payments each customer has made.  
-- Order the list by custoemr name ascending, then by the payment amount descending
SELECT c.customer_name, p.amount 
FROM customers c, payments p
WHERE p.customer_id = c.id
ORDER BY c.customer_name, p.amount DESC;

-- question 0.6
-- I want to see a list of products that have never been sold.   
-- use ... not in ( select product_id from order_details ) in your where clause
-- select * from products where id not in ( select product_id from orderdetails );
 SELECT * FROM products WHERE id NOT IN (SELECT product_id FROM orderdetails);

-- question 0.7
-- are there any customers that have never made an order
SELECT * FROM customers WHERE id NOT IN (SELECT customer_id FROM orders);

-- Question 1
-- How many customer are handled by each office.  
-- I want to see the office name and the count of the number of customers in that office.
SELECT o.city, COUNT(*) 
FROM customers c, offices o, employees e 
WHERE c.sales_rep_employee_id = e.id AND e.office_id = o.id 
GROUP BY o.city;

-- Question 2
-- I want to see the products with the most margin at the top of the table.  
-- Include the product name, buy price, msrp, and margin in the results.  
-- Margin is calculated (MSPR - buy_price) 
SELECT product_name, buy_price, msrp, msrp - buy_price AS margin
FROM products
ORDER BY margin DESC;

-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 
SELECT * FROM (SELECT c.customer_name, c.state, SUM(od.quantity_ordered * (p.msrp-p.buy_price)) AS margin,
	   ROW_NUMBER() OVER (PARTITION BY c.state ORDER BY SUM(od.quantity_ordered * (p.msrp-p.buy_price)) DESC) AS state_rank
FROM customers c, orderdetails od, products p, orders o
WHERE o.customer_id = c.id
      AND od.order_id = o.id
      AND od.product_id = p.id
      AND c.country = "USA"
      AND c.state IS NOT NULL
GROUP BY c.id, c.state
ORDER BY c.state, margin DESC) whatever_table_name
where state_rank <= 5;

WITH result_table AS (
	SELECT c.customer_name, c.state, SUM(od.quantity_ordered * (p.msrp-p.buy_price)) AS margin,
	ROW_NUMBER() OVER (PARTITION BY c.state ORDER BY SUM(od.quantity_ordered * (p.msrp-p.buy_price)) DESC) AS state_rank
	FROM customers c, orderdetails od, products p, orders o
	WHERE o.customer_id = c.id
      AND od.order_id = o.id
      AND od.product_id = p.id
      AND c.country = "USA"
      AND c.state IS NOT NULL
	GROUP BY c.id, c.state
	ORDER BY c.state, margin DESC)
SELECT customer_name, state, margin, state_rank
FROM result_table
WHERE state_rank <= 5;



-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold
SELECT CONCAT(e.firstname, " ", e.lastname), SUM(p.amount) AS amount
FROM employees e, payments p, customers c
WHERE c.sales_rep_employee_id = e.id 
	  AND p.customer_id = c.id
GROUP BY e.id
ORDER BY amount DESC
LIMIT 5;

-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)
SELECT CONCAT(e.firstname, " ", e.lastname), SUM(od.quantity_ordered * (p.msrp-p.buy_price)) AS profit
FROM employees e, orderdetails od, products p, customers c, orders o
WHERE c.sales_rep_employee_id = e.id
	  AND o.customer_id = c.id
      AND od.order_id = o.id
      AND od.product_id = p.id
GROUP BY e.id
ORDER BY profit DESC
LIMIT 5;

-- Question 5 
-- I want to see all of the orders that happened in 2004.   
-- You can use a function called year(order_date) = 2004
SELECT * FROM orders WHERE YEAR(order_date) = 2004;

-- Question 6
-- I want to see the total amount of all orders grouped by the year
SELECT COUNT(*), YEAR(o.order_date)
FROM orders o
GROUP BY YEAR(o.order_date);

-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders
SELECT p.product_name, SUM(od.quantity_ordered) FROM products p, orderdetails od WHERE od.product_id = p.id GROUP BY p.id;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.
SELECT p.product_name, COUNT(p.id) FROM products p, orderdetails od WHERE od.product_id = p.id GROUP BY p.id;

-- question 7.6
-- how many products would be out of stock baed on the amount sold acrosss tiem.  
-- not sure if the data will spoort this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
SELECT 
	p.product_name, 
    SUM(od.quantity_ordered) AS ordered, 
    p.quantity_in_stock AS in_stock, 
    p.quantity_in_stock - SUM(od.quantity_ordered) AS maybe_out_of_stock
FROM orderdetails od, products p
WHERE od.product_id = p.id
GROUP BY p.id
ORDER BY maybe_out_of_stock;

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
SELECT DISTINCT status FROM orders ORDER BY status;

-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  
-- This will require joining almost all of the tables.  
-- select distinct o.name as office_name, pl.productlines as product_line_name  ....
SELECT DISTINCT offices.city AS office_name, pl.product_line AS product_line_name
FROM offices, productlines pl, customers c, employees e, orders o, orderdetails od, products p
WHERE o.customer_id = c.id
	  AND c.sales_rep_employee_id = e.id
      AND od.order_id = o.id
      AND od.product_id = p.id
      AND p.productline_id = pl.id
ORDER BY office_name, product_line_name;
      
      




