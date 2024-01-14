package programmers.level.zero;

public class Solution13 {
	  public int[] solution(String my_string) {
	        int[] answer = new int[52];
	        
	        for(int i=0; i<my_string.length(); i++){
	            if(96<my_string.charAt(i)){
	              answer[(int)my_string.charAt(i)-71]++;
	            }else{
	              answer[(int)my_string.charAt(i)-65]++;
	            } 
	        }
	        
	        
	        return answer;
	    }
}
// 문자 개수 세기