package programmers.level.one;

class Solution13 {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0; i<sizes.length; i++){
                if(sizes[i][0]>sizes[i][1]){
                   int tmp=sizes[i][0];
                    sizes[i][0]=sizes[i][1];
                    sizes[i][1]=tmp;
                }       
        }
        
        
    
         for(int i=0; i<sizes.length-1; i++){
             if(sizes[i][0]>sizes[i+1][0]){
                 int tmp=sizes[i][0];
                    sizes[i][0]=sizes[i+1][0];
                    sizes[i+1][0]=tmp;
                     answer=sizes[i+1][0];
             }
             
         }
    
        
        return answer;
    }
}
