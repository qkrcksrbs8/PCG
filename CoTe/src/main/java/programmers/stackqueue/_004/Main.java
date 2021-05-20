package programmers.stackqueue._004;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    class Solution {
        public int[] solution(int[] prices) {
        	int count = prices.length;
            int[] answer = new int[count];
            for(int i = 0 ; i < count; ++i){
                for(int j = i+1; j <count; ++j){
                    answer[i] = j-i;
                    if(prices[i]>prices[j]) break;                 
                }
            }
            return answer;
        }
    }
}