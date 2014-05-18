package com.endava.jpa.main;

import com.endava.jpa.service.impl.JPAMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JPAMainService jpaMainService = (JPAMainService)context.getBean("JPAMainService");

		
//		jpaMainService.findDepartment();
		//jpaMainService.findDepartmentByName();
                

		
//		jpaMainService.insertDepartment();
//		jpaMainService.updateDepartment();
//		jpaMainService.deleteDepartment();
//		jpaMainService.insertEmployee();
//		jpaMainService.getEmployeesFromBucharest();
//		jpaMainService.giveSalaryRaise();
                jpaMainService.addEmployee();
//		jpaMainService.removeEmployee();
		

	}
}
