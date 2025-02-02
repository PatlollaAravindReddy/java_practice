package leetCode.fastslowpointers;

class ListNode {

    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
public class cycliclinkedlist {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
       // l1.next.next.next.next.next.next = l1.next.next.next.next;
        cyclelinkedhelper(l1);
    }

    static void cyclelinkedhelper(ListNode l1) {
        ListNode slowpointer = l1;
        ListNode fastpointer = l1;
        while (slowpointer.next!=null && fastpointer.next.next!=null && slowpointer.next != fastpointer.next.next) {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
        }
        if(slowpointer.next==null && fastpointer.next.next==null) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
//        while (l1 != null) {
//            System.out.println(l1.value);
//            l1 = l1.next;
//        }
    }
}
