package com.leetcode.practice.easy.two_pointer;

public class MovingElement {
    public static void main(String[] args) {
        MovingElement movingElement = new MovingElement();
        movingElement.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    /*    283. Move Zeroes
        Given an integer array , move all 's to the end of it while maintaining the relative order of the non-zero elements.nums0
        Note that you must do this in-place without making a copy of the array.
        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        */
    public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        printArray(nums);

    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    public void printArray(int[] nums) {

        for (int val : nums)
            System.out.print(val + " ");
        System.out.println();
    }


}
