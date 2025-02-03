package leetCode.fastslowpointers;

public class cycliclinkedlistlength {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = l1.next.next.next.next;
        cyclelinkedhelper(l1);
    }

    static void cyclelinkedhelper(ListNode l1) {
        ListNode slowpointer = l1;
        ListNode fastpointer = l1;
        while (fastpointer != null && fastpointer.next != null) {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
            if(slowpointer == fastpointer) {
                System.out.println(lengthhelper(slowpointer));
                break;
            }
        }
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
}
