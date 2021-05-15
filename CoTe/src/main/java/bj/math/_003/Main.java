package bj.math._003;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
//�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
//X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int cross_count = 1, prev_count_sum = 0;
		while (X > prev_count_sum + cross_count) {	
				prev_count_sum += cross_count;
				cross_count++;
		}
		if (cross_count % 2 == 1) {
			System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
			
		} 
		else {
			System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
		}
 	}
}