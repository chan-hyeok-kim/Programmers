package programmers.level.zero;

public class Solution16 {
	public String[] solution(String[] str_list) {
        String[] answer=new String[0];
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
               answer=new String[i]; 
                
               for(int j=0; j<i; j++){
                   answer[j]=str_list[j];
               } 
               break;
            }else if(str_list[i].equals("r")){
               answer=new String[str_list.length-i-1]; 
                
               for(int j=i; j<str_list.length; j++){
                   answer[j]=str_list[j];
               } 
                
               break;
            }
        }
        
        return answer;
    }
}
//왼쪽 오른쪽