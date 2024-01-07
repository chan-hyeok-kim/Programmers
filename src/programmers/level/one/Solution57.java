package programmers.level.one;

class Solution57 {
	 public int solution(int n) {
	        int answer = 0;
	        
	        int[] check=new int[100];
	        
	        int j=0;
	        int i=1;
	        while(j<check.length){
	            String str=String.valueOf(i);
	          
	           if(i%3!=0 && !str.contains("3")){
	              check[j]=i;
	              j++;
	            }
	            i++;
	        }
	       
	      
	        answer=check[n-1];
	        
	        return answer;
	    }
	
}
//레벨0, 저주의 숫자3