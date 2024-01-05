package programmers.level.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution54 {
	public String solution(String X, String Y) {
        String answer = "";
        
        List<String> list=new LinkedList();
        
        String[] x=X.split("");
        String[] y=Y.split("");
        
        LinkedList<String> listX=new LinkedList(Arrays.asList(x));
        LinkedList<String> listY=new LinkedList(Arrays.asList(y));
              
        for(int i=0; i<X.length(); i++){
            for(int j=0; j<listY.size(); j++){
                if(listX.get(i).equals(listY.get(j))){
                   list.add(listY.get(j)); 
                   listY.remove(j);
                   break; 
                }
            }
        }
        
        list.sort(Comparator.reverseOrder());
        if(list.size()==0){
           answer="-1";
        }else if(list.get(0).equals("0")){
           answer="0";
        }else{
            for(String num:list){
                answer+=num;
            }
        }
        return answer;
    }
}