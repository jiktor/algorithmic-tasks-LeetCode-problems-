package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,4,3,7,2};
		int target = 6;
		System.out.println(Arrays.toString(Solution.twoSum(arr,target)));
	}
}
class Solution {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int i = 0; i<nums.length;i++){
			int goal = target - nums[i];
			if(map.get(goal)!=null && map.get(goal)!=i)  return new int[]{i,map.get(goal)};
		}
		return new int[]{};
	}
}
