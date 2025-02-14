package dsa.treespractice.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class minimumdepthofbinarytree_111 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.left.right = new TreeNode(5);
        System.out.println(depthHelper(tn));
    }

    static int depthHelper(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        int level = 0;
        if(tn == null) {
            return level;
        }

        while(!queue.isEmpty()) {
            int size = queue.size();
            level = level + 1;
            while (size > 0) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) {
                    return level;
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
        }
        return -1;
    }
}
