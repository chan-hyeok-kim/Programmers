package programmers.level.one;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		//7번
		Solution07 solution7=new Solution07();
		int[] sample={2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer=solution7.solution(5, sample);
		
		for(int a: answer) {
//			System.out.println(a);
		}
		
		
		Solution09 solution9=new Solution09();
		String[] sample9={".#...", "..#..", "...#."};
		int[] answer9=solution9.solution(sample9);
		
		for(int a: answer9) {
//			System.out.println(a);
		}
		

		
		Solution27 solution27=new Solution27();
		int n=125;
		solution27.solution(n);
		
		
		Solution26 solution26=new Solution26();
		int x=8;
		int y=12;
		int[] result=solution26.solution(x,y);
		
		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
		}
		
		
		Solution29 solution29=new Solution29();
		String s="  TRy HElLo  WORLD    Mpmpco     ";
		s=solution29.solution(s);
//		System.out.println(s);
		
		Solution30 solution30=new Solution30();
		int[] num= {-2, 3, 0, 2, -5};
		int result30=solution30.solution(num);
//		System.out.println(result30);
		
		Solution32 solution32=new Solution32();
		int[] arr32= {10, 2};
		int[][] commands32={{1, 2, 1}};
		int[] answer32=solution32.solution(arr32, commands32);
		

		
		
//		Solution35 solution35=new Solution35();
//		int[] answer35= {1,3,5,9};
//		solution35.solution(answer35);
//		
//		List<String> list35=Arrays.asList(new String[]{"",""});
//		
//		Solution38 solution38=new Solution38();
//		int a38=4;
//	    int n38=10;
//	    int b38=3;
//	    int answer38=solution38.solution(a38, b38, n38);
//	    System.out.println(answer38);
	    
	    Solution46 solution46=new Solution46();
	    int n46=10;
	    int result46=solution46.solution(n46);
	    
//	    System.out.println(result46);
		
	    Solution48 solution48=new Solution48();
	    int n48=8;
	    int m48=4;
	    int[] section= {2,3,6};
	    int result48=solution48.solution(n48, m48, section);
	    
//	    System.out.println(result48);
	    
	    
	    Solution49 solution49=new Solution49();
	    int n49=5;
	    int[] m49= {1,1,1,2,3,4};
	    int[] result49=solution49.solution(n49, m49);
	    
	    for(int r:result49) {
//	    	System.out.println(r);
	    	//기댓값 [4, 1, 3, 2, 5]
	    }
	    
	    
	    Solution55 solution55=new Solution55();
	    int n55=5;
	    int[] lost55 = {2, 3, 4};
	    int[] reserve55 = {3, 4, 5};
	    int result55=solution55.solution(n55, lost55, reserve55);
	    
	    Solution56 solution56=new Solution56();
	    int n56=4;
	    int[] lost56 = {2, 3};
	    int[] reserve56 = {3, 4};
	    int result56=solution56.solution(n56, lost56, reserve56);
	    System.out.println(result56);
	    
	}
}
