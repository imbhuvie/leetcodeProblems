package slow_fast_pointer;

import junit.framework.TestCase;

public class LengthOfLinkedListTest extends TestCase {
    LengthOfLinkedList lengthOfLinkedList=new LengthOfLinkedList();

    public void testLengthOfList() {
        LinkedList ls=new LinkedList();
        ls.data=10;
        LinkedList ls0=new LinkedList();
        ls0.data=20;
        ls.next=ls0;
        LinkedList ls1=new LinkedList();
        ls1.data=30;
        ls0.next=ls1;
        assertEquals(3, lengthOfLinkedList.lengthOfList(ls));
        LinkedList lss=new LinkedList();
        lss.data=10;
        LinkedList lss0=new LinkedList();
        lss0.data=20;
        lss.next=lss0;
        LinkedList lss1=new LinkedList();
        lss1.data=30;
        lss0.next=lss1;
        LinkedList lss2=new LinkedList();
        lss2.data=40;
        lss1.next=lss2;
        assertEquals(4, lengthOfLinkedList.lengthOfList(lss));
    }

}