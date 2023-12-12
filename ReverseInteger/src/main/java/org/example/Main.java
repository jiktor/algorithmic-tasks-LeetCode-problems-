package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.reverse(-43256));
	}
}
class Solution {
	public static int reverse(int x) {
		int max = 2147483647;
		int min = -2147483648;
		int result = 0;

		while(x!=0){
			int digit = x%10;
			x/=10;
			if((digit >= 8 && result >= 214748364)
					||digit<=-8 && result <= -214748364){
				return 0;
			}
			result *= 10;
			result += digit;
		}
		return result;
	}
}