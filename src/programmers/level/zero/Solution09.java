package programmers.level.zero;
import java.util.Arrays;


public class Solution09 {
	  public int[] solution(int n, int[] slicer, int[] num_list) {
	        int[] answer;
	        
	        if(n==1){
	            answer=Arrays.copyOfRange(num_list,0,slicer[1]+1);
	        }else if(n==2){
	            answer=Arrays.copyOfRange(num_list,slicer[0],num_list.length);
	        }else if(n==3){
	            answer=Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
	        }else{
	            int len=(int)Math.round((slicer[1]-slicer[0]+1.0)/2);
	          
	            answer=new int[len];
	            int idx=0;
	            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
	                answer[idx]=num_list[i];
	                idx++;
	            }
	        }
	        
	        return answer;
	    }
}
//리스트 자르기