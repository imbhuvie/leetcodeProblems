package com.leetcode.practice.easy.manipulation.bit;

import java.util.List;

public class BitManipulation {

//1342. Number of Steps to Reduce a Number to Zero
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if((num & 1)==0){
                num=num/2;
                count++;
            }
            if ((num&1)==1){
                num=num-1;
                count++;
            }
        }
        return count;
    }

//    2859. Sum of Values at Indices With K Set Bits
public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    int index=0;
    int sum=0;
        while(index<nums.size()){
            if(isBitHas(index,k)){
                sum+=nums.get(index);

            }
            index++;
    }
    return k;
}

    private boolean isBitHas(int index,int k) {
    String indexInBit=Integer.toBinaryString(index);
    int count=0;
    int i=0;
    while(i < indexInBit.length()){
        if(indexInBit.charAt(i)==49)
            count++;
        i++;
    }
        if(count==k)
            return true;
        return false;
    }



}
