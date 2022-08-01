package com.prowings;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class EmployeeAspect {
	@Before("execution(* EmployeeService.deposite(..))")//this is execute before joinpoint(advice)method
	public void beforeAdvice() {
	System.out.println("Before advice method");
}
	@After("execution(* EmployeeService.deposite(..))")//this is execute after joinpoint(advice)method instead of exception
	public void afterAdvice() {
		System.out.println("After advice method");	
	}
	@AfterReturning("execution(* EmployeeService.deposite(..))")//when exception is occurs this method can not be execute
	public void afterReturning() {
		System.out.println("AfterReturning advice method");
	}
	@AfterThrowing("execution(* EmployeeService.deposite(..))")//only execute at the time of exception occurs
	public void afterThrowing() {
		System.out.println("AfterThrowing advice method");
	}
	@Around("execution(* EmployeeService.deposite(..))")
	public boolean  around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around advice method");
		pjp.proceed();
		return true;
	}
}
