package programmers.level.one;

class Solution14 {
    public boolean solution(int x) {
        boolean answer = true;
        
        String xStr=String.valueOf(x);
        int sum=0;
        for(int i=0; i<xStr.length(); i++){
            sum+=Integer.parseInt(""+xStr.charAt(i));
        }
        if(x%sum!=0){
            answer=false;
        }
        
        return answer;
    }
}

//하샤드 수