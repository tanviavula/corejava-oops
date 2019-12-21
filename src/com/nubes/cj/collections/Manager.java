package com.nubes.cj.collections;


class IssueManager{
	
	private Integer[] issueIds;
	private int count = 0;
	private int gsize = 4;
	private int initialSize = 3;
	
	public IssueManager() {
		issueIds = new Integer[initialSize];
	}
	
	public Integer addIssueId(Integer newId){
		if(!(count < issueIds.length)){
			Integer[] temp = new Integer[issueIds.length + gsize];
			System.arraycopy(issueIds, 0, temp, 0, issueIds.length);
			issueIds = temp;
		}
		issueIds[count++] = newId;
		return newId;
	}
	public boolean removeIssueId(Integer id){
		int pos = getIndexOf(id);
		System.out.println(pos);
		if(pos!=-1){
			if(pos == 0 ){
				Integer[] temp= new Integer[issueIds.length - 1];
				System.arraycopy(issueIds, pos + 1, temp, 0, issueIds.length-1);
				issueIds = temp;
				count--;
			}else {
				Integer[] temp= new Integer[issueIds.length - 1];
				System.arraycopy(issueIds, 0, temp, 0, pos -1);
				System.arraycopy(issueIds,pos+1,temp,pos,issueIds.length-pos);
				issueIds = temp;
				count--;
			}
			return true;
		}
		return false;
	}
	public Integer[] getAllIssueIds(){
		Integer[] elements = new Integer[count];
		System.arraycopy(issueIds, 0, elements, 0, count);
		return elements;
	}
	
	public int getSize(){
		return count;
	}
	
	private int getIndexOf(Integer id){
		int pos = -1;
		for(int i = 0;i<count;i++){
			if(issueIds[i].equals(id)){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
}


public class Manager {

		public static void main(String[] args) {
			IssueManager obj = new IssueManager();
			
			obj.addIssueId(1001);
			obj.addIssueId(1002);
			obj.addIssueId(1003);
			obj.addIssueId(1004);
			obj.addIssueId(1005);
			
			System.out.println(obj.getSize());
			obj.removeIssueId(1001);
			System.out.println(obj.getSize());
			
			Integer[] ids = obj.getAllIssueIds();
			for(Integer id:ids){
				System.out.println(id);
			}
			
		
		
		}
		
}
