package programmers.level.one;

class Solution50 {
	public int solution(String dartResult) {
        int answer = 0;
        
        String regEx="^[0~9]*$";
        String regExEng="^[D~T]*$";
        int n=dartResult.length();
        String[] resultArr = dartResult.split("");
        String[] scoreSet=new String[3];
        
        if(resultArr[n-1].matches(regExEng)) {
           n-=1;
        }else {
           n-=2;	
        }
        
        for(int i=0; i<n; i++) {
        
	    	if((""+resultArr[i]).matches(regEx)) {
	    	   if((""+resultArr[i+2]).matches(regEx)){
	    		  scoreSet[i]=dartResult.substring(i,i+3);
	    		  i+=2;
	    	   }else {
	    		  scoreSet[i]=dartResult.substring(i,i+4);
	    		  i+=3;
	    	   }
	    	}	
        }  
    	
        for(int i=0; i<3; i++) {
        	int[] score=new int[3];
        	
        	if(scoreSet[i].length()==2) {
        		//상 없을때
        	   int initVal=Integer.parseInt(scoreSet[i]);
        	   
        	   if(scoreSet[i+1].equals("S")) {	
        		  score[i]=initVal;
        	   }else if(scoreSet[i+1].equals("D")) {
        		  score[i]=(int) Math.pow(initVal, 2);
        	   }else{
        		  score[i]=(int) Math.pow(initVal, 3);
        	   }
        	   
        	}else {
        		//상 있을 때
        	   int sc=0;
        	   int initVal=Integer.parseInt(scoreSet[i]);
         	   
         	   if(scoreSet[i+1].equals("S")) {	
         		  sc=initVal;
         	   }else if(scoreSet[i+1].equals("D")) {
         		  sc=(int) Math.pow(initVal, 2);
         	   }else{
         		  sc=(int) Math.pow(initVal, 3);
         	   }
         	   score[i]=sc;
         	  if(scoreSet[i+2].equals("*")) {
         		    score[i]=score(score, i);
         	  }else{
         		    score[i]-=sc;
         	  }
         	  //점수를 또 배열선언해서 담은후에
         	  //i-1인 값에 마이너스 *2할 수 있게끔 설정하기
         	   
        	}
        }
        		
        
        
        return answer;
    }
	
	public int score(int[] score, int idx) {
		int sum=0;
		
		if(idx<1) {
			return sum;
		}
		idx--;
		sum=(score[idx]+score(score, idx))*2;
		
		return sum;
	}
	
}