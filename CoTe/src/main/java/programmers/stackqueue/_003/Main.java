package programmers.stackqueue._003;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    class Solution {
    	public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0; 
            int temp_weight = 0, idx=0;
            Queue<Integer> queue = new LinkedList<Integer>();           
            while(true){
                if(idx == truck_weights.length) {break;}
                if(queue.size() == bridge_length){
                    temp_weight-=queue.poll();                
                }
                else if(temp_weight+truck_weights[idx]>weight){
                    queue.offer(0);
                    answer++;          
                }else{
                    queue.offer(truck_weights[idx]);
                    temp_weight+=truck_weights[idx];
                    answer++;
                    idx++;
                }            
            }
            return answer + bridge_length;
        }
    }
}