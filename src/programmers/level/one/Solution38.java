package programmers.level.one;

class Solution38 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        
        int rest=0;
        for(; n>0;){
        	n=n/a*b;
//        	System.out.println(rest);
//        	System.out.println(n);
        	rest+=n%a;
            answer+=n;
            
            if(n<a){
            	n+=rest;
            	rest=0;
            	if(n<a) {
            		break;
            	}
            }
        }
        
        return answer;
    }
}