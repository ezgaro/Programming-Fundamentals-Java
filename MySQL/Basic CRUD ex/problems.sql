-- USE soft_uni;
-- USE geography;
USE diablo;
-- 1
SELECT * FROM departments ORDER BY department_id;

-- 2
SELECT name FROM departments ORDER BY department_id;


-- 3
SELECT first_name, last_name, salary FROM employees ORDER BY employee_id;

-- 4
SELECT first_name, middle_name,last_name FROM employees ORDER BY employee_id;

-- 5
SELECT 
CONCAT(first_name, ".",last_name, "@softuni.bg") AS full_email_address
FROM employees AS e;

-- 6
SELECT DISTINCT salary FROM employees;

-- 7
SELECT * FROM employees WHERE job_title = "Sales Representative" ORDER BY employee_id;

-- 8
SELECT first_name, last_name, job_title FROM employees WHERE salary BETWEEN 20000 AND 30000 ORDER BY employee_id;

-- 9
SELECT 
CONCAT_WS(' ',first_name, middle_name, last_name) as 'Full Name' 
FROM employees 
WHERE salary = 25000 OR salary = 14000 OR salary = 12500 OR salary = 23600;

-- 10
SELECT first_name, last_name FROM employees WHERE manager_id IS NULL;

-- 11
SELECT first_name,last_name, salary FROM employees WHERE salary > 50000 ORDER BY salary DESC;

-- 12
SELECT first_name, last_name FROM employees ORDER BY salary DESC LIMIT 5;

-- 13
SELECT first_name, last_name FROM employees WHERE department_id != 4;

-- 14
SELECT * FROM employees ORDER BY salary DESC, last_name DESC ,first_name ASC, middle_name ASC, employee_id;

-- 15
CREATE VIEW v_employees_salaries AS
SELECT first_name, last_name, salary FROM employees;


-- 16
CREATE VIEW  v_employees_job_titles AS
SELECT 
CONCAT_WS(' ', first_name, middle_name, last_name) AS full_name
FROM employees;

-- 17
SELECT DISTINCT job_title FROM employees ORDER BY job_title ASC;

-- 18
SELECT * FROM projects
ORDER BY start_date, name LIMIT 10;


-- 19
SELECT first_name, last_name, hire_date FROM employees ORDER BY hire_date DESC LIMIT 7;

-- 20
UPDATE employees AS e
SET salary  = salary * 1.12
WHERE department_id IN (1,2,4,11);
SELECT salary FROM employees;

-- 21
SELECT peak_name FROM peaks ORDER BY peak_name;

-- 22
SELECT country_name, population FROM countries WHERE continent_code = 'EU' ORDER BY population DESC, country_name ASC LIMIT 30;


-- 23
SELECT * FROM countries;

SELECT 
country_name,
country_code,
IF(currency_code = "EUR", "Euro", "Not Euro") AS currency
FROM countries 
ORDER BY country_name ASC;

-- 24
SELECT name FROM characters ORDER BY name ASC;