package programmers.level.one;

class Solution22 {
	public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] sample=quiz[i].split(" ");
            int[] num=new int[sample.length];
            
            for(int j=0; j<5; j+=2){
                num[j]=Integer.parseInt(sample[j]);
            }
            
            if(sample[1].equals("+")){
                if(num[0]+num[2]==num[4]){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else{
                if(num[0]-num[2]==num[4]){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
                
            }
        }
        
        return answer;
    }
}
//OX퀴즈