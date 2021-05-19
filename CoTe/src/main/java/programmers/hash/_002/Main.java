package programmers.hash._002;

import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	
    }
    
    class Solution {
    	public boolean solution(String[] phone_book) {
    	        Arrays.parallelSort(phone_book);
    			for(int i = 0; i < phone_book.length-1; ++i) {
    				if(phone_book[i+1].startsWith(phone_book[i])) {
    					return false;
    				}//if
    			}
    			return true;
//    		int count = phone_book.length;
//    		for(int i = 0; i < count-1; ++i) {
//                for(int j = i+1; j < count; ++j) {
//                    if(phone_book[i].startsWith(phoneBook[j])) {return false;}
//                    if(phone_book[j].startsWith(phoneBook[i])) {return false;}
//                }
//    		}
//            return true;
        }
    }

}