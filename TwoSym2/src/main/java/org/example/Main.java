package org.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Solution.twoSum(new int[]{2,7,11,15},9)));
	}


	class Solution {
		public static int[] twoSum(int[] numbers, int target) {
			int lIndex = 0;
			int rIndex = numbers.length-1;

			while(true){
				if((numbers[lIndex] + numbers[rIndex]) == target){
					return new int[]{lIndex+1 , rIndex+1};
				}else if((numbers[lIndex] + numbers[rIndex]) > target){
					rIndex--;
				}else if((numbers[lIndex] + numbers[rIndex]) < target){
					lIndex++;
				}
			}
		}
	}
}