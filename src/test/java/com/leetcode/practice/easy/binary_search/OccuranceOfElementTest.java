package com.leetcode.practice.easy.binary_search;

import junit.framework.TestCase;

public class OccuranceOfElementTest extends TestCase {

    OccuranceOfElement occuranceOfElement=new OccuranceOfElement();
    public void testFrequencyCount() {
        assertEquals(3,occuranceOfElement.frequencyCount(new int[]{1,2,2,2,3},2));
        assertEquals(1,occuranceOfElement.frequencyCount(new int[]{1,2,2,2,3},1));
        assertEquals(1,occuranceOfElement.frequencyCount(new int[]{1,2,2,2,3},3));
        assertEquals(2,occuranceOfElement.frequencyCount(new int[]{1,2,2,2,3,3},3));
        assertEquals(2,occuranceOfElement.frequencyCount(new int[]{1,1,2,2,2,3,3},1));
        assertEquals(0,occuranceOfElement.frequencyCount(new int[]{},3));
        assertEquals(0,occuranceOfElement.frequencyCount(new int[]{1,2,2,2,3,3},5));
        assertEquals(0,occuranceOfElement.frequencyCount(new int[]{1},3));
        assertEquals(1,occuranceOfElement.frequencyCount(new int[]{1},1));

    }


}