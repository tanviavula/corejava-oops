package com.nubes.cj.collections.task;

public class Product {
		
		private Integer pid;
		private String pname;
		private float price;
		
		
		public Product(String pname, float price) {
			if(this.pid == null ){
				this.pid = IdGenerator.getNewId();
			}
			this.pname = pname;
			this.price = price;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		
		
}
