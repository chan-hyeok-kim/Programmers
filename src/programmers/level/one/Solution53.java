package programmers.level.one;

import java.util.HashSet;
import java.util.Set;

class Solution53 {
	 public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        
	        Set<Integer> set=new HashSet();
	        
	        for(int w: win_nums) {
	            set.add(w);
	        }
	        
	        int equalNum=0;
	        int zeroNum=0;		
	        
	        for(int lotto: lottos) {
	        	if(set.contains(lotto)) {
	        	   equalNum++;
	        	   set.remove(lotto);
	        	}else if(lotto==0) {
	        		zeroNum++;
	        	}
	        }
	        // 최소값 equalNum
	        //최대값 equalNum+zeroNum
	        
	        // 순위
	        // 7-(equalNum+zeroNum)
	        // 7-equalNum
	        answer[0]=7-(equalNum+zeroNum); 
	        answer[1]=7-equalNum;
	        
	        return answer;
	    }
	
}