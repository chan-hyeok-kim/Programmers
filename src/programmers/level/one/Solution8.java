package programmers.level.one;

public class Solution8 {
	public int solution(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}

//개미군단