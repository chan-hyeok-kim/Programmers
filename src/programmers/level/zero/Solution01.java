package programmers.level.zero;

public class Solution01 {
	 public String solution(String myString, String pat) {
	        String answer = "";
	        answer = myString.substring(0,myString.lastIndexOf(pat)+pat.length()); 
	        
	        return answer;
	 }
}
//특정 문자열로 끝나는 가장 긴 부분 문자열 찾기