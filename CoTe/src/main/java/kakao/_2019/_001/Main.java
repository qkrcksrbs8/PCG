package kakao._2019._001;
import java.util.*;

//īī�� 2019 ����ä�ù�
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
    		
    		//���ǿ� �°� ���� �� ���
    		for (String str : record) {
    			StringTokenizer tokenizer = new StringTokenizer(str);
    			String cmd = tokenizer.nextToken();
    			if ("Enter".equals(cmd)) {
    				String id = tokenizer.nextToken();
    				ansList.add(idmap.get(id) + "���� ���Խ��ϴ�.");
    			}
    			else if ("Leave".equals(cmd)) {
    				String id = tokenizer.nextToken();
    				ansList.add(idmap.get(id) + "���� �������ϴ�.");
    			}
    		}
    		
    		String[] answer = new String[ansList.size()];
    		ansList.toArray(answer);
    		return answer;
    	}
    	
    	
    }
    
}