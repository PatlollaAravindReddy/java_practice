package dsa;

public class LinkedListPractice {
    public static void main(String[] args) {
        LL llist = new LL();
        llist.insertFirst(2);
        llist.insertFirst(4);
        llist.insertLast(6);
        llist.insertLast(8);
        llist.insert(10, 2);
//        llist.deleteFirst();
//        llist.deleteLast();
//        llist.delete(2);
        llist.reverse();
        llist.display();
    }
}
