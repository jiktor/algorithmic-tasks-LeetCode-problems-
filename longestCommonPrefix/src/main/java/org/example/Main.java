package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Character> set = new HashSet<>();
		String [] str = {"asd","asdfdg","as"};
		System.out.println(Solution.longestCommonPrefix(str));

	}

	class Solution {
		public static String longestCommonPrefix(String[] strs) {
			String curr = strs[0];
			for(int i=0;i<strs.length;i++){
				if(curr.length()>strs[i].length()){
					curr = strs[i];
				}
			}

			for(int i=0;i<curr.length();i++){
				for(int x=0;x<strs.length;x++){
					if(curr.charAt(i)!=strs[x].charAt(i)){
						if(i!=0){
							return curr.substring(0,i);
						}else{
							return "";
						}
					}
				}
			}
			return curr;
		}
	}
}