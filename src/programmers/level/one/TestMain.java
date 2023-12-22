package programmers.level.one;

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
		
		for(int a: answer32) {
			System.out.print(a);
		}
		
		
	}
}
