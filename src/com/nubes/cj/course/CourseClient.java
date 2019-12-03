package com.nubes.cj.course;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CourseClient {

	public static void main(String[] args) {
	
	/*	int[] even_arr=new int[]{2,4,6,8,10};
		int[] odd_arr = new int[]{1,3,5,7,9};
		int[] nums = new int[even_arr.length + odd_arr.length];
		System.arraycopy(even_arr, 0, nums, 0, even_arr.length);
		System.arraycopy(odd_arr, 0, nums,  even_arr.length , odd_arr.length);
		System.out.println(Arrays.toString(nums));*/
		
		Course[] arr = getCourses();
		// Display only course name
		
		/*
		for(int i = 0; i<arr.length; i++){
			Course c = arr[i];
			System.out.println(c.getName());
		}
		*/	
		
		/*for(Course c : arr){
			System.out.println(c.getName());
		}*/
		
		/*int shortDuration = arr[0].getDuration();
		int index = 0;
		
		for(int i = 1 ; i < arr.length;i++){
			Course c = arr[i];
			if(shortDuration > c.getDuration()){
				shortDuration = c.getDuration();
				index = i;
			}
		}
		
		arr[index].showInfo();*/
		
		/*int maxDuration = arr[0].getDuration();
		int index = 0;
		
		for(int i = 1; i<arr.length; i++){
			Course c = arr[i];
			if(maxDuration < c.getDuration()){
				maxDuration = c.getDuration();
				index = i;
			}
		}
		
		arr[index].showInfo();*/
		
		// All courses fee range 3000 to 5000
		
		/*for(Course c : arr){
			if(c.getPrice() >= 3000 && c.getPrice() <= 5000){
				c.showInfo();
			}
		}*/
		
		// Display all the courses which has "Java" in the title
		
		for(Course c: arr){
			String name = c.getName().toLowerCase();
			if(name.contains("java")){
				c.showInfo();
			}
		}
		
		
		
	}

	private static Course[] getCourses() {

		Course arr[] = new Course[2];
		List<String> list = new ArrayList<String>();
		int i = 0;
		try {
			list = Files.readAllLines(Paths.get("course.csv"));
			for (String line : list) {
				String[] data = line.split(",");
				String name = data[0];
				float price = Float.parseFloat(data[1]);
				int duration = Integer.parseInt(data[2]);
				Course c = new Course(name, price, duration);
				if(i >= arr.length){
					Course[] temp = new Course[i + 3];
					System.arraycopy(arr, 0, temp, 0, i);
					arr = temp;
				}
				arr[i++] = c;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	   	Course[] temp = new Course[i];
		System.arraycopy(arr, 0, temp, 0, i);
		arr = temp;
		return arr;

	}
}
