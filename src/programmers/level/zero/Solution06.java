package programmers.level.zero;

public class Solution06 {
	 public int[] solution(int[] arr) {  
	        int n=arr.length;
	        int idx=0;
	        
	        while(n>Math.pow(2,idx)){
	             idx++;
	        }
	        
	        int[] answer=new int[(int)Math.pow(2,idx)];
	        
	        for(int i=0; i<n; i++){
	           answer[i]=arr[i];
	        }
	   
	        return answer;
	    }
}
//배열의 길이를 2의 거듭제곱으로 만들기