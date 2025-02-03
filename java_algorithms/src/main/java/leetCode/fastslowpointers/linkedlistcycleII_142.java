package leetCode.fastslowpointers;

public class linkedlistcycleII_142 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = l1.next.next.next;
        System.out.println(cyclelinkedhelper(l1).value);
    }

    static ListNode cyclelinkedhelper(ListNode l1) {
        int count = 0;
        ListNode slowpointer = l1;
        ListNode fastpointer = l1;
        while (fastpointer != null && fastpointer.next != null) {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
            if(slowpointer == fastpointer) {
                count = lengthhelper(slowpointer);
                return linkedlisthelper(l1, count);
            }
        }
        return null;
    }

    static int lengthhelper(ListNode slow) {
        ListNode current = slow;
        int count = 0;
        do {
            current = current.next;
            count++;
        }
        while(current != slow);
        return count;
    }

    static ListNode linkedlisthelper(ListNode l1, int count) {
        ListNode pointer1 = l1;
        ListNode pointer2 = l1;
        int i = 0;
        while(i != count) {
            pointer2 = pointer2.next;
            i++;
        }
        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}