package com.nubes.cj.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
		public static void main(String[] args) {
			
			Map<Integer,String> courseMap= new HashMap<>();
			
			courseMap.put(1001, "Java");
			courseMap.put(1002, "SalesForce");
			courseMap.put(1003, "Python");
			courseMap.put(1004, "MachineLearning");
			
			System.out.println("---------------- Keys -----------------------");
			Set<Integer> keys = courseMap.keySet();
			
			for(Integer key:keys){
				String value = courseMap.get(key);
				System.out.println(key +" == "+value);
			}
			
			Collection<String> values = courseMap.values();
			System.out.println("---------------- Values -----------------------");
			for(String value: values){
				System.out.println(value);
			}
			System.out.println("--------------- Key and Value pair -------------------");
			
			Set<Entry<Integer, String>> entrySet = courseMap.entrySet();
			for(Entry<Integer, String> ele: entrySet){
				System.out.println(ele.getKey()+" "+ele.getValue());
			}
			System.out.println("Size of the map:"+courseMap.size());
			String removedCourse = courseMap.remove(1001);
			System.out.println("Removed :"+removedCourse);
			System.out.println("Size of the map:"+courseMap.size());
			
			System.out.println("------------------- Update map elements---------------");
			System.out.println(courseMap);
			if(courseMap.get(1004) != null){
				courseMap.put(1004,"Python - MachineLearning");
			}
			
			System.out.println(courseMap);
		}
}
