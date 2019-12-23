package com.nubes.cj.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		Employee emp1 = new Employee("Krish", 36);
		Employee emp5 = new Employee("Kiran", 46);
		Employee emp2 = new Employee("Rajesh", 38);
		Employee emp3 = new Employee("Ganga", 24);
		Employee emp4 = new Employee("Mahesh", 46);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		for (Employee emp : empList) {
			System.out.println(String.format("%d %s %d", emp.getEmpno(), emp.getName(), emp.getAge()));
		}

		// Find Max Age Employee's
		Integer maxAge = empList.stream().map(Employee::getAge).max(Integer::compareTo).get();

		/*
		 * empList.stream().filter(e->e.getAge()== maxAge).forEach(e->{
		 * System.out.println(String.format("%d %s %d",
		 * e.getEmpno(),e.getName(),e.getAge())); });
		 */

		System.out.println("-------------------------------------------------");
		for (Employee emp : empList) {
			int age = emp.getAge();
			if (age == maxAge) {
				System.out.println(String.format("%d %s %d", emp.getEmpno(), emp.getName(), emp.getAge()));
			}
		}

		// Find the average employees age of organization
		System.out.println("------------------------");
		/*
		 * int agesum = 0; for(Employee emp:empList){ int age = emp.getAge();
		 * agesum += age; } float avgAges = agesum / empList.size();
		 * System.out.println("Average :"+avgAges);
		 */

		double average = empList.stream().mapToInt(Employee::getAge).average().getAsDouble();

		// Search employee by given name

		System.out.println("Enter the name to search:");
		String name = "sh";
		System.out.println("------------------ Search Result -----------------");
		for (Employee emp : empList) {
			String ename = emp.getName();
			if (ename.toLowerCase().contains(name.toLowerCase())) {
				System.out.println(String.format("%d %s %d", emp.getEmpno(), emp.getName(), emp.getAge()));
			}
		}

		// Display employees in descending order by their age
		System.out.println("----------------- Sort Employees ----------------------");
		empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(emp -> {
			System.out.println(String.format("%d %s %d", emp.getEmpno(), emp.getName(), emp.getAge()));
		}

		);

	}
}
