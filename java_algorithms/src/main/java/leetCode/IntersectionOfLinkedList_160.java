package leetCode;

class Linkednode {
    int val;
    Linkednode next;
    Linkednode(int val) {
        this.val = val;
    }
    Linkednode(int val, Linkednode next) {
        this.val = val;
        this.next = next;
    }
}
public class IntersectionOfLinkedList_160 {
    public static void main(String[] args) {
        Linkednode head = new Linkednode(4);
        head.next = new Linkednode(1);
        head.next.next = new Linkednode(8);
        head.next.next.next = new Linkednode(4);
        head.next.next.next.next = new Linkednode(5);
        Linkednode head2 = new Linkednode(5);
        head2.next = new Linkednode(6);
        head2.next.next = new Linkednode(1);
        head2.next.next.next = new Linkednode(8);
        head2.next.next.next.next = new Linkednode(4);
        head2.next.next.next.next.next = new Linkednode(5);
        getIntersectionNode(head, head2);
    }

    public static void getIntersectionNode(Linkednode headA, Linkednode headB) {
        Linkednode temp = headA;
        Linkednode temp2 = headB;
        while (temp != null) {
            while(temp2 != null) {
                if(temp.val == temp2.val) {
                    Linkednode a = temp;
                    Linkednode b = temp2;
                    while(a!=null && b!=null) {
                        if(a == b) {
                            a = a.next;
                            b = b.next;
                        } else {
                            break;
                        }
                    }
                    if(a == null) {
                        System.out.println(temp.val);
                    }
                }
                temp2 = temp2.next;
            }
            temp2 = headB;
            temp = temp.next;
        }
    }
}
