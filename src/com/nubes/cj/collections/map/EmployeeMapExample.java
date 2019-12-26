package com.nubes.cj.collections.map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMapExample {

	public static void main(String[] args) {
		List<Employee> list = loadSeedData();
		System.out.println("----------------- Employee Details -------------");
		for (Employee emp : list) {
			System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getDept() + " " + emp.getSalary());
		}

		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : list) {

			String deptName = emp.getDept();

			if (deptMap.get(deptName) == null) {
				List<Employee> tlist = new ArrayList<>();
				deptMap.put(deptName, tlist);
			}
			List<Employee> tlist = deptMap.get(deptName);
			tlist.add(emp);
			deptMap.put(deptName, tlist);

		}

		for (String deptName : deptMap.keySet()) {
			System.out.println(deptName + " " + deptMap.get(deptName));
		}
		
		// What is total salary by department
		
		// Get all unique names of the employee from all the department
		
		// Get count of employees by department
				
		// Total salary paid to the all the departments
		
		// Get max paid employee department 
	}

	public static List<Employee> loadSeedData() {
		List<Employee> empList = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get("employee.txt"));
			for (String line : lines) {

				String[] arr = line.split(",");
				int empno = Integer.parseInt(arr[0]);
				String name = arr[1];
				String dept = arr[2];
				float salary = Float.parseFloat(arr[3]);

				Employee emp = new Employee(empno, name, dept, salary);
				empList.add(emp);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empList;
	}
}
