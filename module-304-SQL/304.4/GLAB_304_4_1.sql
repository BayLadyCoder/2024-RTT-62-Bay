-- Example 1: Sort a result set by an expression.
SELECT order_id, order_line_number, quantity_ordered * price_each
FROM orderdetails
ORDER BY quantity_ordered * price_each DESC;

-- Assign an alias
SELECT order_id, order_line_number, quantity_ordered * price_each as subtotal
FROM orderdetails
ORDER BY subtotal DESC; 

-- Example 2: MySQL ORDER BY and NULL Values
SELECT firstname, lastname, reports_to
FROM employees
ORDER BY reports_to;

-- If you use the ORDER BY clause with the DESC option, 
-- NULLs will appear last in the result set
SELECT firstname, lastname, reports_to
FROM employees
ORDER BY reports_to DESC;