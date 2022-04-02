package com.github.fares.youssef.leetcode;

import java.util.HashSet;

public class ContainsDuplicates {

	public boolean containsDuplicate(int[] nums) {
		var lookup = new HashSet<Integer>();

		for (int i : nums) {
			if (lookup.contains(i)) {
				return true;
			}
			lookup.add(i);
		}

		return false;
	}

}
