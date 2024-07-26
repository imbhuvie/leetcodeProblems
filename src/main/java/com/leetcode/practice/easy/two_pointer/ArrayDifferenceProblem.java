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

        for (int i = nums.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] - nums[j] == diff) {
                    for (int k = j - 1; k >= 0; k--) {
                        if (nums[j] - nums[k] == diff)
                            count++;
                    }
                }
            }
        }

        return diff;
    }
}
