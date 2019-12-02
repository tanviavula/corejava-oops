package com.nubes.cj.accessspcifiers.other;

import com.nubes.cj.accessspcifiers.One;

public class Four {

	public void show() {
		One obj = new One();
		System.out.println(obj.pub_num);
		// System.out.println(obj.pri_num);
		// System.out.println(obj.pro_num);
		// System.out.println(obj.def_num);
	}
}

class Five extends One {
	public void show() {
		System.out.println(pub_num);
		// System.out.println(pri_num);
		System.out.println(pro_num);
		// System.out.println(def_num);
	}
}
