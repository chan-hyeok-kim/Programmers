package java.level.one;


class Solution1 {
	public String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0){
            answer=""+s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
        }else{
            answer=""+s.charAt(s.length()/2);
        }
        
        return answer;
    }
   
}

//가운데 글자 가져오기