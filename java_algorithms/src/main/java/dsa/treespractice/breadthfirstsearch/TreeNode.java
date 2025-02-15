package dsa.treespractice.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;

    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    ;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    void display(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            while (levelsize > 0) {
                TreeNode node = queue.poll();
                System.out.println(node.val + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                levelsize--;
            }
            System.out.println();
        }
    }
}
