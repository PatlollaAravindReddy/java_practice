package dsa.treespractice.breadthfirstsearch;

import java.util.*;

public class zigzagtraversal_103 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(17);
        zigzagHelper(tn);
    }

    static void zigzagHelper(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        int level = 0;
        List<List<Integer>> ll = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> ll2 = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                if(node != null) {
                    if(level % 2 == 0) {
                        ll2.add(node.val);
                    } else {
                        ll2.add(0, node.val);
                    }
                    queue.add(node.left);
                    queue.add(node.right);
                }
                size--;
            }
            if(ll2.size() > 0) {
                ll.add(ll2);
            }
            level++;
        }
        ll.stream().forEach(n -> System.out.println(n));
    }
}
