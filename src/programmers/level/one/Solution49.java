package programmers.level.one;

import java.util.*;

class Solution49 {
	 public int[] solution(int N, int[] stages) {
		    
	        int[] answer = new int[N];
	       
	        int usersNum=stages.length;
	       
	        Map<Integer, Double> map=new HashMap<Integer, Double>();
	        
	        for(int i=1; i<N+1; i++) {
	        	int failCount=0;
	        	double failureRate=0;
		        for(int j=0; j<stages.length; j++) {
		        		if(stages[j]==i) {
		        			failCount++;
		        		}
		        }   
		        
		        if(failCount==0) {
		        	failureRate=0;
		        }else{
		        	failureRate=(double)failCount/(usersNum);	
		        }
		        map.put(i,failureRate);
		        System.out.println("실패율==");
     		System.out.println(failureRate);
     		System.out.println(failCount);
     		System.out.println("==실패율");
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