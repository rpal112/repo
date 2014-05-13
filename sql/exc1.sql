insert into department (codDepartment , departmentName) 
values (1,"HR"), (2,"Developments"),(3,"Testing"),(4,"Management"),(5,"Accounting");


insert into employee (firstName,lastNAme,birthDate,salary,Department_id) 
values ("Cristina","Dumitru",'1989-09-10',2000,9),
("Alina","Alecu",'1987-09-10',2400,10),
("Cristian","Smadici",'1986-09-10',3000,10),
("Gabriel","Bornea",'1988-09-10',3400,10),
("Bogdan","Eremia",'1989-12-10',3300,10),
("Georgiana","Perianu",'1989-09-10',2000,11),
("Cristina","Dobrin",'1990-09-10',2000,11),
("Andreea","Balalia",'1989-09-11',4900,10),
("Razvan","Burli",'1990-03-10',2000,13),
("Veronica","Holban",'1970-09-10',5000,13);

select * from employee;


update employee set salary = salary - (salary/10)
where Department_id = 11;

select max(salary) 'Salariu maxim' , departmentName 'Nume departament' from employee , department 
where
employee.Department_id = department.id
group by departmentName asc;

select max(salary) 'Salariu maxim' , departmentName 'Nume departament' from employee , department
where 
employee.Department_id = department.id
and departmentName like "T%"
having count(employee.id) < 30;

update employee 
Set salary = (salary + salary/10)
where department_id = (select T.CodDep from (select S.department_id as CodDep, count(id) from employee S group by S.department_id having count(id) = 1) as T)




