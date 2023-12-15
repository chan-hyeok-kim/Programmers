package programmers.level.one;

class Solution20 {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] count=new int[2];
        for(int i=0; i<array.length; i++){
            count[0]=0;
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j]){
                   count[0]++;
                }
            }
            
          if(answer==count[0]){
              if(count[1]==array[i]){
                continue;  
              }else{
                count[1]=-1;
              }
          }else if(answer<count[0]){
              answer=count[0];
              count[1]=array[i];
          }
            
            
        }
        answer=count[1];
        
        
        return answer;
    }
}

//최빈값구하기