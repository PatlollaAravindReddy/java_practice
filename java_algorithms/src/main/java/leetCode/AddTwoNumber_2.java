package leetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumber_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;
        int carry = 0;
        while (l1 != null && l2 !=null) {
            int l3 = l1.val + l2.val + carry;
            carry = l3 / 10;
            current.next = new ListNode(l3 % 10);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int l3 = l1.val  + carry;
            carry = l3 / 10;
            current.next = new ListNode(l3 % 10);
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int l3 = l2.val  + carry;
            carry = l3 / 10;
            current.next = new ListNode(l3 % 10);
            current = current.next;
            l2 = l2.next;
        }
        if(carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyNode.next;
    }
}
