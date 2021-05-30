package programmers._001;

import java.util.Arrays;

//array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
//1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
//2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
public class Main {
 
    public static void main(String[] args) throws Exception {
  
    }
    
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            
            for(int i = 0; i < commands.length; ++i){
                
                int[] temp = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]-1];
                
            }
            
            return answer;
        }
    }
}