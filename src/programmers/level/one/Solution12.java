package programmers.level.one;

import java.util.*;

public class Solution12  {
    public int[] solution(int []arr) {
       
        
        List<Integer> answerList=new ArrayList<Integer>();
        answerList.add(arr[0]);
        
       for (int i = 0; i < arr.length - 1; i++) {
          if(arr[i]==arr[i+1]){
              continue;
          }else{
              answerList.add(arr[i+1]);
          } 
       }

        int[] answer = new int[answerList.size()];
        
        for(int i=0; i<answerList.size(); i++) {
        	answer[i]=answerList.get(i);
        }
        
        return answer;
    }

    
}