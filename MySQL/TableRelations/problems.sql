-- 1

CREATE DATABASE mountains;
USE mountains;

CREATE TABLE mountains(
	id INT AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    CONSTRAINT pk_mountains_id PRIMARY KEY (id)
);

INSERT INTO mountains(`name`) VALUES ('Rila'), ('Pirin');

SELECT `name` FROM mountains;

CREATE TABLE peaks(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    mountain_id INT NOT NULL,
    CONSTRAINT fk__peaks_mountain_id__mountains_id 
		FOREIGN KEY (mountain_id)
		REFERENCES mountains(id)
);

-- 2
SELECT 
driver_id,
vehicle_type,
CONCAT(first_name, ' ', last_name) AS 'driver_name'
FROM vehicles
	JOIN campers ON driver_id = campers.id;
    
-- 3
SELECT 
starting_point,
end_point,
campers.id AS 'leader_id',
CONCAT(first_name, ' ', last_name) AS 'leader_name' 
 FROM routes
 JOIN campers ON routes.leader_id = campers.id;


-- 4
CREATE TABLE mountains(
	id INT AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    CONSTRAINT pk_mountains_id PRIMARY KEY (id)
);


CREATE TABLE peaks(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    mountain_id INT NOT NULL,
    CONSTRAINT fk_peaks_mountain_id_mountains_id
		FOREIGN KEY (mountain_id)
		REFERENCES mountains(id)
        ON DELETE CASCADE
);
INSERT INTO peaks(`name`, mountain_id)
VALUES ('Musala', 1) , ('Vihren', 2);


-- 5
CREATE TABLE clients(
	id INT(11) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    client_name VARCHAR(100)
);

CREATE TABLE projects(
	id INT(11) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    client_id INT(11),
    project_lead_id INT(11),
    CONSTRAINT fk_projects_client_id__clients_id
    FOREIGN KEY (client_id)
    REFERENCES clients(id)
);

CREATE TABLE employees(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    project_id INT,
    CONSTRAINT fk__employees_project_id__projects_id
		FOREIGN KEY (project_id)
        REFERENCES projects(id)
);

ALTER TABLE projects
ADD CONSTRAINT fk_projects_project_lead_id__employees_id
	FOREIGN KEY	(project_lead_id)
    REFERENCES employees(id);











