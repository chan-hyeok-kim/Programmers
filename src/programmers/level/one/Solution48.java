package programmers.level.one;

class Solution48 {
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int j=0;
        for(int i=1; i<n+1;){
            	
            	if(i<section[j]) {
                	i++;
                }else if(i>section[j]) {
                	j++;
                }
            	
            	if(j>=section.length) {
                	break;
                }
            	
                if(i==section[j]){
                       answer++;
                       i+=m;
                       j++;
                }
                
                if(j>=section.length) {
                	break;
                }
        }
        return answer;
    }
}
//덧칠하기