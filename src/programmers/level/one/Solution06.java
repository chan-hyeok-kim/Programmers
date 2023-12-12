package programmers.level.one;


import java.util.HashSet;

public class Solution06 {
        public int solution(int[] nums) {
       
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++) {
        	set.add(nums[i]);
        }
        
        if(set.size()<=nums.length/2) {
        	return set.size();
        }
        
        
        return nums.length/2;
    }
}
//폰켓몬