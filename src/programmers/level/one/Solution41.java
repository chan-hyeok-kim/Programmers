package programmers.level.one;

import java.util.*;

class Solution41 {
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> day=new ArrayList<Integer>();
        
        if(k>score.length){
            for(int i=0; i<score.length; i++){
                day.add(score[i]);
                Collections.sort(day);
                answer[i]=day.get(0);
            }
            return answer;  
        }
        for(int i=0; i<k; i++){
            day.add(score[i]);
            Collections.sort(day);
            answer[i]=day.get(0);
        }
        
        int count=0;
        for(int i=k; i<score.length; i++){
            if(score[i]>day.get(count)){
                day.add(score[i]);        
                count++;
                Collections.sort(day);
            }
            answer[i]=day.get(count);
        }
        
    
        return answer;
    }
	
}
//명예의 전당(1)