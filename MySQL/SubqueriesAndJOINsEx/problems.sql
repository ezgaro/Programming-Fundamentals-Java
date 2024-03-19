-- 1
SELECT e.employee_id, e.job_title, a.address_id, a.address_text
FROM addresses AS a JOIN employees AS e ON
a.address_id = e.address_id
ORDER BY address_id LIMIT 5;

-- 2
SELECT e.first_name, e.last_name, t.name AS 'town', a.address_text
FROM employees AS e 
JOIN addresses AS a ON
e.address_id = a.address_id
JOIN towns AS t ON a.town_id = t.town_id
ORDER BY first_name, last_name;

-- 3
SELECT e.employee_id, e.first_name, e.last_name, d.name AS 'department_name'
FROM employees AS e JOIN departments AS d ON
e.department_id= d.department_id
WHERE d.name = 'Sales'
ORDER BY e.employee_id DESC;

-- 4
SELECT e.employee_id, e.first_name, e.salary, d.name AS 'department_name'
FROM employees AS e JOIN departments AS d ON
e.department_id = d.department_id
WHERE e.salary > 15000
ORDER BY e.department_id DESC;

-- 5
SELECT employee_id, first_name
FROM employees
WHERE employee_id NOT IN (
    SELECT employee_id
    FROM employees_projects
)
ORDER BY employee_id DESC
LIMIT 3;

-- 6
SELECT e.first_name, e.last_name, e.hire_date, d.name AS 'dept_name'
FROM employees AS e JOIN departments AS d ON 
d.department_id = e.department_id
WHERE e.hire_date > '1999-01-01' AND d.name IN ('Sales', 'Finance')
ORDER BY e.hire_date;


-- 7
SELECT e.employee_id, e.first_name, p.name AS project_name
FROM employees AS e 
JOIN employees_projects AS ep ON
e.employee_id = ep.employee_id
JOIN projects AS p ON
ep.project_id = p.project_id
WHERE p.start_date > '2002-08-13' AND p.end_date IS NULL
ORDER BY e.first_name, project_name LIMIT 5;


-- 8
SELECT e.employee_id, e.first_name, 
       IF(YEAR(p.start_date) >= 2005, NULL, p.name) AS project_name
FROM employees AS e 
JOIN employees_projects AS ep ON e.employee_id = ep.employee_id
JOIN projects AS p ON ep.project_id = p.project_id
WHERE e.employee_id = 24
ORDER BY p.name;

-- 10
SELECT e.employee_id, CONCAT(e.first_name, ' ', e.last_name), CONCAT(m.first_name, ' ', m.last_name), d.name FROM employees AS e
				JOIN employees AS m ON e.manager_id = m.employee_id
                JOIN departments AS d ON e.department_id = d.department_id
ORDER BY e.employee_id
LIMIT 5;           

-- 11
SELECT AVG(e.salary) AS 'avg_salary' FROM employees AS e GROUP BY e.department_id ORDER BY avg_salary LIMIT 1;

-- 12
SELECT c.country_code, m.mountain_range, p.peak_name, p.elevation FROM countries AS c
			JOIN mountains_countries AS mc ON c.country_code = mc.country_code
            JOIN mountains AS m ON m.id = mc.mountain_id
            JOIN peaks AS p ON p.mountain_id = m.id
WHERE c.country_name = 'Bulgaria' AND p.elevation > 2835
ORDER BY p.elevation DESC;            

-- 13
SELECT c.country_code, COUNT(mc.mountain_id) AS mountain_ranges_count FROM countries AS c
				JOIN mountains_countries AS mc ON c.country_code = mc.country_code
GROUP BY c.country_code                
HAVING c.country_code IN ('BG', 'US', 'RU')
ORDER BY mountains_range_count DESC;

-- 14
SELECT c.country_name, r.river_name
FROM countries AS c
			LEFT JOIN countries_rivers AS cr ON c.country_code = cr.country_code
            LEFT JOIN rivers AS r ON r.id = cr.river_id
WHERE c.continent_code = 'AF'
ORDER BY c.country_name
LIMIT 5;


-- 15
SELECT c.continent_code, currency_code, COUNT(*) AS currency_usage
FROM countries as c
GROUP BY c.continent_code, c.currency_code
HAVING currency_usage > 1
	AND currency_usage = (SELECT count(*) AS count_of_currencies
							FROM countries as c2
                            WHERE c2.country_code = c.continent_code
                            GROUP BY c2.currency_code
                            ORDER BY count_of_currencies DESC
                            LIMIT 1)
ORDER BY c.continent_code, c.currency_code;    














