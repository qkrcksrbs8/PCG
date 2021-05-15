package bj.math._006;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static int[][] APT = new int[15][15];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		make_APT();	// ����Ʈ ����� 
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		System.out.println(sb);
	}
 
	public static void make_APT() {
		// ����Ʈ ����
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i�� 1ȣ
			APT[0][i] = i; // 0�� iȣ
		}
		for (int i = 1; i < 15; i++) { // 1������ 14������
 
			for (int j = 2; j < 15; j++) { // 2ȣ���� 14ȣ����
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}
}
 