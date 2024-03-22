SET GLOBAL log_bin_trust_function_creators = 1;
SET SQL_SAFE_UPDATES = 0;
 -- 1
 DELIMITER $$
 CREATE PROCEDURE usp_get_employees_salary_above_35000() 
 BEGIN
	SELECT first_name, last_name 
	FROM employees
	WHERE salary  > 3500
	ORDER BY first_name, last_name, employee_id;
 END $$
DELIMITER ;
;
-- 2
DELIMITER $$
CREATE PROCEDURE usp_get_employees_salary_above(salary_limit DOUBLE(19,4))
BEGIN
	SELECT first_name, last_name
    FROM employees
    WHERE salary >= salary_limit
    ORDER BY first_name, last_name, employee_id;
END $$
DELIMITER ;
;
 
 -- 3
 DELIMITER $$
CREATE PROCEDURE usp_get_towns_starting_with(name_starts_with VARCHAR(50))
BEGIN
	SELECT name
    FROM towns
    WHERE name LIKE 'b%'
    ORDER BY name;
END $$
DELIMITER ;
;
 
-- 4
DELIMITER $$
CREATE PROCEDURE usp_get_employees_from_town(town_name VARCHAR(50))
BEGIN
	SELECT first_name, last_name
    FROM employees AS e
		JOIN addresses AS a ON e.address_id = a.address_id
        JOIN towns AS t ON t.town_id = a.town_id
WHERE t.name = 'Sofia'
ORDER BY e.first_name, e.last_name, e.employee_id;
END $$
DELIMITER ;
;

-- 5
CREATE FUNCTION ufn_get_salary_level(salary DECIMAL(19,4))
RETURNS VARCHAR(7)
DETERMINISTIC
RETURN (
		CASE 
		  WHEN salary < 30000 THEN 'Low'
          WHEN salary  <= 50000 THEN 'Average'
          ELSE 'High'
		END
)

-- 6
DELIMITER $$
CREATE PROCEDURE usp_get_employees_by_salary_level(salary_level VARCHAR(7))
BEGIN
	SELECT first_name, last_name
    FROM employees 
    WHERE salary < 30000 AND salary_level = 'Low'
		OR salary >= 30000 AND salary <= 50000 AND salary_level = 'Average'
        OR salary > 50000 AND salary_level = 'High'
        ORDER BY first_name DESC, last_name DESC;
END $$
DELIMITER ;
;

-- 8
DELIMITER $$
CREATE PROCEDURE usp_get_holders_full_name()
BEGIN
	SELECT CONCAT_WS(' ', first_name, last_name) AS 'full name' 
	FROM account_holders
	ORDER BY `full name`;
END $$
DELIMITER ;
;


-- 9
DELIMITER $$
CREATE PROCEDURE usp_get_holders_with_balance_higher_than(money_to_compare DECIMAL(19,4))
BEGIN
	SELECT ah.first_name, ah.last_name
	FROM account_holders AS ah
	JOIN accounts AS a ON ah.id = a.account_holder_id
	GROUP BY ah.id
	HAVING SUM(a.balance) > money_to_compare
	ORDER BY ah.id; 
END $$
DELIMITER ;
;

-- 10
CREATE FUNCTION ufn_calculate_future_value(initial_sum DECIMAL(19,4), interest_rate_per_year DECIMAL(19,4), years INT) 
RETURNS DECIMAL(19,4)
RETURN initial_sum * POW((1 + interest_rate_per_year), years);


-- 11
DELIMITER $$
CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT, interest_per_year DECIMAL(19,4))
BEGIN
SELECT ah.id, ah.first_name, ah.last_name, a.balance AS current_balance, ufn_calculate_future_value(a.balance, interest_per_year , 5) AS 'balance_in_5_years'
FROM accounts AS a
		JOIN account_holders AS ah ON a.account_holder_id = ah.id
WHERE a.id = account_id;
END $$
DELIMITER ;
;

-- 13
DELIMITER $$
CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19,4))
BEGIN
	IF money_amount > 0 THEN 
    START TRANSACTION;
    
    UPDATE accounts AS a
    SET a.balance = a.balance - money_amount
    WHERE account_id = a.id;
    
		IF(SELECT a.balance FROM accounts WHERE account_id = id) < 0
		THEN 
			ROLLBACK;
		ELSE 
			COMMIT;
		END IF;
    END IF;
END$$
DELIMITER ;
;

-- 14
DELIMITER $$
CREATE PROCEDURE usp_withdraw_money(from_account_id INT, to_account_id INT, money_amount DECIMAL(19,4))
BEGIN
	IF money_amount > 0
		AND(SELECT id FROM accounts WHERE from_account_id = id) IS NOT NULL
        AND(SELECT id FROM accounts WHERE to_account_id = id) IS NOT NULL
        AND(SELECT balance FROM accounts WHERE from_account_id = id) >= money_amount
    THEN 
		START TRANSACTION;
        
        UPDATE accounts 
        SET balance = balance - money_amount
        WHERE id = from_account_id;
        
        UPDATE accounts 
        SET balance = balance + money_amount
        WHERE id = to_account_id;
    END IF;    
END $$
DELIMITER ;
;





 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 