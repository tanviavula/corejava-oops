package com.nubes.cj.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordCountUsingMap {
	
	public static void main(String[] args) {
		
		String names = "Tanvi,Dhatri,Dhanvi,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Balu,Krish,Manoj,Balu,Rajesh,Suresh,Mahesh,Jayesh,Rupesh,Kamesh";
	 	List<String> list = Arrays.asList(names.split(","));
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for(String name:list){
				if(countMap.get(name) == null){
					countMap.put(name, 1);
				}else{
					Integer value = countMap.get(name);
					countMap.put(name, value + 1);
				}
		}
		for(Map.Entry<String, Integer> entry:countMap.entrySet()){
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	    
	    
	
	}
}
