package programmers.heap._001;

import java.util.PriorityQueue;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	int[] x = {1,2,3,9,10,12};
    	int y = 7;
    	System.out.println(Solution.solution(x,y));
    }
    static class Solution {
    	public static int solution(int[] scoville, int K) {
    		int answer = 0;
            PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
            for (int aScoville : scoville) {
                heap.add(aScoville);
            }
            while(heap.peek() < K) {
            	if(heap.size() == 1) return -1;
            	int val1 = heap.poll();
            	int val2 = heap.poll();
            	int result = val1 + (val2*2);  	
            	heap.add(result);
            	answer ++;
            }
            return answer;
        }
    }
}