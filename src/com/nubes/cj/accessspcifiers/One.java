package com.nubes.cj.accessspcifiers;

public class One {
	
	public int pub_num = 100;
	private int pri_num = 200;
	protected int pro_num = 300;
	int def_num = 400;
	
	public void show(){
		System.out.println(pub_num);
		System.out.println(pri_num);
		System.out.println(pro_num);
		System.out.println(def_num);
	}
}

class Two{
	public void show(){
		One obj = new One();
		System.out.println(obj.pub_num);
		//System.out.println(obj.pri_num);
		System.out.println(obj.pro_num);
		System.out.println(obj.def_num);
	}
}

class Three extends One{
	public void show(){
		System.out.println(pub_num);
		//System.out.println(pri_num);
		System.out.println(pro_num);
		System.out.println(def_num);
	}
}
