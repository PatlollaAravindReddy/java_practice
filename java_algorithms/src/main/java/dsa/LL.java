package dsa;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = node;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if(size == 0) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if(size == 0) {
            insertFirst(value);
        }
        if(size + 1 == index) {
            insertLast(value);
        }
        Node temp = head;
        int i =0;
        while(i != index - 1) {
            temp = temp.next;
            i++;
        }
        Node tempNode = new Node(value, temp.next);
        temp.next = tempNode;
        size++;
    }

    public void deleteFirst() {
        Node node = head;
        head = node.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        for(int i = 0;i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        if(size == 0) {
            deleteFirst();
            return;
        }
        if(size == index) {
            deleteLast();
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 2; i++) {
            temp = temp.next;
        }
        Node tempNode = temp.next;
        temp.next = tempNode.next;
        size--;
    }

    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
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
