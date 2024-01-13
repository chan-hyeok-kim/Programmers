package programmers.level.zero;

public class Solution04 {
	 public int solution(String myString, String pat) {
	        int answer = 0;
	    
	        for(int i=0; i<=myString.length()-pat.length(); i++){
	            if(myString.charAt(i)==pat.charAt(0) &&
	              myString.substring(i,i+pat.length()).equals(pat)){
	              answer++; 
	            }
	        }
	        
	        return answer;
	    }
}
// 문자열이 몇번등장하는지 세기
