package programmers.level.zero;

import java.util.Arrays;

public class Solution11 {
	public int solution(int[] arr) {
        int answer = -1;
        
        while(true){
            int[] pre=Arrays.copyOf(arr,arr.length);
            for(int i=0; i<arr.length; i++){
               if(50<=arr[i] && arr[i]%2==0){
                   arr[i]/=2;
               }else if(50>arr[i] && arr[i]%2!=0){
                   arr[i]=arr[i]*2+1;
               }    
            }
            
            answer++;
            if(Arrays.equals(pre,arr)){
               break;  
            }
        }
        
        
        return answer;
    }
}
//조건에 맞게 수열 변환하기 2