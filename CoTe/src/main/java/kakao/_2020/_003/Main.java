package kakao._2020._003;
import java.util.*;

//īī�� 2020 ��ȣ ��ȯ
public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution{
    	int pos;
    	boolean isCorrect(String str) {
    		boolean ret = true;
    		int left = 0;
    		int right = 0;
    		Stack<Character> mystack = new Stack<Character>();
    		
    		for (int i = 0; i < str.length(); ++i) {
    			if (str.charAt(i) == '(') {//������ ��ȣ�� ����
    				++left;
    				mystack.push('(');
    			}
    			else {
    				++right;
    				if(mystack.empty()) {//����ִ��� Ȯ��
    					ret = false;
    				}
    				else {
    					mystack.pop();//���� ��ȣ�� ��������
    				}
    			}
    			if (left == right) {
    				pos = i + 1;
    				return ret;
    			}
    		}
    		return false;
    	}
    	
    	public String solution(String p) {
    		if (p.isEmpty()) return p;//�� ���ڿ��̸� �ٷ� ����
    		
    		boolean correct = isCorrect(p);
    		String u = p.substring(0, pos);//ó������ pos����
    		String v = p.substring(pos, p.length());//pos���� ������
    		
    		if (correct) {
    			return u + solution(v);
    		}
    		
    		String answer = "(" + solution(v) + ")";
    		StringBuilder sb = new StringBuilder();
    		for (int i = 1; i < u.length()-1; ++i) {
    			if ('(' == u.charAt(i)) {
    				sb.append(")");
    			}
    			else {
    				sb.append("(");
    			}
    		}
    		
    		return answer;
    	}
    	
    	
    }
    
}