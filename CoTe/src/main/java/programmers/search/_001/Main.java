package programmers.search._001;

import java.util.*;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
        
    }
    
 // 모의고사
 // answers: 정답이 순서대로 들은 answers
 class Solution {
     public int[] solution(int[] answers) {
         
         int[] person1 = {1, 2, 3, 4, 5};
         int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
         int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
         
         int[] cnt = new int[3];
         
         for(int i=0; i<answers.length; i++){
             if(answers[i] == person1[i%5]) cnt[0]++;
             if(answers[i] == person2[i%8]) cnt[1]++;
             if(answers[i] == person3[i%10]) cnt[2]++;
         }
         
         // 가장 높은 점수 
         int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
         
         List<Integer> list = new ArrayList<>();
         
         // 가장 높은 점수를 받은 사람을 찾는 것
         if(max == cnt[0])
             list.add(1);
         if(max == cnt[1])
             list.add(2);
         if(max == cnt[2])
             list.add(3);
         
         int[] answer = new int[list.size()];
         for(int i=0; i<list.size(); i++){
             answer[i] = list.get(i);
         }
        
         return answer;
     }
 }
}