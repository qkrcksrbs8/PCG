package programmers.linear._001;

import java.util.HashMap;
import java.util.Map;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            int lost1 = 0;
            int count = 0;
            
            for(int i=0; i<lost.length; ++i) {
                for(int j=0; j<reserve.length; ++j) {
                    if(lost[i]==reserve[j]) {
                        ++lost1;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
            
            for(int i=0; i<lost.length; ++i) {
                for(int j=0; j<reserve.length; ++j) {
                    if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                        ++count;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
            answer = n - lost.length + lost1 + count;
            
            return answer;
        }
    }

}