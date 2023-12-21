package programmers.level.one;

import java.util.Arrays;

class Solution28 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);  
        for(int i=0; i<d.length; i++){
            if(budget-d[i]<0){
                return answer;
            }
            budget-=d[i];
            answer++;
        }
        
        return answer;
    }
}