package bj.math._002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
//���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
//���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���� ���, 13������ 3��, 58������ 5���� ������.

public class Main {
	//ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
	//�Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
	static int N = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		//1 7 19 37 61
		//-6 -12 -18 -24 
		int i = 0;
		int j = 1000000001;
		int k = 6;
		if(i != X) {
			for(i=1; i <= j; ++i) {
				N = N+((i-1)*k);
				if(N < X && N+(i*k) >= X) break;	
			}
		}
		System.out.println(i+1);
	}
}