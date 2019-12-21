package com.nubes.cj.collections;

import java.util.ArrayList;
import java.util.List;

class IssueContainer{
	
	private List<Integer> list;
	public IssueContainer() {
		list = new ArrayList<>();
	}
	
	public Integer addIssueId(Integer id){
		list.add(id);
		return id;
	}
	public boolean removeIssue(Integer id){
		return list.remove(id);
		
	}
	public List<Integer> getAllIssueIds(){
		return list;
	}
	public int getSize(){
		return list.size();
	}
}
public class IssueClient {
	public static void main(String[] args) {
		IssueContainer obj = new IssueContainer();
		
		obj.addIssueId(1001);
		obj.addIssueId(1002);
		obj.addIssueId(1003);
		obj.addIssueId(1004);
		obj.addIssueId(1005);
		
		System.out.println(obj.getSize());
		obj.removeIssue(1001);
		System.out.println(obj.getSize());
		
		List<Integer> ids = obj.getAllIssueIds();
		for(Integer id:ids){
			System.out.println(id);
		}
		
	}
}
