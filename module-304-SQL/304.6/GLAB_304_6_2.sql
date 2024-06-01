-- 1. For each product, show the product name "Product" and the product type name "Type.
SELECT p.name AS Product, pt.name AS Type
FROM product p
JOIN product_type pt
ON p.product_type_cd = pt.product_type_cd;

-- 2. For each branch, list the branch name and city, 
-- plus the last name and title of each employee who works in that branch.
SELECT b.name, b.city, e.last_name, e.title
FROM branch b
JOIN employee e
ON e.assigned_branch_id = b.branch_id;

-- 3. Show a list of each unique employee title.
SELECT DISTINCT title
FROM employee;

-- 4. Show the last name and title of each employee, 
-- along with the last name and title of that employee's boss.
SELECT e.last_name, e.title, b.last_name AS "Boss Lastname", b.title AS "Boss Title"
FROM employee e, employee b
WHERE e.superior_emp_id = b.emp_id;

-- 5. For each account, show the name of the account's product, 
-- the available balance, and the customer's last name.
SELECT p.name, a.avail_balance, i.last_name
FROM product p, account a, individual i
WHERE a.product_cd = p.product_cd AND a.cust_id = i.cust_id;

