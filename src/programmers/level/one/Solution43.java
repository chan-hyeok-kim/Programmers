package programmers.level.one;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution43 {
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0; i<score.length; i++){
            priorityQueue.add(score[i]);
        }
        
        int boxCount=score.length/m;
        
        for(int i=0; i<boxCount; i++){
            for(int j=0; j<m; j++) {
               k=priorityQueue.poll();
            }
            answer+=k*m;
        }
        
        return answer;
    }
}
//과일 장수