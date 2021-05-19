package bj.str._001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int M = (N*2)+3;
		String[] arrayS = new String[M];
		for (int i = 0; i < M; i++) {
			if(i == N+1) continue;
 			arrayS[i] = br.readLine();
		}
		
		for(int i = 0; i < N; ++i) {
			if(-1 < arrayS[i+N+1].indexOf(arrayS[i])) System.out.println("YES"); 
			else System.out.println("NO");
		}
//		int M = Integer.parseInt(br.readLine());
//		String[] arrayQ = new String[M];	
//		for(int i = 0; i <= M; ++i) {
//			if(-1 < arrayQ[i].indexOf(arrayS[i])) System.out.println("YES"); 
//			else System.out.println("NO"); 
//		}
		
	}

}
 