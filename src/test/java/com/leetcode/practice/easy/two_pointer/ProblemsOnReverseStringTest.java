package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class ProblemsOnReverseStringTest extends TestCase {

    ProblemsOnReverseString problemsOnReverseString =new ProblemsOnReverseString();
    public void testReversePrefix() {
        assertEquals("dcbaef",problemsOnReverseString.reversePrefix("abcdef",'d'));
        assertEquals("zxyxxe",problemsOnReverseString.reversePrefix("xyxzxe",'z'));
        assertEquals("abcd",problemsOnReverseString.reversePrefix("abcd",'z'));

    }
}