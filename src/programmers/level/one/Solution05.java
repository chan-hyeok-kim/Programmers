package programmers.level.one;

public class Solution05 {
	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
       
        for(int i=0; i<strings.length; i++) {
        	answer[i]=""+strings[i].charAt(n);
        }
        
        for(int i=0; i<answer.length; i++) {
	          int compareInt=answer[i].compareTo(answer[i+1]);
	          if(compareInt<0) {
	        	  
	          }else if(compareInt==0) {
	        	  
	          }else {
	        	  
	          }
        }
        
        return answer;
    }
	

	
}
// 숫자 영어로 치환 문제
// 반복하는게 많아서 일단 보류
