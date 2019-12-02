package com.nubes.cj.course;

public class Course {

		private String name;
		private float price;
		private int duration;

		public Course(String name, float price, int duration) {
			this.name = name;
			this.price = price;
			this.duration = duration;
		}
		
		
		public void showInfo(){
			String delimeter = "--";
			StringBuilder sb = new StringBuilder(name).append(delimeter);
			sb.append(price).append(delimeter).append(duration);
			System.out.println(sb.toString());
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public float getPrice() {
			return price;
		}


		public void setPrice(float price) {
			
			this.price = price;
		}


		public int getDuration() {
			return duration;
		}


		public void setDuration(int duration) {
			this.duration = duration;
		}

		
}
