package com.nubes.cj.collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class ProductExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ganga");
		list.add("Rajesh");
		list.add("Mahesh");
		list.add("Charan");
		list.add("Sai");
		
		System.out.println(list.size());
		System.out.println(list);
		//Collections.sort(list);
		List<String> sortedList = list.stream()
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);
		
	}
}
