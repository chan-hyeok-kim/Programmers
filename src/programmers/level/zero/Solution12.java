package programmers.level.zero;

public class Solution12 {
	public String solution(int q, int r, String code) {
        String answer = "";
        
        for(int i=0; i<code.length(); i++){
            int rest=i%q;
            if(rest==r){
                answer+=code.charAt(i);
            }
        }
        
        return answer;
    }
}
//qr code