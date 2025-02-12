package dsa.treespractice.breadthfirstsearch;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageoflevels_637 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.left.right = new TreeNode(5);
        averageHelper(tn);
    }

    static void averageHelper(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        List<Double> ll = new ArrayList<>();
        while(!queue.isEmpty()) {
            int size = queue.size();
            int size2 = queue.size();
            double sum = 0;
            while (size > 0) {
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            ll.add(sum / size2);
        }
        ll.stream().forEach(n -> System.out.println(n));
    }
}
