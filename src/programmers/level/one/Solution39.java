package programmers.level.one;

import java.util.HashMap;
import java.util.Map;

class Solution39 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String,Object> map=new HashMap<String, Object>();
        for(int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
       
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
            	for(Map.Entry<String, Object> element: map.entrySet()) {
            		if(photo[i][j].equals(element.getKey())){
                        answer[i]+=((Integer) element.getValue());
                        break;
                     }
            	}
            }
        }
        
        
        return answer;
    }
	
}