package programmers.level.zero;

public class Solution02 {
	 public String solution(String my_string, int s, int e) {
	        String answer = "";
	        
	        String str1=my_string.substring(s,e+1);
	        
	        StringBuffer sb=new StringBuffer(str1);
	        String str2=sb.reverse().toString();
	        
	        answer=my_string.replace(str1,str2);
	        
           
	        
	        return answer;
	    }
}
//문자열 뒤집기