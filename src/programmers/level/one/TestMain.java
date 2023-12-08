package programmers.level.one;

public class TestMain {

	public static void main(String[] args) {
		
		//7번
		Solution7 solution7=new Solution7();
		int[] sample={2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer=solution7.solution(5, sample);
		
		for(int a: answer) {
			System.out.println(a);
		}
		
		
		
		
	}
}
