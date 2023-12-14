package programmers.level.one;

import java.util.Arrays;
import java.util.List;

public class Solution09 {
	public int[] solution(String[] wallpaper) {
		int n=wallpaper.length;
        int[] answer = new int[4];
        String x = "";
        String y = "";
        		
        for(int i=0; i<n; i++) {
        	for(int j=0; j<wallpaper[i].length(); j++) {
        	    if((""+wallpaper[i].charAt(j)).equals("#")) {
        			x+=i;
        			y+=j;
        	    }
        	}
        }
        
        String[] xs=x.split("");
        String[] ys=y.split("");
        
        int[] arrX = Arrays.stream(xs)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arrY = Arrays.stream(ys)
                .mapToInt(Integer::parseInt)
                .toArray();
        
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        
        answer[0]=arrX[0];
        answer[1]=arrY[0];
        answer[2]=arrX[arrX.length-1]+1;
        answer[3]=arrY[arrY.length-1]+1;
        
        return answer;
    }
}

//바탕화면 정리
//가장 작은 X값을 가진 좌표와 가장 작은 Y값을 가진 좌표
//가장 큰 X값을 가진 좌표와 가장 큰 Y값을 가진 좌표
//리턴하면됨
//정답률 70% 아직 푸는중
