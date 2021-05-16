package programmers.search._002;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {

	}

	class Solution {
	    public int solution(String numbers) {
	        int answer = 0;
	        String[] strArr=numbers.split("");
	        int[] nums = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
	        Set<Integer> set=new HashSet<>();
	        //1���� ���� �� �ִ� �ִ� ���̱��� ���� ����
	        for(int i=1;i<=nums.length;i++){
	            perm(strArr, 0, i, set);
	        }
	        answer=set.size();
	        return answer;
	    }
	    public void perm(String[] arr, int depth, int k, Set set){//���� ����
	        if(depth==k){//���ϴ� k���� ���ڰ� ���õ����Ƿ� ���̻� ��������X
	            print(arr, k, set);
	            return;
	        }
	        else{
	            for(int i=depth;i<arr.length;i++){
	                swap(arr, i, depth);
	                perm(arr, depth+1, k, set);
	                swap(arr, i, depth);
	            }
	        }
	    }
	    public void swap(String[] arr, int i, int j){
	        String temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    public void print(String[] arr, int k, Set set){//���� ����
	        StringBuilder s=new StringBuilder();
	        for(int i=0;i<k;i++){
	            //System.out.print(arr[i]);
	            s.append(arr[i]);//���ڿ����ϱ�
	        }
	        //System.out.println();
	        primeNumber(set, s);
	    }
	    public void primeNumber(Set set, StringBuilder s){//�Ҽ� üũ
	        int num=Integer.parseInt(String.valueOf(s));
	        boolean prime=true;
	        if(num<=1){
	            return;
	        }
	        for(int i=2;i<=Math.sqrt(num);i++){
	            if(num%i==0){
	                prime=false;
	                break;
	            }
	        }
	        if(prime){
	            set.add(num);
	        }
	    }
	}
}
