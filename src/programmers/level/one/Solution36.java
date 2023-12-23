package programmers.level.one;

import java.util.*;
import java.util.stream.Collectors;

class Solution36 {
	 public int[] solution(int[] numbers) {
	        
	        int n=numbers.length;
	        
	        List<Integer> numberList=Arrays.stream(numbers)
	                                       .boxed()
	                                       .collect(Collectors.toList());
	            
	        List<Integer> a=new ArrayList();
	        
	        for(int i=0; i<n; i++){
	            for(int j=i+1; j<n; j++){
	                int sum=numbers[i]+numbers[j];
	               
	                if(!a.contains(sum)){
	                   a.add(sum);
	                }
	            }
	        }
	        
	        
	        return a.stream()
	                .mapToInt(Integer::intValue)
	                .sorted()
	                .toArray();
	    }
	
}
//두 개 뽑아서 더하기