package practise;

public class LinkedListpractise {
    public static void main(String[] args) {
        linkedListPract ll = new linkedListPract();
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(16);
        ll.addFirst(32);
        ll.addFirst(64);
        ll.display();
        System.out.println("-----------");
        ll.reverse();
        ll.display();
    }
}
