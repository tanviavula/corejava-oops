package com.nubes.cj.collections.map;

public class Employee {
		
		private int empno;
		private String ename;
		private String dept;
		private float salary;
	
		public Employee(int empno, String ename, String dept, float salary) {
			this.empno = empno;
			this.ename = ename;
			this.dept = dept;
			this.salary = salary;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
		}
		
		
}
