package algorithm._001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[N][2];
        String[] str = new String[2];
        for (int i = 0; i < N; i++) {//배열에 값 담기 -> {[1,10],[1,20],[1,30]}
            str = br.readLine().split(" ");
            arr[i][0] =Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {//키 값이 같으면 오름차순 정렬 -> {[1,30],[1,20],[1,10]}
            @Override
            public int compare(int[] x, int[] y) {
                if (x[0] == y[0]) {
                    return Integer.compare(y[1], x[1]);   
                }
                return Integer.compare(x[0], y[0]);
            }
        });
        
        int x = -1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
        	if(arr[i][0] == x) continue;//
        	sum += arr[i][1];
        	x = arr[i][0];
        }
        System.out.println("합계 : "+sum);
    }
}