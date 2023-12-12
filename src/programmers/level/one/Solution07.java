package programmers.level.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution07 {
	 public int[] solution(int N, int[] stages) {
		    
	        int[] answer = new int[N];
	       
	        int usersNum=stages.length;
	       
	        Map<Integer, Double> map=new HashMap<Integer, Double>();
	        
	        for(int j=1; j<N+1; j++) {
	        	int failCount=0;
	        	double failureRate=0;
		        for(int i=0; i<stages.length; i++) {
		        		if(stages[i]==j) {
		        			failCount++;
		        		}
		        }   
		        failureRate=(double)failCount/(usersNum);	
        		map.put(j,failureRate);
        		usersNum-=failCount;
	        }
	        
	        List<Integer> keySet=new ArrayList<Integer>(map.keySet());
	        
	        keySet.sort(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return Double.compare(map.get(o2), map.get(o1));
	            }
	        });

	        for (int i = 0; i < keySet.size(); i++) {
	            answer[i] = keySet.get(i);
	        }
	        
	        return answer;
	    }
}
//실패율