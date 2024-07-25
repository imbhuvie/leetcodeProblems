package com.leetcode.practice.easy.binary_search;

import junit.framework.TestCase;

public class SearchInsertElementTest extends TestCase {
    SearchInsertElement searchInsertElement=new SearchInsertElement();

    public void testSearchInsert() {
        assertEquals(1,searchInsertElement.searchInsert(new int[]{3},5));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));
        assertEquals(0,searchInsertElement.searchInsert(new int[]{2,7},1));
        assertEquals(2,searchInsertElement.searchInsert(new int[]{2,7},8));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));
        assertEquals(1,searchInsertElement.searchInsert(new int[]{2,7},4));

    }
}