package org.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int [] arr = new int[]{1,8,6,2,5,4,8,3,7};
		System.out.println(Solution.maxArea(arr));
	}

	class Solution {
		public static int maxArea(int[] height) {
			int leftIndex = 0;
			int rightIndex = height.length-1;
			int result =0;
			while(leftIndex != rightIndex){
				if(height[rightIndex] > height[leftIndex]){
					if(height[leftIndex]*(rightIndex-leftIndex)>result){
						result = height[leftIndex]*(rightIndex-leftIndex);
					}
					leftIndex++;
				}else{
					if(height[rightIndex]*(rightIndex-leftIndex)>result){
						result = height[rightIndex]*(rightIndex-leftIndex);
					}
					rightIndex--;
				}
			}
			return result;
		}
	}
}