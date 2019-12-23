package com.nubes.cj.collections.task;

public final class IdGenerator {

		private static Integer id = 1001;
		private IdGenerator(){
			
		}
		public static Integer getNewId(){
			return id++;
		}
}
