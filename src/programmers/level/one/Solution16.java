package programmers.level.one;

class Solution16 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
      
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==true){
               answer+=absolutes[i];
            }else{
              answer-=absolutes[i];
            }
            
        }
        
        return answer;
    }
}
//음양 더하기