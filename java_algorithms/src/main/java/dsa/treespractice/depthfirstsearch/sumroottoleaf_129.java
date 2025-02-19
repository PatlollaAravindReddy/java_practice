package dsa.treespractice.depthfirstsearch;

import dsa.treespractice.breadthfirstsearch.TreeNode;

import java.util.Stack;

public class sumroottoleaf_129 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        System.out.println(sumHelper(tn));
    }

    static int sumHelper(TreeNode tn) {
        if(tn == null) {
            return 0;
        }
        int sum = 0;
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> sumst = new Stack<>();
        st.add(tn);
        sumst.add(tn.val);
        while (! st.isEmpty()) {
            TreeNode node = st.pop();
            Integer total = sumst.pop();
            if(node.left == null && node.right == null) {
                sum = sum + total;
            }

            if(node.left != null) {
                st.add(node.left);
                sumst.add((total * 10) + node.left.val);
            }

            if(node.right != null) {
                st.add(node.right);
                sumst.add((total * 10) + node.right.val);
            }
        }
        return sum;
    }
}
