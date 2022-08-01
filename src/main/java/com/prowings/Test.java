package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
//		Student s = ctx.getBean(Student.class);
//		System.out.println(s);
//		System.out.println("********************");
//		Employee emp=ctx.getBean("emp",Employee.class);
//		System.out.println(emp);
		EmployeeService emp=ctx.getBean(EmployeeService.class);
		emp.deposite("SBIN123",1200);
		System.out.println(emp);
	}
}
