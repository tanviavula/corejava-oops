package com.nubes.cj.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		String football = "Tanvi,Dhatri,Dhanvi,Lakshman,Krish,Manoj,Lakshman,Krish,Manoj,Lakshman,Krish,ManojLakshman,Krish,Manoj,Lakshman,Krish,ManojLakshman,Krish,ManojLakshman,Krish,Manoj,Balu,Krish,Manoj,Balu,Rajesh,Suresh,Mahesh,Jayesh,Rupesh,Kamesh";
	 	String cricket = "Tanvi,Dhatri,Balu";
		 String badminton = "Laxman,Sasi,Charan,Lakshman,Krish,Manoj,Balu,Krish,Tanvi";
		
		//Approach -1
		Set<String> footballSet = new HashSet<>(Arrays.asList(football.split(",")));
		Set<String> cricketSet= new HashSet<>(Arrays.asList(cricket.split(",")));
		Set<String> badmintionSet = new HashSet<>(Arrays.asList(badminton.split(",")));
	
		Set<String> nameSet = new HashSet<>();
		nameSet.addAll(footballSet);
		nameSet.addAll(cricketSet);
		nameSet.addAll((badmintionSet));
		
		Set<String> commonSet = new HashSet<>();
		for(String name:nameSet){
			if(footballSet.contains(name) && cricketSet.contains(name) && badmintionSet.contains(name)){
				commonSet.add(name);
			}
		}
		System.out.println(commonSet);
		
		//Approach -2
		int csize = cricketSet.size();
		int fsize = footballSet.size();
		int bsize = badmintionSet.size();
		Set<String> playersSet = new HashSet<>();
	    if(csize < fsize && csize < bsize){
			for(String name:cricketSet){
				if(footballSet.contains(name)&& badmintionSet.contains(name)){
					playersSet.add(name);
				}
			}
		}else if(fsize < bsize){
			for(String name:footballSet){
				if(cricketSet.contains(name)&& badmintionSet.contains(name)){
					playersSet.add(name);
				}
			}
		}else{
			for(String name:badmintionSet){
				if(footballSet.contains(name)&& cricketSet.contains(name)){
					playersSet.add(name);
				}
			}
		}
		System.out.println(playersSet);
	}
}
