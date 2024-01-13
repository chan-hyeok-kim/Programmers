package programmers.level.zero;
import java.util.Stack;

public class Solution03 {
	 public int[] solution(int[] arr, boolean[] flag) {
	        
	        Stack<Integer> stack=new Stack();
	            
	        for(int i=0; i<flag.length; i++){
	            if(flag[i]){
	                for(int j=0; j<arr[i]*2; j++){
	                    stack.push(arr[i]);

	                }
	            }else{
	                 for(int j=0; j<arr[i]; j++){
	                    stack.pop();
	                }
	            }
	        }
	        
	        int[] xArr=new int[stack.size()];
	      
	        for (int i = xArr.length-1; i >= 0; i--) {
	            xArr[i]=stack.pop();
	        }
	            
	      
	            
	        return xArr;
	    }
	
	
}
//빈 배열에 추가, 삭제하기