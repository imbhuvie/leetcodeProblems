package com.leetcode.practice.easy.slow_fast_pointer;

import junit.framework.TestCase;

import java.util.Arrays;

public class ProblemsOnLinkedListTest extends TestCase {
    ProblemsOnLinkedList problemsOnLinkedList=new ProblemsOnLinkedList();
    public void testLengthOfLinkedList() {
        LinkedList list =new LinkedList();
//        list.data=1;
        assertEquals(0,problemsOnLinkedList.lengthOfLinkedList(list));
    }
}