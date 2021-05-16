package programmers._002;

import java.util.Arrays;

//0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
//���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
//0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.
public class Main {
 
    public static void main(String[] args) throws Exception {
    	
        
    }
    
    class Solution {
        public String solution(int[] numbers) {
            String[] arr = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++)
                arr[i] = String.valueOf(numbers[i]);
     
                    Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
     
            if(arr[0].equals("0")) return "0";
             
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++)
                sb.append(arr[i]);
     
            return sb.toString();
        }
    }
}