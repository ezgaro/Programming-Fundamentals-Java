-- USE  soft_uni;
-- USE geography;
-- USE diablo;
USE orders;

-- 1
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    LOWER(first_name) LIKE 'sa%'
ORDER BY employee_id;

-- 2
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    LOWER(last_name) LIKE '%ei%'
ORDER BY employee_id;


-- 3
SELECT 
    first_name
FROM
    employees
WHERE
    department_id IN (3 , 10)
        AND YEAR(hire_date) BETWEEN 1995 AND 2005
ORDER BY employee_id ASC;

-- 4
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    LOWER(job_title) NOT LIKE '%engineer%'
ORDER BY employee_id;


-- 5
SELECT 
    *
FROM
    towns
WHERE
    LENGTH(name) IN (5 , 6)
ORDER BY name ASC;


-- 6
SELECT 
    *
FROM
    towns
WHERE
    LOWER(name) REGEXP '^[m,b,k,e]'
ORDER BY name ASC;



-- 7
SELECT 
    *
FROM
    towns
WHERE
    UPPER(name) NOT REGEXP '^[R,B,D]'
ORDER BY name ASC;

-- 8
CREATE VIEW v_employees_hired_after_2000 AS
    SELECT 
        first_name, last_name
    FROM
        employees
    WHERE
        YEAR(hire_date) > 2000;


-- 9
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    LENGTH(last_name) = 5;


-- 10
SELECT 
    country_name, iso_code
FROM
    countries
WHERE
    UPPER(country_name) LIKE '%A%A%A%'
ORDER BY iso_code ASC;

-- 11
SELECT 
p.peak_name,
r.river_name,
LOWER(CONCAT(p.peak_name,SUBSTRING(r.river_name, 2))) AS mix
FROM peaks AS p, rivers AS r
WHERE UPPER(RIGHT(p.peak_name, 1)) = UPPER(LEFT(r.river_name, 1))
ORDER BY mix;

-- 12
SELECT name, DATE_FORMAT(start, '%Y-%m-%d')
FROM games
WHERE YEAR(start) in (2011, 2012)
ORDER BY start
LIMIT 50;


-- 13
SELECT 
user_name,
SUBSTRING_INDEX(email, '@', -1) AS `email provider`
FROM users
ORDER BY `email provider`,user_name;


-- 14
SELECT 
user_name,
ip_address
FROM users
WHERE ip_address LIKE "___.1%.%.___"
ORDER BY user_name;


-- 15
SELECT 
    name AS game,
    CASE
        WHEN HOUR(start) BETWEEN 0 AND 11 THEN 'Morning'
        WHEN HOUR(start) BETWEEN 12 AND 17 THEN 'Afternoon'
        ELSE 'Evening'
    END AS 'Part of the day',
    CASE
        WHEN duration <= 3 THEN 'Extra Short'
        WHEN duration BETWEEN 4 AND 6 THEN 'Short'
        WHEN duration BETWEEN 7 AND 10 THEN 'Long'
        ELSE 'Extra Long'
    END AS 'Duration'
FROM
    games
ORDER BY name;



-- 16
SELECT product_name,
order_date,
DATE_ADD(order_date, INTERVAL 3 DAY) AS pay_due,
DATE_ADD(order_date, INTERVAL 1 MONTH) AS deliver_due
FROM orders;











