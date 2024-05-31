-- 1. For each product, show the product name "Product" and the product type name "Type.
SELECT p.name AS Product, pt.name AS Type
FROM product p
JOIN product_type pt
ON p.product_type_cd = pt.product_type_cd;

