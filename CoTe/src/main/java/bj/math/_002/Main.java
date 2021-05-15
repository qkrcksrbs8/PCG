package bj.math._002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 

//���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
//�׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
//���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���� ���, 13������ 3��, 58������ 5���� ������.
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // �� ��(�ּ� ��Ʈ)
		int range = 2;	// ���� (�ּڰ� ����) 
 
		if (N == 1) {
			System.out.print(1);
		}
		else {
			while (range <= N) {	// ������ N���� Ŀ���� �������� �ݺ� 
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}
}   