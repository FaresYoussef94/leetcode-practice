package com.github.fares.youssef.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		var result = new int[2];

		var lookup = new HashMap<Integer, Integer>();
		
		for(int i = 0; i <= nums.length-1; i++) {
			int currentNum = nums[i];
			int neededNum = target - currentNum;
			if(lookup.containsKey(neededNum)) {
				result[0] = lookup.get(neededNum);
				result[1] = i;
				return result;
			}
			lookup.put(currentNum, i);
		}

		return result;
	}

	public static void main(String... strings) {
		/*
		 * [-1,-2,-3,-4,-5] -8
		 */

		int[] arr = { -1, -2, -3, -4, -5 };
		int target = -8;

		System.out.println(twoSum(arr, target));
	}
}
