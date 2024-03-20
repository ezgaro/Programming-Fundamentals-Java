-- 1
DELIMITER $$
CREATE FUNCTION ufu_count_employees_by_town(`name` VARCHAR (50))
RETURNS INT
DETERMINISTIC
BEGIN
 RETURN (SELECT COUNT(*)
FROM employees AS e
JOIN addresses AS a ON e.address_id = a.address_id
JOIN towns AS t ON a.town_id = t.town_id
WHERE t.name = `name`
);
END$$


DELIMITER ;
; 
SELECT ufu_count_employees_by_town('Redmond');


-- 2
DELIMITER $$
CREATE PROCEDURE usp_raise_salaries(percent DECIMAL(3,2), OUT total_increase DECIMAL(19,4)) 
BEGIN 
	DECLARE local_increase DECIMAL(19,4);
    SET local_increase := (SELECT ABS(SUM(salary) - SUM(salary) * percent) FROM employees);
    SET total_increase = local_increase;
    UPDATE employees SET salary = salary * percent; 
END $$
DELIMITER ;
;
SET @increase = 0;
CALL usp_raise_salaries(1.1, @increase);
SELECT @increase;