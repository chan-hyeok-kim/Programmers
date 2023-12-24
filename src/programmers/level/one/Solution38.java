package programmers.level.one;

class Solution38 {
	 public int solution(int a, int b, int n) {
	        int answer = 0;
	        
	        for(n/=a; n>1; n/=a){
	            answer+=n; 
	            if(n%a!=0){
	                n+=n%a;
	            } 
	        }
	            
	       
	        return answer;
	    }
	
}