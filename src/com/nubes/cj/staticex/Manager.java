package com.nubes.cj.staticex;

public class Manager {

		public static void main(String[] args) {
			
			System.out.println(Employee.org_name);
			Employee emp_1 = new Employee(1001, "Krish", 12_65_440);
			Employee.org_name = "Nubes Technologies";
			Employee emp_2 = new Employee(1002, "Manoj", 750000);
			
			emp_1.showDetails();
			System.out.println("\n");
			emp_2.showDetails();
			
			
			
			
		}
}
