package programmers.level.one;

class Solution23 {
	public int solution(int[] common) {
        int answer = 0;
        
        int n=common.length;
        
        boolean isDifferenceSequence=false;
        for(int i=0; i<common.length-2; i++){
            if(common[i+1]-common[i]==common[i+2]-common[i+1]){
                isDifferenceSequence=true;
            }else{
                isDifferenceSequence=false;
                break;
            }
        }
     
        if(isDifferenceSequence==false){
            answer=common[n-1]*(common[1]/common[0]);
        }else{
            answer=common[n-1]+(common[1]-common[0]);
        }
        
        return answer;
    }
}

//다음에 올 숫자