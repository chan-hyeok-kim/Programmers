package programmers.level.one;

public class Solution4 {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
 
        answer[0]=-1;
        for(int i=1; i<s.length(); i++) {
        	for(int j=i-1; j>=0; j--) {
        		if(s.charAt(i)==s.charAt(j)) {
        			answer[i]=i-j;
                    break;
        		}else {
        			answer[i]=-1;
        		}
        		
        	}
        }
        
        return answer;
    }
}

//가장 가까운 같은 글자 위치만큼의 숫자 배열