package programmers.level.one;

class Solution24 {
	 public int[] solution(int num, int total) {
	        int[] answer = new int[num];
	       
	        int min=total/num-(num-1)/2;
	        for(int i=0; i<num; i++){
	            answer[i]=min;
	            min++;
	        }
	        
	        
	        
	        return answer;
	    }
}
//연속된 수의 합