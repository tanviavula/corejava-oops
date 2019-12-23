package com.nubes.cj.collections;

public class Employee{
	
	private int empno;
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		if(empno==0){
			empno = IdGenerator.getNewId();
		}
		this.name = name;
		this.age = age;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
