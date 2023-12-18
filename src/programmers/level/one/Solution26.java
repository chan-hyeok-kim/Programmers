package programmers.level.one;

class Solution26 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int divisor=0;
        int multiple=0;
        
        if(n<m){
            divisor=n;
            multiple=m;
        }else{
            divisor=m;
            multiple=n;
        }
        
        for(int i=divisor; i>=1; i--){
            if(n%i==0 && m%i==0){
               answer[0]=i;
               break;
            }
        }
        
        if(n%m==0){
            answer[1]=n; 
        }else if(m%n==0){
            answer[1]=m; 
        }else {
	        for(int i=multiple; i<=n*m; i++) {
	        	if(i%n==0 && i%m==0) {
	        	   answer[1]=i;
	        	   break;
	        	}
	        }
        }
        
        return answer;
    }
}
//최대공약수와 최소공배수
// 유클리드 호제법 사용해서 다시 풀어볼 예정
