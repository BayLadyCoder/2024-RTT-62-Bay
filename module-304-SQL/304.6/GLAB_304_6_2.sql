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
