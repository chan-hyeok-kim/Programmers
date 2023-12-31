package programmers.level.one;

class Solution46 {
	public int solution(int n) {
        int answer = 0;
       
        boolean[] check=new boolean[n+1];
       	
        for(int j=2; j<=Math.sqrt(n); j++) {
            if(check[j]){
                continue;
            }

            for (int k = j * j; k <= n; k += j) {
            check[k] = true;
            }
        }
        
      
        for(int i=2; i<=n; i++) {
        	if(!check[i]) {
        		answer++;
        	}
        }
        
       
        return answer;
    }
}
//소수찾기