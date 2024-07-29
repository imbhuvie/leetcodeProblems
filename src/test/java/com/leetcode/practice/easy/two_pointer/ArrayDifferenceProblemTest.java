package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class ArrayDifferenceProblemTest extends TestCase {
    ArrayDifferenceProblem arrayDifferenceProblem = new ArrayDifferenceProblem();

    public void testTestArithmeticTriplets() {
        assertEquals(1, arrayDifferenceProblem.arithmeticTriplets(new int[]{80, 90, 100}, 10));
        assertEquals(1, arrayDifferenceProblem.arithmeticTriplets(new int[]{0, 10, 20}, 10));
    }
}