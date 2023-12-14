package programmers.level.one;

class Solution15 {
    public int solution(int num) {
        int answer = 0;
        
        long numl=num;
        if(numl==1){
            return answer;
        }
        
        while(numl!=1){
            answer++;
            if(numl%2==0){
                numl=numl/2;
            }else{
                numl=numl*3+1;
            }
            
            if(answer>=500){
                return -1;
            }
        }
        
        return answer;
    }
}
//콜라츠 추측