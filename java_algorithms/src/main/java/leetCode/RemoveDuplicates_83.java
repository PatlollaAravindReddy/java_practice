package leetCode;

class node {
    int val;
    node next;
    node() {}
    node(int val) { this.val = val; }
    node(int val, node next) { this.val = val; this.next = next; }
}

public class RemoveDuplicates_83 {
    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(1);
        head.next.next = new node(2);
        head.next.next.next = new node(3);
        head.next.next.next.next = new node(3);

        deleteDuplicates(head);
    }

    public static void deleteDuplicates(node head) {
        node temp = head;
        while (temp != null && temp.next !=null) {
            while(temp.next !=null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
}
