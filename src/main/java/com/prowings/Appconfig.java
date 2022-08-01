package com.prowings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.prowings")
@EnableAspectJAutoProxy
public class Appconfig {
//	@Bean(name="std")
//	@Scope("prototype")
//	public Student getStudent() {
//		return new Student(10,"RAM");
//	}
//	@Bean(name="emp")
//	public Employee getEmployee() {
//		return new Employee();
//		
//	}
}
