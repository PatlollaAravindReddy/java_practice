package leetCode;

public class MiddleOfLinkedList_876 {
    public static void main(String[] args) {
        palindromeLL head = new palindromeLL(1);
        head.next = new palindromeLL(2);
        head.next.next = new palindromeLL(2);
        head.next.next.next = new palindromeLL(2);
        head.next.next.next.next = new palindromeLL(1);
        middleElement(head);
    }

    public static void middleElement(palindromeLL head) {
        int size = 0;
        palindromeLL headMock = head;
        while(headMock != null) {
            size++;
            headMock = headMock.next;
        }
        for(int i = 0; i < size/2; i++) {
            head = head.next;
        }
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
