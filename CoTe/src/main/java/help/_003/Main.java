package help._003;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int min;
	public static int plus;
	public static int minor;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 	
		int Nc = N;
		int valUp = 0;
		int valDo = 0;
		int val = 0;
		int min = K;
		int count = K-N;
		
		plus(Nc,valUp,valDo,val,min,count,N,K);
		minor(Nc,valUp,valDo,val,min,count,N,K);
		
		if(plus > minor) {
			System.out.println("置社 : "+minor);
		}
		else {
			System.out.println("置社 : "+plus);
		}
		
	}
	
	public static void plus(int Nc,int valUp,int valDo,int val,int min,int count,int N,int K) {
		for(int j = 0; j < count; ++j) {
			Nc+=j;
			for(int i = 1; i < count; ++i) {
				if( Nc > K ) {
					valUp = Nc-K;	
					if(K-(Nc/2) >= 0) {
						valDo = K-(Nc/2);
					}
 					val = (valUp>valDo)?valDo+i+j:valUp+i+j;
					min = (min > val)?val:min;
				}
				else if(Nc == K){
					min = i+j;
				}
				Nc *= 2;
			}
			Nc = N;
		}
		plus = min-1;
	}
	
	public static void minor(int Nc,int valUp,int valDo,int val,int min,int count,int N,int K) {
		for(int j = 1; j < count; ++j) {
 			Nc-=j;
			if(Nc < 2) break;
			for(int i = 1; i < count; ++i) {
				if( Nc > K ) {
					valUp = Nc-K;	
					if(K-(Nc/2) >= 0) {
						valDo = K-(Nc/2);
					}
 					val = (valUp>valDo)?valDo+i-1+j:valUp+i-1+j;
					min = (min > val)?val:min;
				}
				else if(Nc == K){
					min = i+j;
				}
				Nc *= 2;
			}
			Nc = N;
		}
		minor = min-1;
	}
	
}
    


