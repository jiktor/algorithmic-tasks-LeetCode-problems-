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
			if(result > max/10
					|| (result == max/10 && digit>= max%10)){
				return 0;
			}else if(result < min/10
					|| (result == min/10 && digit<= min%10)){
				return 0;
			}
			result *= 10;
			result += digit;
		}
		return result;
	}
}