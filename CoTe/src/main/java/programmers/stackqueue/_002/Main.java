package programmers.stackqueue._002;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    class Solution {
    	public int solution(int[] priorities, int location) {
            int pointer = 0;                        
            int process = 0;        
            int count = priorities.length;
            int J;
            while(process < count) {
                boolean flag = true;                  
                if(pointer == count) pointer = 0;
                J = priorities[pointer];
                for(int i = 0; i < count; ++i) {  
                    if(i==pointer) continue;
                    if(priorities[i] > J) {                 
                        flag = false;                        
                        break;
                    }
                }
                if(flag) {                                 
                    priorities[pointer] = 0;            
                    ++process;                               
                    if(pointer==location) return process;  
                }
                ++pointer;
            }
            return process;
        }

    }
}