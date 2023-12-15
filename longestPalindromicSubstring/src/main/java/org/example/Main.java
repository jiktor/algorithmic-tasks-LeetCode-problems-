package org.example;

public class Main {
	public static void main(String[] args) {

		System.out.println(Solution.longestPalindrome("kjlkjbsaabbaabkkjljkl"));
	}
	class Solution {
		public static String longestPalindrome(String s) {
			String result = "";
			int resultLength = 0;

			for(int i=0;i<s.length();i++){
				//for string with odd length
				int left = i-1;
				int right =i+1;
				while(left>=0 && right<s.length()){
					if(s.charAt(left) == s.charAt(right)){
						if((right-left+1)>resultLength){
							resultLength = right-left+1;
							result = s.substring(left,right+1);
						}
						left--;
						right++;
					}else{
						break;
					}
				}
				//for strings with even length
				left=i-1;
				right=i;
				while(left>=0 && right<s.length()){
					if(s.charAt(left) == s.charAt(right)){
						if((right-left+1)>resultLength){
							resultLength = right-left+1;
							result = s.substring(left,right+1);
						}
						left--;
						right++;
					}else{
						break;
					}
				}
			}
			if(result == "") return String.valueOf(s.charAt(0));
			return result;
		}
	}
}