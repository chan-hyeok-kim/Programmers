package programmers.level.zero;

public class Solution21 {
	public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i=0; i<picture.length; i++){
            String str="";
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                    str+=""+picture[i].charAt(j); 
                }
            }
            
            for(int j=0; j<k; j++){
                answer[i*k+j]=str;
            }
        }
        
        return answer;
    }
}
//자바 11부터 추가된 String의 repeat()메서드 활용하면 좋을 듯