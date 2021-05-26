package programmers.dfsBfs._001;

import java.util.HashMap;
import java.util.Map;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    public class Solution {
    	  public int solution(int n, int[][] computers) {
    	    int answer = 0;
    	    boolean[] check = new boolean[n]; // n ������ŭ boolean �迭�� ����� ��� ��Ҹ� false�� �ʱ�ȭ

    	    for (int i = 0; i < n; i++) {
    	      if (!check[i]) {
    	        dfs(computers, i, check);
    	        answer++;
    	      }
    	    }

    	    return answer;
    	  }

    	  boolean[] dfs(int[][] computers, int i, boolean[] check) {
    	    check[i] = true;

    	    for (int j = 0; j < computers.length; j++) {
    	      if (i != j && computers[i][j] == 1 && check[j] == false) {
    	        check = dfs(computers, j, check);
    	      }
    	    }
    	    return check;
    	  }
    }

}