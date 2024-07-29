package com.leetcode.practice.easy.two_pointer;

import java.util.Arrays;

//1346. Check If N and Its Double Exist
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class IntegerArrayProblem {
    public static void main(String[] args) {
        IntegerArrayProblem integerArrayProblem = new IntegerArrayProblem();
        integerArrayProblem.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8});
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (findElementInArray(arr)) {
                return true;
            }
        }
        return false;
    }

    public boolean findElementInArray(int[] nums) {
        int index = 0;
        int targetDouble = nums[index] * 2;
        int start, end, mid;
        if (nums[index] < 0) {
            start = 0;
            end = index - 1;

        } else {
            start = index + 1;
            end = nums.length - 1;
        }
        while (start <= end) {
            if (nums[index] < 0) {
                start = 0;
                end = index - 1;

            } else {
                start = index + 1;
                end = nums.length - 1;
            }
            mid = (start + end) / 2;
            if (nums[mid] == targetDouble)
                return true;
            else if (nums[mid] < targetDouble) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            index++;
        }
        return false;
    }
}