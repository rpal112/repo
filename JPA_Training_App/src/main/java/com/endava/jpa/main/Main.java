package com.endava.jpa.main;

import com.endava.jpa.service.impl.JPAMainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JPAMainService jpaMainService = (JPAMainService) context.getBean("JPAMainService");

//		jpaMainService.findDepartment();                  //Done
//              jpaMainService.findDepartmentByName();            //Done
//		jpaMainService.insertDepartment();                //Done
//		jpaMainService.updateDepartment();                //Done
//              jpaMainService.deleteDepartment();                //Done
//		jpaMainService.insertEmployee();                  //Done
//		jpaMainService.getEmployeesFromBucharest();       //Done
//		jpaMainService.giveSalaryRaise();                 //Done
//              jpaMainService.addEmployee();                     //Done
//		jpaMainService.removeEmployee();                  //Done
//              jpaMainService.findEmpPrj(2,3);                   //Done
    }
}
