package practise;

public class linkedListPract {

    private int value;

    private Node head;

    private Node tail;

    private int size;

    public void addFirst(int value) {
        Node node = new Node(value);
        Node temp = head;
        if(head == null) {
            tail = node;
        }
        head = node;
        head.next = temp;
        size++;
    }

    public void display() {
        Node node = head;
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
