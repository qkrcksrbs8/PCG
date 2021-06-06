//package kakao._2019._003;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//
////카카오 2019 후보키
//public class Main {
// 
//    public static void main(String[] args) throws Exception {
//    	
//    }
//    
//    class Solution{
//    	
//    	Comparator<Integer> comp = new Comparator<Integer>() {
//    		
//    		int countBits(int n) {
//    			int ret = 0;
//    			while (0 != n) {
//    				if ((1 & n) != 0) ++ret;
//    				n = n >> 1;
//    			}
//    			return ret;
//    		}
//    		public int compare(Integer a, Integer b) {
//    			int x = countBits(a);
//    			int y = countBits(b);
//    			if (x > y) {
//    				return 1;
//    			}
//    			else if (x < y) {
//    				return -1;
//    			}
//    			else {
//    				return 0;
//    			}
//    		}
//    	}
//    	
//    	boolean check(String[][] relation, int rowsize, int colsize, int subset) {
//    		for (int a = 0; a < rowsize - 1; ++a) {
//    			for (int b = a + 1; b < rowsize; ++b) {
//    				boolean isSame = true;
//    				for (int k = 0; k < colsize; ++k) {
//    					if (0 == (subset & 1 << k)) continue;
//    					if (relation[a][k].equals(relation[b][k]) == false) {
//    						isSame = false;
//    						break;
//    					}
//    				}
//    				if (isSame) return false;
//    			}
//    		}
//    		return true;
//    	}
//    	
//    	public int solution(String[][] relation) {
//    		int answer = 0;
//    		int rowsize = relation.length;
//    		int colsize = relation[0].length;
//    		List<Integer> candidates = new LinkedList<Integer>();
//    		
//    		//부분 집합
//    		for (int i = 1; i < 1 << colsize; ++i) {
//    			if (check(relation, rowsize, colsize, i)) {
//    				candidates.add(i);
//    			}
//    		}
//    		
//    		Collections.sort(candidates, comp);
//    		
//    		while (0 != candidates.size()) {
//    			int n = candidates.remove(0);
//    			++answer;
//    			
//    			for (Iterator<Integer> it = candidates.iterator(); it.hasNext();) {
//    				int c = it.next();
//    				if ((n & c) == n) it.remove();
//    			}
//    		}
//    		
//    		return answer;
//    	}
//    	
//    	
//    }
//    
//}