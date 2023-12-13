package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.convert("HelloFromMain",4));
	}
}

class Solution {
	public static String convert(String s, int numRows) {
		if(numRows == 1) return s;
		String result = "";
		//iterating rows
		for (int r =0;r<numRows;r++){
			//distance for every jump
			int increment = 2*(numRows-1);
			//first and last rows
			for(int i=r;i<s.length();i+=increment){
				result += s.charAt(i);
				//rows with diagonal elements
				if(r>0 && r<numRows-1 &&
						(i+increment -2*r)<s.length()){
					result += s.charAt(i + increment - 2*r);
				}
			}

		}  return result;
	}
}