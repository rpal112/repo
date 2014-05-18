package com.endava.jpa.service.impl;

import com.endava.jpa.model.Address;
import com.endava.jpa.model.Department;
import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;
import com.endava.jpa.service.DepartmentService;
import com.endava.jpa.service.EmpPrjService;
import com.endava.jpa.service.EmployeeService;
import com.endava.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAMainService {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;
    
    @Autowired
    private EmpPrjService empPrjService;

	//-------------------------------------- Department -----------------------------/
    public void findDepartment() {
        Department department = departmentService.find(1);
        System.out.println(department);
    }

    public void findDepartmentByName() {
        List<Department> departments = departmentService.find("Development");
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    /**
     * Define a new department entity and insert it into the corresponding table
     */
    public void insertDepartment() {
        Department d = new Department();
        d.setName("Accounting");
        departmentService.save(d);
    }

    /**
     * Search for an existing department, update its name and save it using the
     * new name
     */
    public void updateDepartment() {
        Department d = departmentService.find(2);
        d.setName("QA");
        departmentService.update(d);

    }

    /**
     * Delete an existing department from the database
     */
    public void deleteDepartment() {
      
       departmentService.remove(departmentService.find(3));
    }

    //-------------------------------------- Employee -----------------------------/
    /**
     * Create a new employee entity and save it into the corresponding table
     */
    public void insertEmployee() {
        Employee e = new Employee();
        e.setName("Dodan Cosmin");
        e.setSalary(2700l);
        e.setDepartment(departmentService.find(1));
        e.setAddress(new Address("Sadului", "Bucharest", "Romania", "02231"));
        employeeService.save(e);
        
        
    }

    /**
     * Print to stdout all the employees from 'Bucharest', which belong to the
     * department with id = 1. Make sure that there are more than two employees
     * in Bucharest which belong to the department with id=1 when populating the
     * DB. ! Use a join query.
     */
    public void getEmployeesFromBucharest() {
        List<Employee> result = employeeService.findByCityAndByDepartment("Bucharest", 1);
        for(Employee e:result){
            System.out.println("The employee is:  " + e.getName() + " " + e.getAddress().getCity()+ " " +e.getDepartment().getName());
        }
        
    }

    /**
     * Give a salary raise(+10%) for all employees that work in the 'Endava'
     * project (project name = 'Endava'). ! Use a join query.
     */
    public void giveSalaryRaise() {
    }

	//-------------------------------------- Project -----------------------------/
    /**
     * Add a new employee to the 'Endava' project. (project name = 'Endava')
     */
    public void addEmployee() {
    Employee e = employeeService.find(1);
    Project p = projectService.find(1);
    empPrjService.addEmployee(e, p);
    }

    /**
     * Remove an employee from a project which has 'John Doe' as project
     * manager.
     */
    public void removeEmployee() {
    }

}
