package com.leetcode.practice.easy.binary_search;
//To find frequency of target element.
    public class OccuranceOfElement {
        public int frequencyCount(int[] nums,int target){
            int start=0;
            int end=nums.length-1;
            int mid;
            if(nums.length==0)
                return 0;
            if(nums.length==1 && nums[0]==target){
                return 1;
            }
            while(start<=end){
                mid=(start+end)/2;
                if(nums[mid]==target)
                    return getCount(nums,mid,target);
                else if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return 0;
        }

        private int getCount(int[] nums, int mid, int target) {
            int start=mid;
            int end=mid;
            int count=1;
            while( start>=0 || end<nums.length){
                    start--;
                    end++;

                if(start>=0 && nums[start]==target){
                    count++;
                }
                if(end<nums.length && nums[end]==target){
                    count++;
                }

            }
            return count;
        }

    }
