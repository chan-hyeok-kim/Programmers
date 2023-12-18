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
			System.out.println(result[i]);
		}
		
		
	}
}
