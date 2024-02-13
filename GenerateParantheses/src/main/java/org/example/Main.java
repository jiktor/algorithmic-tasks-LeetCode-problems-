package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Solution.generateParenthesis(7);
	}

	static class Solution {
		public static List<String> generateParenthesis(int n) {
			Stack<String> result = new Stack<>();
			Stack<String>current = new Stack<>();
			current.add("(");

			result = backTracking(n,result,current,1,0);
			while (!result.empty()){
				System.out.println(result.pop());
			}
			return result;
		}
		public static Stack<String> backTracking(int n,
												Stack<String>result,
												Stack<String>current,
												int openingBrackets,
												int closingBrackets){
			if(openingBrackets==closingBrackets && openingBrackets == n){
				Iterator<String> iterator = current.iterator();
				String resultToBeAdded = "";
				while (iterator.hasNext()) {
					resultToBeAdded += iterator.next();
				}
				result.push(resultToBeAdded);
			}
			if(openingBrackets>closingBrackets && openingBrackets<=n){
				current.push(")");
				backTracking(n,result,current,openingBrackets,closingBrackets+1);
				current.pop();
			}
			if(openingBrackets<=n){
				current.push("(");
				backTracking(n,result,current,openingBrackets+1,closingBrackets);
				current.pop();
			}
			return result;
		}
	}
}