package bj.math2._001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
public class Main {
 
	//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	//주어진 수들 중 소수의 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓰지 않음.	
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()) {
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken());			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
}