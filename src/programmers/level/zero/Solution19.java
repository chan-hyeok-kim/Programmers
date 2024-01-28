package programmers.level.zero;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution19 {
	public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set=new LinkedHashSet<>();
        
        for(int i=0; i<arr.length; i++){
            if(set.size()==k){
              break;
            }
            set.add(arr[i]);
        }
        int idx=0;
        for(int s: set){
            answer[idx]=s;
            idx++;
        }
    
        if(k>set.size()){
          for(int i=idx; i<k; i++){
               answer[i]=-1;  
          }
        }
        
        return answer;
    }
}
//무작위로 K개의 수 뽑기