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
                        System.out.println(b);
                        
                        System.out.println(list.get(i));
                        System.out.println(answer);
		            	  break;
		            }
	                b=b.substring(list.get(i).length());
		               
	                b=slice(list, b, i, answer);
	                
	            }
	        }
        }
        
        
        return answer;
 }
 
 public String slice(List<String> list,String babble,int idx,int answer) {
	                                             //이전 인덱스
	   for(int i=0; i<4; i++){
             if(i!=idx && babble.startsWith(list.get(i))) {
                
               if(babble.length()==list.get(i).length()) {
            	   answer++;
                   return babble;
               }
               babble=babble.substring(list.get(i).length());
                 
               slice(list, babble, i, answer);
               
             }else {
            	  continue;
             }
     }
     return babble;
	 
 }
}