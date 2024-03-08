-- 1
SELECT department_id,
COUNT(*) AS "Number of employees"
FROM employees
GROUP BY department_id;
-- 2
SELECT 
department_id,
ROUND(AVG(salary), 2)
FROM employees
GROUP BY department_id;


-- 3
SELECT 
department_id,
MIN(salary) AS "Min salary"
FROM employees
GROUP BY department_id
HAVING `Min salary` > 800;

-- 4
SELECT COUNT(*)
FROM products
WHERE category_id = 2 AND price > 8;

-- 5
SELECT 
category_id,
ROUND(AVG(price), 2) AS "Average Price",
MIN(price) AS "Cheapest Product",
MAX(price) AS "Most Expensive Product"
FROM products
GROUP BY category_id;










