package leetCode;

class palindromeLL{
    int value;
    palindromeLL next;
    palindromeLL(int value) {
        this.value = value;
    }

    palindromeLL(int value, palindromeLL next) {
        this.value = value;
        this.next = next;
    }

}
public class PalindromeLinkedList_234 {
    public static void main(String[] args) {
        palindromeLL head = new palindromeLL(1);
        head.next = new palindromeLL(2);
        head.next.next = new palindromeLL(2);
        head.next.next.next = new palindromeLL(2);
        head.next.next.next.next = new palindromeLL(1);
        System.out.println(checkPalindrome(head));

    }

    public static boolean checkPalindrome(palindromeLL head) {
        int size = 0;
        palindromeLL headMock = head;
        while(headMock != null) {
            size++;
            headMock = headMock.next;
        }
        if(size == 1) {
            return true;
        }
        int divideSize = (size % 2 == 0) ? (size/2) : (size/2) + 1;
        palindromeLL head2 = head;
        palindromeLL head3 = head;
        for(int i = 0; i <= divideSize; i++) {
            if(i == divideSize) {
                head3 = head2;
            }
            head2 = head2.next;
        }
        int size2 = 0;
        palindromeLL current = head3;
        palindromeLL previous = null;
        palindromeLL next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            size2++;
        }
        head3 = previous;
        for(int i = 0; i < size2; i++) {
            if(head.value != head3.value) {
                return false;
            }
            head = head.next;
            head3 = head3.next;
        }
        return true;
    }
}
