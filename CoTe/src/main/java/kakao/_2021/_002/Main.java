package kakao._2021._002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 카카오 코딩테스트 2021 메뉴 리뉴얼
 *
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
    	int[] MaxCnt = new int[11];
    }
    
    class Solution{
    	List<Map<String, Integer>> FoodMaps = new ArrayList<>();
    	int[] MaxCnt = new int[11];
    	
    	void comb(char[] str, int pos, StringBuilder candi) {
    		if(pos >= str.length) {
    			int len = candi.length();
    			if(len >= 2) {
    				int cnt = FoodMaps.get(len).getOrDefault(candi.toString(),0) + 1;
    				FoodMaps.get(len).put(candi.toString(), cnt);
    				MaxCnt[len] = Math.max(MaxCnt[len], cnt);
    			}
    			return;//재귀호출 종료
    		}
    		
    		comb(str, pos+1, candi.append(str[pos]));
    		candi.setLength(candi.length()-1);
    		comb(str, pos+1, candi);
    	}
    	
    	public String[] solution(String[] orders, int[] course) {
    		//course의 최대값은 11 이하
    		for (int i = 0; i < 11; ++i) {
    			FoodMaps.add(new HashMap<String, Integer>());
    		}
    		//알파벳 순 정렬
    		for (String str : orders) {
    			char[] arr = str.toCharArray();
    			Arrays.sort(arr);
    			comb(arr, 0, new StringBuilder());
    		}
    		
    		List<String> list = new ArrayList<String>();
    		for (int len : course) {
    			for (Map.Entry<String, Integer> entry : FoodMaps.get(len).entrySet()) {
					if(entry.getValue() >= 2 && entry.getValue() == MaxCnt[len]) {
						list.add(entry.getKey());
					}
    			}
    		}
    		Collections.sort(list);
    		int listSize = list.size();
    		String[] answer = new String[listSize];
    		for (int i = 0; i < listSize; ++i) {
    			answer[i] = list.get(i);
    		}
    		return answer;
    	}
    }
    
}