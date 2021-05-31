package kakao._2021._001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 순위검색
 *
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution{
    	Map<String, Integer> Wordmap = new HashMap<String, Integer>(); 
    	List<List<Integer>> ScoreList = new ArrayList<List<Integer>>();
    	
    	public int[] solution(String[] info, String[] query) {
    		Wordmap.put("-", 0);
    		Wordmap.put("cpp", 1);
    		Wordmap.put("java", 2);
    		Wordmap.put("python", 3);
    		Wordmap.put("backend", 1);
    		Wordmap.put("frontend", 2);
    		Wordmap.put("junior", 1);
    		Wordmap.put("senior", 2);
    		Wordmap.put("chicken", 1);
    		Wordmap.put("pizza", 2);
    		for (int i=0; i<4*3*3*3; ++i) {
    			ScoreList.add(new ArrayList<>());
    		}
    		
    		for (String str : info) {
    			String[] word = str.split(" ");
    			int[] arr= {Wordmap.get(word[0])
    						,Wordmap.get(word[1])
    						,Wordmap.get(word[2])
    						,Wordmap.get(word[3])
    					   };
    			int score = Integer.parseInt(word[4]);
    			
    			for (int i=0; i<(1<<4); ++i) {
    				int idx = 0;
    				for (int j = 0; j < 4; ++j) {
    					if((i & (1<<j)) != 0) {
    						 idx += arr[j];
    					}
    				}
    				ScoreList.get(idx).add(score);
    			}
    		}
    		for (int i=0; i<4*3*3*3; ++i) {
    			Collections.sort(ScoreList.get(i));
    		}
    		
    		int[] answer = new int[query.length];
    		for (int i=0; i<query.length; ++i) {
    			String[] word = query[i].split(" ");
    			int idx = Wordmap.get(word[0])*3*3*3 +
    					  Wordmap.get(word[2])*3*3 +
    					  Wordmap.get(word[4])*3 +
    					  Wordmap.get(word[6]);
    			int score = Integer.parseInt(word[7]);
    			int ret	  = Collections.binarySearch(ScoreList.get(idx),score);
    			if (ret < 0) {
    				ret = -(ret + 1);
    			}
    			else {
    				for (int j = ret - 1; j >= 0; --j) {
    					if (ScoreList.get(idx).get(j) == score) {
    						ret = j;
    					}
    					else {
    						break;
    					}
    				}
    			}
    			answer[i] = ScoreList.get(idx).size() - ret;
    		}
    		return answer;
    	}
    	
    }
    
}