package org.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int [] arr = {1,2,2,2,3,4,4,5,6,6,6,6,7};
		System.out.println(Arrays.toString(Solution.searchRange(arr,4)));
	}
}
class Solution {
	public static int[] searchRange(int[] nums, int target) {
		return new int[]{binarySearch(nums,target,true),binarySearch(nums,target,false)};
	}
	//if left true => searching for first index else searching for last
	public static int binarySearch(int nums[],int target, boolean leftBool){
		int left = 0;
		int right = nums.length-1;
		int result = -1;
		while(right >= left){
			int middle = (left+right)/2;
			if(target > nums[middle]){
				left = middle+1;
			}else if(target < nums[middle]){
				right = middle-1;
			}else{
				result = middle;
				if(leftBool){
					right = middle -1;
				}else{
					left = middle +1;
				}
			}
		}
		return result;
	}
}