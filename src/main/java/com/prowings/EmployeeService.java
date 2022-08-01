package com.prowings;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
public boolean deposite(String accNo,int salary) {
	//int res=salary/0;
	if(accNo=="SBIN123") {
		System.out.println("Deposite Successfully");
		return true;
	}
	return false;
	
}

@Override
public String toString() {
	return "EmployeeService []";
}

}
