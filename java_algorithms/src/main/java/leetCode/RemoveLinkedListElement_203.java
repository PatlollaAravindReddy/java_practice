package leetCode;

public class RemoveLinkedListElement_203 {
    public static void main(String[] args) {
        Linkednode head = new Linkednode(1);
        head.next = new Linkednode(2);
        head.next.next = new Linkednode(6);
        head.next.next.next = new Linkednode(4);
        head.next.next.next.next = new Linkednode(5);
        head.next.next.next.next.next = new Linkednode(6);
        int no = 6;
        removeElements(head, no);
    }

    public static void removeElements(Linkednode head, int val) {
        Linkednode headA = new Linkednode(0);

        Linkednode headB = headA;
        while(head != null) {
            if(head.val != val) {
                headA.next = head;
                headA = headA.next;
            }
            headA.next = null;
            head = head.next;
        }
    }
}
