package programmers.level.one;

class Solution27 {
	public int solution(int n) {
        int answer = 0;
        
        String strNumber="";
        while(n>0){
            strNumber+=String.valueOf(n%3);
            if(n==1){
                break;
            }
            n=n/3;
        }
        
        String[] str=strNumber.split("");
    
        for(int i=0; i<str.length; i++){
            answer+=Integer.parseInt(str[str.length-i-1])*Math.pow(3,i);   
        }
       
        
        return answer;
    }
}
//3진법 뒤집기
//StringBuilder와 Integer.parseInt(n,3) 활용해서 다시 풀어보기