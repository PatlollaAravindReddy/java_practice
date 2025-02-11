package leetCode.linkedlist;

import java.util.List;

class ListNode {
    int value;

    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    void display(ListNode ll) {
        while(ll != null) {
            System.out.println(ll.value);
            ll = ll.next;
        }
    }
}
public class linkedlistreverse {
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        ll.next.next.next.next.next = new ListNode(6);
        //ll.display(ll);
        ListNode result = reverseHelper(ll);
        ll.display(result);
    }

    static ListNode reverseHelper(ListNode ll) {
        ListNode prev = null;
        ListNode current = ll;
        while(current != null) {
            ListNode currentNext = current.next;
            current.next = prev;
            prev = current;
            current = currentNext;
        }
        return prev;
    }
}
