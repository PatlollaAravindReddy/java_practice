package leetCode.linkedlist;

import java.util.List;

public class reverselinkedlist_92 {
    public static void main(String[] args) {
        ListNode ll = new ListNode(3);
        ll.next = new ListNode(5);
        int left = 1;
        int right = 2;
        ListNode result = reverseHelperll(ll, left, right);
        ll.display(result);
    }

    static ListNode reverseHelperll(ListNode ll, int left, int right) {
        ListNode ll2 = ll;
        ListNode curr = null;
        for(int i = 0; i < left - 1; i++) {
            curr = ll;
            ll = ll.next;
        }

        ListNode prev = null;
        ListNode current = ll;
        ListNode currentlast = ll;
        ListNode currentNext = null;
        for(int j = 0 ; j < right - left + 1 && current != null; j++) {
                currentNext = current.next;
                current.next = prev;
                prev = current;
                current = currentNext;
        }

        //ll.next = prev;
        currentlast.next = current;
        if(curr != null) {
            curr.next = prev;
        } else {
            curr = prev;
            return curr;
        }


        return ll2;
    }
}
