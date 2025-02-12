package dsa.treespractice.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class sametree_100 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        TreeNode tn2 = new TreeNode(1);
        tn2.left = new TreeNode(2);
        System.out.println(sametreehelper(tn, tn2));
    }

    static boolean sametreehelper(TreeNode p, TreeNode q) {
        Queue<TreeNode> pqueue = new LinkedList<>();
        pqueue.add(p);
        pqueue.add(q);
        while(!pqueue.isEmpty()) {
            TreeNode first = pqueue.poll();
            TreeNode second = pqueue.poll();

            if(first == null && second == null) {
                continue;
            } else if(first == null || second == null || first.val != second.val ) {
                return false;
            }

            pqueue.add(first.left);
            pqueue.add(second.left);
            pqueue.add(first.right);
            pqueue.add(second.right);
        }
        return true;
    }
}
