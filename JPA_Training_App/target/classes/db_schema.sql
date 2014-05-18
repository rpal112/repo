CREATE DATABASE IF NOT EXISTS JPA;
USE JPA;


CREATE TABLE IF NOT EXISTS department(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS employee (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100),
	salary LONG,
	dept_id INT,
	street VARCHAR(100),
	city VARCHAR(100),
	state VARCHAR(100),
	zip_code VARCHAR(10),
	birthday TIMESTAMP,
	FOREIGN KEY(dept_id) REFERENCES department(id)
);

CREATE TABLE IF NOT EXISTS project (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100),
	project_manager VARCHAR(100),
	description VARCHAR(500)
);

CREATE TABLE IF NOT EXISTS emp_prj (
        id INT PRIMARY KEY AUTO_INCREMENT,
        prjId INT,
        empId INT,
        FOREIGN KEY(prjId) REFERENCES project(id),
        FOREIGN KEY(empId) REFERENCES employee(id)
);
  