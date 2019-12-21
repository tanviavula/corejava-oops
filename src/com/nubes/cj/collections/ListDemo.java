package com.nubes.cj.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.omg.CORBA.Environment;

public class ListDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();  
		numbers.add(1001);
		numbers.add(1002);
		numbers.add(1003);
		System.out.println(numbers);
		numbers.set(1, 1009);
		numbers.add(3, 1010);
		System.out.println(numbers);
		//---------------------------------------------------------//
		
		List<Integer> evenNumber = new ArrayList<Integer>();  
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		
		List<Integer> oddNumber = new ArrayList<Integer>();  
		oddNumber.add(1);
		oddNumber.add(3);
		oddNumber.add(5);
		oddNumber.add(7);
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.addAll(evenNumber);
		numbersList.addAll(oddNumber);
		System.out.println(numbersList);
		// Traditional for loop
		for(int i = 0; i < numbersList.size(); i++ ){
			System.out.println(numbersList.get(i));
		}
		// For-each loop
		System.out.println("---------------For-Each-------------");
		
		for(Integer ele: numbersList){
			System.out.println(ele);
		}
		// For -each with streams
		System.out.println("---------------- Streams ---------------");
		numbersList.stream().forEach(System.out::println);
		
		//Iterator 
		System.out.println("---------------- Processing element using iterator--------------");
		Iterator<Integer> iterator = numbersList.iterator();
		while(iterator.hasNext()){
			Integer ele = iterator.next();
			if(ele==2){
				iterator.remove();
			}
		}
		System.out.println(numbersList);
		
		// List iterator
		ListIterator<Integer> listIterator = numbersList.listIterator();
		while(listIterator.hasNext()){
			Integer ele = listIterator.next();
			System.out.print(ele+" ");
			if(ele==8){
				listIterator.add(88);
			}
		}
		System.out.println("\n");
		while(listIterator.hasPrevious()){
			Integer ele = listIterator.previous();
			System.out.print(ele+" ");
		}
		System.out.println("\n");
		
		System.out.println(numbersList);
	}
}
