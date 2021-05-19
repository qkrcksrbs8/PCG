package help._003;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
 
public class Main {

	public static void main(String[] args) throws IOException {
		Solution s = new Solution();
		String[] arr = {"Apeach Frodo 2", "Frodo Apeach 2", "Tube Apeach 5", "Frodo Tube 7", "Apeach Frodo 4", "Apeach Tube 4"};
		int x = 6;
		String[] result = s.solution(x, arr);
		for(String str : result) {
			System.out.println(str);
		}
	}
	
	public static void mapPlus(Map<String, Integer> map, String str, int point) {
		if(map.containsKey(str)) map.put(str, point+map.get(str));
		else map.put(str, point);
	}
	
	public static void mapMinor(Map<String, Integer> map, String str, int point) {
		if(map.containsKey(str)) map.put(str, -point+map.get(str));
		else map.put(str, -point);
	}
	
	public static String[] mapSet(int n, String[] arr) {
		String[] array = new String[arr.length];
		StringBuilder sb = new StringBuilder();		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int point = 0;
		for(int i = 0; i < n; ++i) {
			StringTokenizer str = new StringTokenizer(arr[i], " ");
			String credit = str.nextToken();
			String reception = str.nextToken();
			if(credit.equals(reception)) continue;
			point = Integer.parseInt(str.nextToken());
			if(1 <= point && point <= 1000)
			mapPlus(map, credit, point);
			mapMinor(map, reception, point);
		}
		int cnt = 0;
		Arrays.sort(map.keySet().toArray());
		for(String key : map.keySet()) {
			if(0 >= map.get(key)) array[cnt] = "None";
			else array[cnt] = key;
			++cnt;
		}
		return array;
	}
	
	static class Solution{
    	public static String[] solution(int n, String[] arr) {
    		if(1 <= n && n <= 2000000) {
    			return null;
    		}
    		String[] answer = mapSet(n,arr);
    		return answer;
    	}
    }
}
    


