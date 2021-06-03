package kakao._2020._003;
import java.util.*;

//카카오 2020 괄호 변환
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
    			if (str.charAt(i) == '(') {//오른쪽 괄호면 삽입
    				++left;
    				mystack.push('(');
    			}
    			else {
    				++right;
    				if(mystack.empty()) {//비어있는지 확인
    					ret = false;
    				}
    				else {
    					mystack.pop();//왼쪽 괄호면 내보내기
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
    		if (p.isEmpty()) return p;//빈 문자열이면 바로 리턴
    		
    		boolean correct = isCorrect(p);
    		String u = p.substring(0, pos);//처음부터 pos까지
    		String v = p.substring(pos, p.length());//pos부터 끝까지
    		
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