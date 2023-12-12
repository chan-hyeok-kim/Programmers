package programmers.level.one;

public class Solution11 {
	public int solution(int[] sides) {
        int answer = 0;
        
        int min=0;
        int n=0;
        int m=0;
        
	        if(sides[0]>sides[1]){
	           m=1;
	        }else{
	           n=1;
	        }
        
        min=(sides[n]+1)-sides[m];
        
	        for(; min<sides[n]; min++){
	        answer++;
	        }
	        for(; min<sides[m]+sides[n]; min++){
	            answer++;
	        }
            
        
        return answer;
    }
}
//Math.max, Math.min쓰면 더 편함