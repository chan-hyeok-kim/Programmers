package programmers.level.one;

import java.util.*;
import java.util.Map.Entry;

class Solution34 {
	public String[] solution(String[] strings, int n) {
        int s=strings.length;
		String[] answer = new String[s];
        
        //로직
        //문자 일부의 순서대로 정렬
        
		Map<String, String> map=new HashMap<>();
		
		
        for(int i=0; i<s; i++) {
        	map.put(strings[i], strings[i].substring(n,n+1));
        }
        
        List<Map.Entry<String, String>> entryList=new ArrayList<>(map.entrySet());
        
       
        Collections.sort(entryList,new Comparator<Map.Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				if(o1.getValue().equals(o2.getValue())){
                    return o1.getKey().compareTo(o2.getKey());
                }
				return o1.getValue().compareTo(o2.getValue());
			}
		});
        
        
        int idx=0;
        for(Map.Entry<String, String> entry: entryList) {
        	answer[idx]=(String) entry.getKey();
            idx++;
        }
        
        return answer;
    }
	
}
//문자열 내 마음대로 정렬하기