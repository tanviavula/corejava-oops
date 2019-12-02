package com.nubes.cj;

class Student {

	static String schoolName = "Nubes Techno School";
	int regno;
	String name;
	int section;
	float fee;

	public Student(int regno, String name, int section, float fee) {
		this.regno = regno;
		this.name = name;
		this.section = section;
		this.fee = fee;
	}

	void promoteSection(int num) {
		this.section += num;
	}

	void showInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nRegno: ").append(regno).append("\nName: ").append(name).append("\nSection: ").append(section)
				.append("\nFee: ").append(fee);

		System.out.println(sb.toString());
	}
}

public class Manager {

	public static void main(String[] args) {

		System.out.println("Sutdent information of :" + Student.schoolName);

		Student s1 = new Student(1001, "Lakshman", 6, 65500);
		Student s2 = new Student(1002, "Krish", 6, 55500);
		Student s3 = new Student(1003, "Manoj", 6, 45500);
		Student s4 = new Student(1004, "Suresh", 6, 75500);
		Student s5 = new Student(1005, "Rajesh", 6, 35500);

		Student stuArr[] = new Student[] { s1, s2, s3, s4, s5 };

		/*
		 * for(int i=0;i<stuArr.length;i++){ Student s = stuArr[i];
		 * s.showInfo(); System.out.println("----------------------"); }
		 */

		for (Student s : stuArr) {
			s.showInfo();
			System.out.println("---------------------");
		}

		int totalFee = 0;
		for (Student s : stuArr) {
			totalFee += s.fee;
		}
		float feeAvg = totalFee/(float)stuArr.length;
		System.out.println("Total fee :"+totalFee);
		System.out.println("Average fee :"+feeAvg);

	}
}
