package programmers.level.one;

class Solution47 {
	public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int count = 0;
            
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0 && j!=Math.sqrt(i)){
                     count+=2;
                 }else if(j==Math.sqrt(i)){
                     count++;
                }
                
                if(count>limit){
                   count=power;
                   break;
                }
           
            }
            System.out.println(count);
            answer+=count;
        }
        
        return answer;
    }
	
}
//기사단원의 무기