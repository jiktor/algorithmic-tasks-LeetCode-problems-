package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.isPalindrome(23432));
	}
}
class Solution {
	public static boolean isPalindrome(int x) {
		if(x == 0 ) return true;
		if( x<0 || x%10 == 0) return false;

		int revInt = 0;
		while(x>revInt){
			int pop = x%10;
			x/=10;

			revInt = (revInt * 10) + pop;
		}
		if(x == revInt || x == revInt/10){
			return true;
		}else{
			return false;
		}
	}
}