package kakao._2019._002;
import java.util.*;

//īī�� 2019 ������
public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution{
    	class Fail {
    		int stage;
    		double rate;
    		Fail(int stage, double rate) {
    			this.stage = stage;
    			this.rate = rate;
    		}
    	}
    	
    	Comparator<Fail> comp = new Comparator<Fail>() {
    		public int compare(Fail a, Fail b) {
    			if (a.rate < b.rate) {
    				return 1;
    			}
    			else if (a.rate > b.rate) {
    				return -1;
    			}
    			else {
    				if (a.stage > b.stage) {
    					return 1;
    				}
    				else if (a.stage < b.stage) {
    					return -1;
    				}
    				else {
    					return 0;
    				}
    			}
    		}
    	};
    	
    	public int[] solution(int N, int[] stages) {
    		int[] answer = new int[N];
    		List<Fail> fails = new ArrayList<Fail>();
    		int total = stages.length;
    		
    		int[] users = new int[N+1];
    		for (int s : stages) {
    			users[s-1]++;
    		}
    		
    		for (int i = 0; i < N; ++i) {
    			if (0 == users[i]) {
    				fails.add(new Fail(i+1, 0));
    			}
    			else {
    				fails.add(new Fail(i+1, (double)users[i]/total));
    				total -= users[i];
    			}
    		}
    		
    		Collections.sort(fails, comp);
    		for (int i = 0; i < N; ++i) {
    			answer[i] = fails.get(i).stage;
    		}
    		
    		return answer;
    	}
    	
    	
    }
    
}