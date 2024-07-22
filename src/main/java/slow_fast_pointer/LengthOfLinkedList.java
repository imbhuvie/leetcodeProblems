package slow_fast_pointer;


public class LengthOfLinkedList {

            public int lengthOfList(LinkedList list){
                LinkedList slow,fast;
                slow=fast=list;
                if(slow==null)
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

//    public static void main(String[] args) {
//        LinkedList ls=new LinkedList();
//                ls.data=10;
//        LinkedList ls0=new LinkedList();
//        ls0.data=20;
//        ls.next=ls0;
//        LinkedList ls1=new LinkedList();
//        ls1.data=30;
//        ls0.next=ls1;
//        LinkedList ls2=new LinkedList();
//        ls2.data=40;
//        ls1.next=ls2;
//        LengthOfLinkedList lengthOfLinkedList=new LengthOfLinkedList();
//        int len=lengthOfLinkedList.lengthOfList(ls);
//        System.out.println(len);
//    }
//    new comments
}
class LinkedList{
    int data;
    LinkedList next;
}