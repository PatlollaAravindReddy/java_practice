package leetCode;

public class RemoveNnodeLinkedList_19 {
    public static void main(String[] args) {
        palindromeLL head = new palindromeLL(1);
        head.next = new palindromeLL(2);
        int no = 2;
        removeNnode(head, no);
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
