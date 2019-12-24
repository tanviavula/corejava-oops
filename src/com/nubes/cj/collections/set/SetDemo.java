package com.nubes.cj.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {
	
		public static void main(String[] args) {
			String data = "Lakshman,Krish,Manoj,Balu,Krish,Manoj,Balu,Rajesh,Suresh,Mahesh,Jayesh,Rupesh,Kamesh";
			Set<String> names = new HashSet<>();
		
			for(String name : data.split(",")){
				names.add(name);
			}

			for(String name: names){
				System.out.println(name);
			
			}
			
			Iterator<String> iterator = names.iterator();
			while(iterator.hasNext()){
				String name = iterator.next();
				if(name.startsWith("M")){
					iterator.remove();
				}
			}
			System.out.println(names);
			
			//Java 8
			System.out.println("------------------Java8 Stream-----------------");
			names.stream().forEach(System.out::println);
			
			// Before Java 8
			
			Set<String> filteredSet = new HashSet<>();
			for(String name:names){
				if(name.endsWith("sh")){
					filteredSet.add(name);
				}
			}
			System.out.println(filteredSet);
			
			// Java8
			
			Set<String> filteredNames = names.stream()
					                          .filter(e->e.endsWith("sh"))
					                          .collect(Collectors.toSet());
			
			System.out.println(filteredNames);
			
		}
}
