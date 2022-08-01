package com.prowings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
public class Student {
//	@Value("10")
	int roll;
//	@Value("RAM")
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}
