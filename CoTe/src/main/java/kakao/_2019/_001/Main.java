package kakao._2019._001;
import java.util.*;

//카카오 2019 오픈채팅방
public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution{
    	
    	public String[] solution(String[] record) {
    		List<String> ansList = new ArrayList<String>();
    		Map<String, String> idmap = new HashMap<String, String>();

    		for (String str : record) {
    			StringTokenizer tokenizer = new StringTokenizer(str);
    			String cmd = tokenizer.nextToken();
    			if ("Enter".equals(cmd) ||"Change".equals(cmd)) {
    				String id = tokenizer.nextToken();
    				String name = tokenizer.nextToken();
    				idmap.put(id, name);
    			}
    		}
    		
    		//조건에 맞게 삽입 후 출력
    		for (String str : record) {
    			StringTokenizer tokenizer = new StringTokenizer(str);
    			String cmd = tokenizer.nextToken();
    			if ("Enter".equals(cmd)) {
    				String id = tokenizer.nextToken();
    				ansList.add(idmap.get(id) + "님이 들어왔습니다.");
    			}
    			else if ("Leave".equals(cmd)) {
    				String id = tokenizer.nextToken();
    				ansList.add(idmap.get(id) + "님이 나갔습니다.");
    			}
    		}
    		
    		String[] answer = new String[ansList.size()];
    		ansList.toArray(answer);
    		return answer;
    	}
    	
    	
    }
    
}