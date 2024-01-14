package programmers.level.zero;

import java.util.List;
import java.util.ArrayList;

public class Solution14 {
	public int[] solution(int[] arr) {
        int i=0;
        List<Integer> stk=new ArrayList();
        
        while(i<arr.length){
            if(stk.size()==0){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size()-1)<arr[i]){
                    stk.add(arr[i]);
                    i++;
                }else{
                    stk.remove(stk.size()-1);
                }
            }   
           
        }
        
        
        return stk.stream()
               .mapToInt(n->n)
               .toArray();
    }
}
//