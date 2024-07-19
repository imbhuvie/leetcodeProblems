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
}
class LinkedList{
    int data;
    LinkedList next;
}