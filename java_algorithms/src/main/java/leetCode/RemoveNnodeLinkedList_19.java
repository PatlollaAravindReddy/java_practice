package leetCode;

public class RemoveNnodeLinkedList_19 {
    public static void main(String[] args) {
        palindromeLL head = new palindromeLL(1);
        head.next = new palindromeLL(2);
        head.next.next = new palindromeLL(3);
        head.next.next.next = new palindromeLL(4);
        head.next.next.next.next = new palindromeLL(5);
        int no = 4;
        //removeNnode(head, no);
        removeNnode2(head, no);
    }

    public static void removeNnode2(palindromeLL head, int no) {
        palindromeLL fast = head;
        palindromeLL slow = head;
        for(int i = 0; i< no; i++) {
            fast = fast.next;
        }
        if(fast == null) {
            //return head.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        //return head;
    }
    public static void removeNnode(palindromeLL head, int no) {
        palindromeLL head2 = head;
        int size = 0;
        while(head2 != null) {
            size++;
            head2 = head2.next;
        }
        palindromeLL head3 = head;
        for(int i = 0; i <= size - no; i++) {
            if(i == size - no - 1) {
                    head3 = head3.next;
            }
            head3 = head3.next;
        }
        if(size == no) {
            //return head.next;
        }
    }
}
