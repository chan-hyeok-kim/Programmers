package programmers.level.one;


public class Solution03 {
	public String solution(String s, int n) {
        String answer = "";
        

        for(int i=0; i<s.length(); i++) {
        	int a=s.codePointAt(i)+n;

            if(a-122>0) {
                    a=a-26;
            }else if(s.charAt(i)==' '){
                a=a-n;
            }else if(64<s.codePointAt(i) && s.codePointAt(i)<91){
                if(a-90>0){
                    a=a-26;
                }
            }
        
        	answer+=(char)a;
        }
        
        
        return answer;
    }	
	 
}

//시저 암호 문제