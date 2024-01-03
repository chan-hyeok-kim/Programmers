package programmers.level.one;

import java.util.*;

class Solution51 {
	public int solution(String[] babbling) {
        int answer = 0;
        
        List<String> list=List.of("aya","ye","woo","ma");
	        		
       
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
            	 StringBuilder twice=new StringBuilder("");
                if(i!=j){
                    twice.append(list.get(i)).append(list.get(j));
                    list.add(twice.toString());
                }
                for(int k=0; k<list.size(); k++){
                    String third="";
                    if(i!=j && j!=k){
                       third=twice+list.get(k);
                       list.add(third);
                    }
                    for(int l=0; l<list.size(); l++){
                       String fourth="";
                       if(i!=j && j!=k && k!=l){
                       fourth=third+list.get(l);
                       list.add(fourth);
                       }
                    }
                }
            }
        }

        for(String l:list){
            for(String b:babbling){
                if(b.equals(l)){
                    answer++;
                }
            }
        }
        //2개조합 12개
        
        
       
        
        
        return answer;
    }
	
}