package com.nubes.cj.scart;

public final class IDGenerator {
	
	
	private static int id = 1000;
	
	private IDGenerator(){
	}
	
	public static int getNewId(){
		return id++;
	}
}
