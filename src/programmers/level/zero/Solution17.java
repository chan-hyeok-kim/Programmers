package programmers.level.zero;

import java.util.Stack;

public class Solution17 {
	 public int[] solution(int[] arr) {
	        int[] answer = new int[0];
	        
	        Stack<Integer> stk=new Stack();
	        
	        for(int i=0; i<arr.length; i++){
	        	if(!stk.isEmpty() && stk.peek()==arr[i]) {
	        		stk.pop();
	        	}else {
	        		stk.push(arr[i]);
	        	}
	        	
	        }
	        
	        if(stk.size()==0) {
	        	return new int[]{-1};
	        }else {
             answer=new int[stk.size()];
	        	for(int i=stk.size()-1; i>=0; i--) {
	        		answer[i]=stk.pop();
	        	}
	        }
	        
	        return answer;
	 }
}
//배열 만들기 6