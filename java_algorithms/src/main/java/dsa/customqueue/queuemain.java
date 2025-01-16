package dsa.customqueue;

public class queuemain {
    public static void main(String[] args) {
        customqueue cq = new customqueue();
        cq.add(8);
        cq.add(12);
        cq.add(18);
        cq.add(10);
        cq.add(118);
        cq.add(120);
        cq.display();
        System.out.println("peek element - " + cq.peek());
        System.out.println("remove first element in queue");
        cq.remove();
        cq.display();
        System.out.println("peek element - " + cq.peek());
    }
}
