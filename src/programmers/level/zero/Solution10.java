package programmers.level.zero;

public class Solution10 {
	 public int solution(String[] order) {
	        int answer = 0;
	        
	        for(String o:order){
	            if(o.contains("latte")){
	               answer+=5000; 
	            }else{
	               answer+=4500; 
	            }
	        }
	        
	        return answer;
	    }
}
//커피 심부름