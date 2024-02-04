package programmers.level.zero;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Solution22 {
	public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        TreeMap<Integer, Integer> map=new TreeMap();
         
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
               map.put(rank[i],i); 
            }
        }
        
        Entry<Integer, Integer> one=map.firstEntry();
        int oneKey=one.getKey();
        Entry<Integer, Integer> two=map.higherEntry(oneKey);
        int twoKey=two.getKey();
        Entry<Integer, Integer> thr=map.higherEntry(twoKey);
        
        answer=10000*one.getValue()+100*two.getValue()+thr.getValue();
        
        return answer;
    }
}
//