package programmers.level.one;

class Solution35 {
	public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer+=String.valueOf(i);
            }
        }
        StringBuilder sb=new StringBuilder(answer);
        
        answer+="0";
        answer+=sb.reverse();
        
        return answer;
    }
}
//푸드 파이트 대회