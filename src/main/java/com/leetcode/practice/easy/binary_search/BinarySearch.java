package com.leetcode.practice.easy.binary_search;

public class BinarySearch {
    public int findElementInArray(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        if(nums.length==0)
            return -1;
        if(nums.length==1 && nums[0]==target)
            return 0;
        if(nums.length==1&&nums[0]!=target)
            return -1;

        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
