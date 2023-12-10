package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String s = "bbtablud";
		System.out.println(Solution.lengthOfLongestSubstring(s));
	}
}
class Solution {
	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		int startIndex=0;
		Set<Character> set = new HashSet<Character>();

		for(int i=0;i<s.length();i++){
			if(!set.contains(s.charAt(i))){
				set.add(s.charAt(i));
			}else{
				if(startIndex==i)continue;
				set.remove(s.charAt(startIndex));
				startIndex++;
				i--;
			}
			if(result < set.size()) result = set.size();
		}
		return result;
	}
}