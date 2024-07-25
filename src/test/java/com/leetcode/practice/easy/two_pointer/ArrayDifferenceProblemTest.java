package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class ArrayDifferenceProblemTest extends TestCase {
    ArrayDifferenceProblem arrayDifferenceProblem = new ArrayDifferenceProblem();

    public void testArithmeticTriplets() {
        assertEquals(2, arrayDifferenceProblem.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }
}