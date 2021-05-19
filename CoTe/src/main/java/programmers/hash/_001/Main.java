package programmers.hash._001;

import java.util.HashMap;
import java.util.Map;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
            for (String player : completion) hm.put(player, hm.get(player) - 1);

            for (Map.Entry<String, Integer> map : hm.entrySet()) {
                if (0 != map.getValue()){
                    answer = map.getKey();
                }
            }
            return answer;
        }
    }

}