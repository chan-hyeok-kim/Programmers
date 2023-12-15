package programmers.level.one;

class Solution18 {
	 public String solution(String phone_number) {
	        String answer = "";
	        
	        String[] num=phone_number.split("");
	        
	        for(int i=0; i<num.length; i++){
	            if(i<num.length-4){
	            num[i]="*";
	            }
	            answer+=num[i];
	        }
	      
	        return answer;
	    }
}

//휴대폰번호가리기