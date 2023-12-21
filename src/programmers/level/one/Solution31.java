package programmers.level.one;

class Solution31 {
	  public int solution(String t, String p) {
	        int answer = 0;
	        String[] tEx=t.split("");
	        
	        long tLen=t.length();
	        long pLen=p.length();
	            
	        for(long i=0; i<tLen-pLen+1; i++){
	            String str = "";
	            
	            
	            for(long j=i; j<pLen+i; j++){
	                str+=tEx[(int)j];
	               
	                if(str.length()==pLen && Long.parseLong(str)<=Long.parseLong(p)){
	                  answer++;
	                  
	                }
	                
	            }
	        }
	        
	        return answer;
	    }
	
}
//크기가 작은 부분문자열