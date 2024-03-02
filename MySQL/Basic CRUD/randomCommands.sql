SELECT
 id AS 'No.',
 CONCAT(first_name, ' ', last_name) AS 'Name',
 job_title AS 'Job Title'
FROM employees AS e;

SELECT 
id,
CONCAT_WS(' ',first_name, last_name) AS 'full_name',
 job_title,
 salary
FROM employees
WHERE salary > 1000;

SELECT DISTINCT last_name FROM employees;


SELECT first_name, last_name, job_title, salary FROM employees WHERE department_id = 3;

SELECT id, first_name, department_id
FROM employees
WHERE department_id NOT IN (1, 5, 7 ,9 );


SELECT * FROM employees
WHERE department_id = 4 AND salary >= 1000
ORDER BY id;

SELECT * FROM employees
ORDER BY department_id DESC,salary DESC;

CREATE VIEW v_top_paid_emp AS
SELECT * FROM employees ORDER BY salary DESC;

SELECT first_name, salary FROM v_top_paid_emp LIMIT 1;


INSERT INTO employees VALUES(11, 'First', 'Last', 'Job', 2, 1100);

INSERT INTO employees(first_name, last_name,job_title, department_id, salary)
	VALUES('George','Floid' ,'Cook', 3, 2200);
    
SELECT * FROM employees LIMIT 20;
    
    
    







