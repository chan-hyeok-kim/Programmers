package programmers.level.zero;

public class Solution07 {
	 public String[] solution(String myStr) {
	        int idx=0;
	        myStr=myStr.replaceAll("[abc]"," ");
	        myStr=myStr.replaceAll("\\s+"," ").trim();
	        
	        if(myStr.equals("")){
	           return new String[]{"EMPTY"}; 
	        }
	       
	        String[] str=myStr.split(" ");
	        
	        return str;
	    }
}
// 세 개의 구분자