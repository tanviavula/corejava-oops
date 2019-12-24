package com.nubes.cj.collections.set;

import java.util.HashSet;
import java.util.Set;

public class MemberManager {

		public static void main(String[] args) {
			
			Member p1 = new Member(1001, "Krish", 36);
			Member p2 = new Member(1002, "Lakshman", 37);
			Member p3 = new Member(1003, "Aruna", 34);
			Member p4 = new Member(1004, "Sai", 30);
			Member p5 = new Member(1001, "Krish", 36);
			
			Set<Member> memberSet = new HashSet<>();
			memberSet.add(p1);
			memberSet.add(p2);
			memberSet.add(p3);
			memberSet.add(p4);
			memberSet.add(p5);
			
			for(Member obj:memberSet){
				
				System.out.println(obj);
			}
			
		}
}
