package programmers.hash._003;

import java.util.HashMap;
import java.util.Map;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution {
    	public int solution(String[][] clothes) {
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            int count = clothes.length;
            for (int i = 0; i < count; i++) {
                if (hm.containsKey(clothes[i][1]))
                    hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
                else
                    hm.put(clothes[i][1], 1);
            }
            int answer = 1;
            for (int value : hm.values()) {
                answer*=(value+1);
            }
            answer-=1;
            return answer;
        }
    }

}