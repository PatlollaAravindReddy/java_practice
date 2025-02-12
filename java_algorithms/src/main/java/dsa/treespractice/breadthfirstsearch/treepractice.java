package dsa.treespractice.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    void display(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        while(!queue.isEmpty()) {
            int levelsize = queue.size();
            while(levelsize > 0) {
                TreeNode node = queue.poll();
                System.out.println(node.val + " ");
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                levelsize--;
            }
            System.out.println();
        }
    }
}
public class treepractice {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(10);
        tn.left = new TreeNode(11);
        tn.right = new TreeNode(12);
        tn.left.left = new TreeNode(13);
        tn.left.right = new TreeNode(14);
        tn.display(tn);
    }
}
