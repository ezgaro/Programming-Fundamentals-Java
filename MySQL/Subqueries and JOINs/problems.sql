-- 1
SELECT 
employee_id,
CONCAT(first_name,' ', last_name) AS 'full_name',
departments.department_id,
departments.name AS 'name'
FROM departments
JOIN employees
ON employees.employee_id = departments.manager_id
ORDER BY employee_id
LIMIT 5;

-- 2
SELECT 
towns.town_id,
towns.name AS 'town_name',
address_text
FROM
addresses
JOIN towns
ON towns.town_id = addresses.town_id
WHERE towns.name = 'San Francisco' OR towns.name = 'Sofia' OR towns.name = 'Carnation'
ORDER BY town_id, address_id;


-- 3
SELECT employee_id, first_name, last_name, department_id, salary FROM employees WHERE manager_id IS NULL;

-- 4
SELECT COUNT(salary) AS 'count'
FROM employees
WHERE salary > (
SELECT AVG(salary) FROM employees
);