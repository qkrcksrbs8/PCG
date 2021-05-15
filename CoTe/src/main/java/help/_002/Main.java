package help._002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int min;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 	
		min = (N>K)?N:K;
		min = search(N, K);
		System.out.println("ÃÖ¼Ò : "+min);
 
	}
 
	public static int search(int N, int K) {
		if(K%N==0) return K/N;
		if(N>K) return N-K;
		int minplu = dfsplu(N, K, (N > K)?N-K:K-N);
		int minmin = dfsmin(N, K, minplu);
		return (minplu>minmin)?minmin:minplu;
	}
	
	public static int dfsplu(int N, int K, int max) {
		int x = N;
		for(int i = 0; i <= max; ++i) {	
			for(int j = 1; j <= max; ++j) {
 				if(i == j && K/2 > j) x*=2;
 				else x++;	  
				if(x>=K) {
  					if(min > x-K+j) min = x-K+j; break;
				}
				if(i == max && j == max) return min;
				if(j > min) break;
			}
			x = N;
		}
        return (max>min)?min:max;
    }
	
	public static int dfsmin(int N, int K, int max) {
		int x = N;
		for(int i = N; N >= 0; --N) {
			for(int j = N+1; j >=0; --j) {
				if(j > i) x--;
 				else if(i == j && (K/2)+1 >= j)  dfsmin((x*=2)+1,K, max);
				else x++;
				if(x>=K) {
  					if(min > x-K+j) min = x-K+j; break;
				}
				if(i == 0 && j == 0) return min;
			}
			x = N;
		}
		return (max>min)?min:max;
	}
	 
	
}
    


