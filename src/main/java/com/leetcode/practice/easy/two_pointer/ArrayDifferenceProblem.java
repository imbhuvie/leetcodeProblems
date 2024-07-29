package com.leetcode.practice.easy.two_pointer;

public class ArrayDifferenceProblem {
    //Yet Not Done.
    /*
    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

    i < j < k,
    nums[j] - nums[i] == diff, and
    nums[k] - nums[j] == diff.
    Return the number of unique arithmetic triplets.
        Constraints:

                3 <= nums.length <= 200
                0 <= nums[i] <= 200
                1 <= diff <= 50
        nums is strictly increasing.
        */
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (findElementInArray(nums, i + 1, (nums[i] + diff))) {
                if (findElementInArray(nums, i + 2, (nums[i] + (2 * diff)))) {
                    count++;
                } else i++;
            }
        }
        return count;
    }

    public boolean findElementInArray(int[] nums, int index, int target) {
        int start = index;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
