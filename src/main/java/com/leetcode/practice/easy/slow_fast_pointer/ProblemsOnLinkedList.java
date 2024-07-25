package com.leetcode.practice.easy.slow_fast_pointer;
//To find length of LinkedList.
public class ProblemsOnLinkedList {
            public int lengthOfLinkedList(LinkedList list){
                LinkedList slow,fast;
                slow=fast=list;
                if(list==null)
                    return 0;
                int count = 1;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    count+=2;
                }
                // If the list length is even, fast will be null at the end.
                if (fast == null) {
                    count--;
                }
                return count;
            }
}
