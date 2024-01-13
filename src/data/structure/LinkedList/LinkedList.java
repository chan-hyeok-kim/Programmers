package data.structure.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
      
	private ListNode head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public void insert(ListNode preNode, String data) {
		ListNode newNode=new ListNode(data);
		newNode.link=preNode.link;
		preNode.link=newNode;
	}
	
	public void insert(String data) {
		
	}
	
	public String[] delete(String data) {
		//중간에 삭제하면
		//삭제할 노드를 가져와야 되지않나
		//아니지
		//이전 노드로 다음링크가져온후에
		//pre 링크정보를 remove링크로 바꾸고
		//그럼 데이터가필요없지않나
		ListNode preNode=head;
		ListNode nextNode=head.link;
		
		List<String> str=new ArrayList<>();
		
		return str.toArray(new String[str.size()]);
	}
	
	public void delete() {
		
	}
	
	
	
	
}
