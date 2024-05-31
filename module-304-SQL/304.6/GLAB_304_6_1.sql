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

