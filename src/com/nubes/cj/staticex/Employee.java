package com.nubes.cj.staticex;

public class Employee{

		public static String org_name = "Nubes";
		private int empno;
		private String ename;
		private float salary;

		public Employee(int empno, String ename, float salary) {
			this.empno = empno;
			this.ename = ename;
			this.salary = salary;
		}
		
		public void showDetails(){
			float tax_amount = TaxCalculator.calculate(salary);
			System.out.println("Empno:"+empno+"\nEname:"+ename+"\nSalary:"+salary+"\nTax:"+tax_amount);
		}
		@Override
		public String toString() {
			return org_name+" Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
		}

		
		
}
