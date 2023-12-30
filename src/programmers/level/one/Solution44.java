package programmers.level.one;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] a1={1,2,3,4,5};
        int[] a2={2,1,2,3,2,4,2,5};
        int[] a3={3,3,1,1,2,2,4,4,5,5};
    
        Map<Integer,Integer> map=new HashMap();
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a1[i%5]){
               answer[0]++;
            }else if(answers[i]==a2[i%8]){
               answer[1]++; 
            }else if(answers[i]==a3[i%10]){
               answer[2]++; 
            }
        }
        
        for(int i=0; i<answer.length; i++) {
            map.put(answer[i],i+1);
        }
        Math.max(Math.max(map.get(1),map.get(2)),map.get(3));
        //이제 해야되는거
        //가장 큰값을 리턴한 거의 value를 가져와야함
     
        return answer;
    }
}