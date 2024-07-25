package com.leetcode.practice.easy.binary_search;

//35. Search Insert Position

import java.lang.reflect.Array;

public class SearchInsertElement {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int start = 0;
        int end = nums.length - 1;

        if(nums.length <=1){
            if(nums.length==0 ||nums[0]>=target) return 0;
            else return 1;
        }
        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }



        }
            return start;
    }
}
