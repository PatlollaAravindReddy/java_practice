package dsa.treespractice.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binarytreelevelorder_107 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.right.left = new TreeNode(4);
        tn.right.right = new TreeNode(5);
        orderHelper(tn);
    }

    static void orderHelper(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        List<List<Integer>> ll = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> ll2 = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    ll2.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
                size--;
            }
            if (ll2.size() > 0) {
                ll.add(0, ll2);
            }
        }
    }
}
