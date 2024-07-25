package com.leetcode.practice.easy.binary_search;

import junit.framework.TestCase;

public class BinarySearchTest extends TestCase {

    BinarySearch binarySearch = new BinarySearch();

    public void testFindElementInArray() {
        int[] nums = new int[]{};
        assertEquals(-1, binarySearch.findElementInArray(nums, 9));
        int[] nums0 = new int[]{1};
        assertEquals(0, binarySearch.findElementInArray(nums0, 1));
        int[] nums1 = new int[]{2, 4, 6, 9, 10};
        assertEquals(0, binarySearch.findElementInArray(nums1, 2));
        assertEquals(4, binarySearch.findElementInArray(nums1, 10));
    }
}