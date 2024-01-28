package programmers.level.zero;

public class Solution18 {
	 public String solution(String my_string, int[][] queries) {
	       
         for(int i=0; i<queries.length; i++){
            String str=my_string.substring(queries[i][0],queries[i][1]+1);
            StringBuilder reverse=new StringBuilder(str).reverse();
            
            String answer=my_string.substring(0,queries[i][0]);
            answer+=String.valueOf(reverse);
            answer+=my_string.substring(queries[i][1]+1);
            my_string=answer; 
         }
    
         return my_string;
	    }
}
// 문자열 여러번 뒤집기