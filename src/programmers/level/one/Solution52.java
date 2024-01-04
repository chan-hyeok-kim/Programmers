package programmers.level.one;

import java.util.List;

class Solution52 {
	 public int solution(String[] babbling) {
	        int answer = 0;
	        
	        String[] start= {};
	        List<String> list=List.of("aya","ye","woo","ma");
		     
	        for(String b: babbling) {
		        for(int i=0; i<4; i++){
		            if(b.startsWith(list.get(i))) {
		            	if(b.length()==list.get(i).length()) {
			            	  answer++;
			            	  break;
			            }
		                b=b.substring(list.get(i).length());
			               
		                slice(list, b, i, answer);
		                
		            }
		        }
	        }
	        
	        
	        return answer;
	 }
	 
	 public void slice(List<String> list,String babble,int idx,int answer) {
		                                             //이전 인덱스
		   for(int i=0; i<4; i++){
	             if(i!=idx && babble.startsWith(list.get(i))) {
                   if(babble.length()==list.get(i).length()) {
                	   answer++;
                  	   break;
                   }
                   babble=babble.substring(list.get(i).length());
                   slice(list, babble, idx, answer);;
	             }else {
	            	  break;
	             }
         }
		 
	 }
}