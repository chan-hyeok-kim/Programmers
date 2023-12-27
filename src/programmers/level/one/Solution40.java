package programmers.level.one;

class Solution40 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer1 = "";
        String answer2 = "";
        
        int count1=0;
        int count2=0;
        for(int i=0; i<goal.length; i++){
            answer2+=goal[i];
            if(count1<cards1.length && goal[i].equals(cards1[count1])){
                answer1+=goal[i];
                count1++;
            }else if(count2<cards2.length && goal[i].equals(cards2[count2])){
                answer1+=goal[i];
                count2++;
            }  
        }
       
        if(answer1.equals(answer2)){
            answer1="Yes";
        }else{
            answer1="No";
        }
        
        
            
        return answer1;
    }
	
}
//카드 뭉치