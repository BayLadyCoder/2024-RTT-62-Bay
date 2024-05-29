-- MOD() function
SELECT order_id, SUM(quantity_ordered) as Qty,
    IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM orderdetails
GROUP BY order_id
ORDER BY order_id; 

-- TRUNCATE() function
SELECT TRUNCATE(1.555, 1); -- returns 1.5

-- AVG() function
SELECT product_id, AVG(quantity_ordered * price_each) as avg_order_value
FROM orderdetails
GROUP BY product_id;    

-- ROUND() function
SELECT product_id, ROUND(AVG(quantity_ordered * price_each)) as avg_order_item_value
FROM orderdetails
GROUP BY product_id;    

-- TRUNCATE() vs. ROUND()
SELECT TRUNCATE(1.999,1),  ROUND(1.999,1); -- 1.9 and 2.0

-- REPLACE() function
-- UPDATE tbl_name SET 
--    field_name = REPLACE(field_name, string_to_find, string_to_replace)
-- WHERE    conditions;

-- DATEDIFF() function
SELECT DATEDIFF('2011-08-17','2011-08-17');  
# Result  :   0 day

SELECT DATEDIFF('2011-08-17','2011-08-08'); 
#Result:  9 days

SELECT DATEDIFF('2011-08-08','2011-08-17');  
#Result:  -9 days

-- To calculate the number of days between the required date and shipped date of the orders, 
-- we can use the DATEDIFF() function as follows
SELECT id, DATEDIFF(required_date, shipped_date) as  days_left
FROM orders
ORDER BY days_left DESC;

-- The following statement gets all orders whose status is “In Process,” 
-- and calculates the number of days between the ordered date and the required date
SELECT id, DATEDIFF(required_date, order_date) as remaining_days
FROM orders
WHERE status = 'In Process'
ORDER BY remaining_days;

-- For calculating an interval in week or month, 
-- you can divide the returned value of the DATEDIFF() function 
-- by 7 or 30 as the following query
SELECT 
    id,
    ROUND(DATEDIFF(required_date, order_date) / 7, 2),
    ROUND(DATEDIFF(required_Date, order_date) / 30,2)
FROM orders 
WHERE status = 'In Process';

-- DATE_FORMAT() function
SELECT 
    id,
    DATE_FORMAT(order_date, '%Y-%m-%d') order_date,
    DATE_FORMAT(required_date, '%a %D %b %Y') required_date,
    DATE_FORMAT(shipped_date, '%W %D %M %Y') shipped_date
FROM orders;

-- DATE_FORMAT() with ORDER BY 
SELECT id,
    DATE_FORMAT(shipped_date, '%W %D %M %Y')  as 'Shipped date'
FROM orders
WHERE shipped_date IS NOT NULL
ORDER BY shipped_date;

-- LPAD(str, len, padstr)
-- The LPAD() function left-pads a string with another string to a certain length.
-- LPAD() function returns the string str, 
-- left-padded with the string padstr to a length of len characters. 
-- If str is longer than len, the return value is shortened to len characters.
SELECT LPAD('hi',4,'??'); # Result -> '??hi'
SELECT LPAD('hi',1,'??'); # Result -> 'h'

SELECT firstname, LPAD(firstname,10,'kk'), LPAD(firstname,5,'kk'), LPAD(firstname,4,'kk') 
FROM employees;

-- TRIM() function
SELECT TRIM(' SQL TRIM Function ');

-- LTRIM() and RTRIM() function
SELECT LTRIM('  SQL LTRIM function');
SELECT RTRIM('SQL RTRIM function   ');

-- YEAR() function
SELECT YEAR('2002-01-01'); # 2002

SELECT YEAR(shipped_date) as year,  COUNT(id) as orderQty
FROM orders 
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);

-- DAY() function
SELECT DAY('2022-01-15'); # 15
-- The following statement uses the DAY() function to return the number of orders by day number in 2004
SELECT DAY(order_date) as dayofmonth, COUNT(*)
FROM orders WHERE YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;
