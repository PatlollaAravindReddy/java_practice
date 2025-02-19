package dsa.treespractice.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class populatingnextrightpointers_116 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
//        node.left.left = new Node(4);
//        node.left.right = new Node(5);
//        node.right.left = new Node(6);
//        node.right.right = new Node(7);
        nextpointerHelper(node);
    }

    static void nextpointerHelper(Node node) {
        Node result = null;
        Node result2 = result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            while (queueSize > 0) {
                Node node1 = queue.poll();
                if(result == null) {
                    result = node1;
                    result2 = result;
                } else {
                    result.next = node1;
                    result = result.next;
                }
                if(node1 != null && node1.left != null) {
                    queue.add(node1.left);
                }
                if(node1 != null && node1.right != null) {
                    queue.add(node1.right);
                }
                queueSize--;
                if(result != null) {
                    result.next = new Node(8888);
                    result = result.next;
                }
            }

        }
        while (result2 != null) {
            System.out.println(result2.val);
            result2 = result2.next;
        }
    }
}
