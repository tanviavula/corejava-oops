package com.nubes.cj.finalkeyword;

class Employee {

	private final int empno;
	private final int deptno;

	public Employee(int empno, int deptno) {
		this.empno = empno;
		this.deptno = deptno;
	}

	public Employee changeDept(int deptno){
		return new Employee(this.empno, deptno);
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", deptno=" + deptno + "]";
	}

}

public class ImmutableObject {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1001, 10);
			System.out.println(emp1);
			Employee emp2 =emp1.changeDept(20);
			System.out.println(emp2);
		
		}
}
