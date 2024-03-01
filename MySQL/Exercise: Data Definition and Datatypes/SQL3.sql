-- CREATE DATABASE minions;
-- USE minions;

-- -- 1
-- CREATE TABLE minion(
-- id INT PRIMARY KEY AUTO_INCREMENT,
-- minionname VARCHAR(47),
-- age INT
-- );

-- 7

-- CREATE TABLE people (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     NAME VARCHAR(200) NOT NULL,
--     picture BLOB,
--     heigth DOUBLE(10 , 2 ),
--     width DOUBLE(10 , 2 ),
--     gender CHAR(1) NOT NULL,
--     birthdate DATE NOT NULL,
--     biography TEXT
-- );

-- INSERT INTO people (name, gender, birthdate)
-- VALUES
-- ('svako', 'm', DATE(NOW())),
-- ('divna', 'f', DATE(NOW())),
-- ('kalcho', 'm', DATE(NOW())),
-- ('vaseto', 'm', DATE(NOW())),
-- ('francheska', 'f', DATE(NOW()));


-- CREATE TABLE users (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     username VARCHAR(30) NOT NULL,
--     password VARCHAR(26) NOT NULL,
--     profile_picture BLOB,
--     last_login_time DATETIME,
--     is_deleted BOOLEAN
-- );

-- INSERT INTO users(id, username, password)
-- VALUES
-- (1,'SvekoMi', 'papapagal'),
-- (2,'KalchoBeets', 'imalibagashh'),
-- (3,'Rangelov', 'taaatus'),
-- (4,'nikiC', 'govedoe'),
-- (5,'ddiivvnnaa', 'tqEDivnaa');

-- -- 8
-- ALTER TABLE users
-- DROP PRIMARY KEY,
-- ADD CONSTRAINT pk_users2
-- PRIMARY KEY users(id, username); 

-- -- 9
-- ALTER TABLE users
-- CHANGE COLUMN last_login_time
-- last_login_time DATETIME DEFAULT NOW();

-- -- 10
-- ALTER TABLE users
-- DROP PRIMARY KEY,
-- ADD CONSTRAINT pk_users
-- PRIMARY KEY users(id),
-- CHANGE COLUMN username
-- username VARCHAR(30) UNIQUE;

-- 11
-- CREATE DATABASE movie;
-- USE movie;

-- CREATE TABLE directors(
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     director_name VARCHAR(50) NOT NULL,
--     notes TEXT
-- );

-- INSERT INTO directors (director_name) VALUES ('test'),('test'),('test'),('test'),('test');

-- CREATE TABLE genres(
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     genre_name VARCHAR(20) NOT NULL,
--     notes TEXT
-- );
-- INSERT INTO genres (genre_name) VALUES ('test'),('test'),('test'),('test'),('test');

-- CREATE TABLE categories(
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     category_name VARCHAR(20) NOT NULL,
--     notes TEXT
-- );
-- INSERT INTO categories (categorie_name ) VALUES ('test'),('test'),('test'),('test'),('test');

-- CREATE TABLE movies(
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     title VARCHAR(50) NOT NULL,
--     director_id INT,
--     copyright_year YEAR,
--     length_minutes DOUBLE,
--     genre_id INT,
--     category_id INT,
--     rating DOUBLE,
--     notes TEXT,
--     FOREIGN KEY fk_movies_directors (director_id) REFERENCES directors(id),
-- 	FOREIGN KEY fk_movies_genres (genre_id) REFERENCES genres(id),
-- 	FOREIGN KEY fk_movies_categories (category_id) REFERENCES categories(id)
-- );

-- INSERT INTO movies (title, director_id,genre_id, category_id) 
-- VALUES ('test', 1, 2, 3), ('test', 1, 2, 5), ('test', 1, 2, 4), ('test', 1, 2, 3), ('test', 1, 2, 3);

-- 12
CREATE DATABASE soft_uni;
USE soft_uni;

CREATE TABLE towns(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30)
);

CREATE TABLE addresses(
id INT PRIMARY KEY AUTO_INCREMENT,
address_text TEXT,
town_id INT
);


CREATE TABLE departments(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30)
);

CREATE TABLE employees(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(20),
middle_name VARCHAR(10),
last_name VARCHAR(15),
job_title VARCHAR(15),
department_id INT,
hire_date DATETIME DEFAULT NOW(),
salary DOUBLE,
address_id INT,
FOREIGN KEY (department_id)
REFERENCES departments(id),
FOREIGN KEY (address_id)
REFERENCES addresses(id)
);

SELECT * FROM employees as e order by e.salary desc;

































