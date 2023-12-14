package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		System.out.println(Solution.isValid("{}[]{{}}(){(})"));
	}
	class Solution {
		public static boolean isValid(String s) {
			if(s.length()%2!=0) return false;
			//list which stores the opening paranthese
			List<Character>list = new ArrayList<>();
			//map containing matching paranthese
			Map<Character,Character>map = new HashMap<>(){{
				put(')','(');
				put('}','{');
				put(']','[');
			}};
			//looping the string
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				//adding to list if current char is opening parathes
				if(c == '(' || c == '[' || c == '{'){
					list.add(c);
				}else{
					if(list.size()==0) return false;
					//if the current char is closing paranthes => check if it match last opening paranthes
					if(list.get(list.size()-1)!=map.get(s.charAt(i))){
						return false;
					}else{
						list.remove(list.size()-1);
					}
				}
			}
			//if opening paranthes != closing paranthes => list.size!=0
			if(list.size() != 0){
				return false;
			} else{
				return true;
			}
		}
	}
}