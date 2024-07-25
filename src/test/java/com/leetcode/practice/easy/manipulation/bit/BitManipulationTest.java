package com.leetcode.practice.easy.manipulation.bit;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitManipulationTest extends TestCase {
BitManipulation bitManipulation=new BitManipulation();
    public void testNumberOfSteps() {

        assertEquals(6,bitManipulation.numberOfSteps(14));
        assertEquals(4,bitManipulation.numberOfSteps(8));
        assertEquals(12,bitManipulation.numberOfSteps(123));
    }

    public void testSumIndicesWithKSetBits() {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(2);
        assertEquals(13,bitManipulation.sumIndicesWithKSetBits(list,1));
    }
}