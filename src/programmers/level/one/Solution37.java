package programmers.level.one;

class Solution37 {
	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	    
	        String[] str1=new String[n];
	        String[] str2=new String[n];
	        for(int i=0; i<n; i++){
	        	str1[i]=Integer.toBinaryString(arr1[i]);
	        	str2[i]=Integer.toBinaryString(arr2[i]);
	        	
	            str1[i]=String.format("%"+n+"s", str1[i]).replace(' ', '0');
	        	str2[i]=String.format("%"+n+"s", str2[i]).replace(' ', '0');
	        	
	            answer[i]="";
	            for(int j=0; j<n; j++) {
	                 if(str1[i].charAt(j)=='1' || str2[i].charAt(j)=='1'){
	                     answer[i]+="#";
	                  }else{
	                     answer[i]+=" ";
	                  }
	            }
	        }    
	        return answer;
	    }
}
//[1차]비밀지도