package programmers.level.one;

class Solution38 {
	 public int solution(int a, int b, int n) {
	        int answer = 0;
	        
	        int rest=0;
	        while(n>=a){
	            answer+=(n/a)*b;
	            n=n%a+(n/a)*b;
	        }
	        
	        return answer;
	    }
}
//콜라 문제