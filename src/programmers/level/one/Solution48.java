package programmers.level.one;

class Solution48 {
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] totalSection=new int[n];

        for(int i=0; i<n; i++){
            totalSection[i]=i+1;
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=0; j<section.length; j++){
            	
           
            	System.out.println(i);
            	System.out.println(section[j]);
            	
                if(i==section[j]){
                       answer++;
                       i+=m;
                }
                
                while(i<=section[j]) {
             	   i++;
             	}
            }
        }
    
        return answer;
    }
}