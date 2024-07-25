package com.leetcode.practice.easy.two_pointer;

public class MinimumAverage {
    public double minimumAverage(int[] nums) {
        // To sort the array nums
        int temp;
        double sm_avg = Double.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // to find minimum average of smallest and largest number in the array.
        double[] avg_arr = new double[nums.length / 2];
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            avg_arr[i] = (nums[i] + nums[j]) / 2.0;
            if (sm_avg > avg_arr[i]) {
                sm_avg = avg_arr[i];
            }
            i++;
            j--;

        }

        return sm_avg;

    }
}
