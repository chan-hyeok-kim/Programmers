package programmers.level.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution55 {
public int solution(int n, int[] lost, int[] reserve) {
        
        List<Integer> r=Arrays.stream(reserve)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());
	    
        List<Integer> l=Arrays.stream(lost)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());
        
	    ArrayList<Integer> list=new ArrayList<Integer>(r);
        ArrayList<Integer> lostList=new ArrayList<Integer>(l);
        
        for(int i=0; i<lostList.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(lostList.get(i)==list.get(j)){
                   list.remove(j);
                   lostList.remove(lostList.get(i));
                   i--;
                   break;
                }
            }
        }
       
        int answer = n-lostList.size();
        
        for(int i=0; i<lostList.size(); i++){
	            for(int j=0; j<list.size(); j++){
	                if(lostList.get(i)-1==list.get(j) || 
	                   (lostList.get(i)+1<=n && lostList.get(i)+1==list.get(j))){
	                   list.remove(j);
	                   answer++; 
	                   break;
	                }
	            }
	        }
        
        
        
        
        return answer;
    }
	
}
//체육복-탐욕법