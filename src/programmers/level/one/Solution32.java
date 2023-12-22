package programmers.level.one;

import java.util.*;

class Solution32 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
      
        for(int i=0; i<commands.length; i++){
            String str="";
            for(int j=0; j<array.length; j++){
                str+=array[j]+" ";
            }  
            String[] strArr=str.split(" ");
            
            List<Integer> strList=new ArrayList<>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                strList.add(Integer.parseInt(strArr[j]));
            }
            strList.sort(Comparator.naturalOrder());
            answer[i]=strList.get(commands[i][2]-1);
        }       
        return answer;
    }
	
}
//k번째 수