package dsa.treespractice.depthfirstsearch;


import dsa.treespractice.breadthfirstsearch.TreeNode;

import java.util.Stack;

public class pathsum_112 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.left.right = new TreeNode(5);
        int sum = 7;
        System.out.println(pathsumHelper(tn, sum));
    }

    static boolean pathsumHelper(TreeNode tn, int sum) {
        if(tn == null) {
            return false;
        }

        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> sumst = new Stack<>();
        st.add(tn);
        sumst.add(tn);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            int node1 = sumst.pop().val;

            if(node.left == null && node.right == null && node1 == sum) {
                return true;
            }

            if(node.right != null) {
                st.add(node.right);
                sumst.add(new TreeNode(node.right.val + node1));
            }

            if(node.left != null) {
                st.add(node.left);
                sumst.add(new TreeNode(node.left.val + node1));
            }
        }
        return false;
    }
}
