package programmers.level.one;

class Solution33 {
	public int solution(int[][] sizes) {
        int answer = 0;
        
        //로직
        //가로길이에서 큰거
        //세로길이에서 큰거
        //단, 안의 길이 내용들을 일관되게 정렬시켜야함
        
        for(int i=0; i<sizes.length; i++){
           if(sizes[i][0]>sizes[i][1]){
              int tmp=sizes[i][0];
              sizes[i][0]=sizes[i][1];
              sizes[i][1]=tmp;
           }   
        }
        
        int height=0;
        int width=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>width){
               width=sizes[i][0];         
            }   
            if(sizes[i][1]>height){
               height=sizes[i][1];
            }
        }
        
        answer=height*width;
        
        return answer;
    }
	
}
//최소 직사각형