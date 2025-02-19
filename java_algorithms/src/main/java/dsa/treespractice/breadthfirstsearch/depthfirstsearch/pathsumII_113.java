package dsa.treespractice.breadthfirstsearch.depthfirstsearch;

import com.sun.source.tree.Tree;
import dsa.treespractice.breadthfirstsearch.TreeNode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class pathsumII_113 {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.left.right = new TreeNode(5);
        tn.right.right = new TreeNode(3);
        int sum = 7;
        pathsumHelper(tn, sum).forEach(n -> System.out.println(n));
    }

    static List<List<Integer>> pathsumHelper(TreeNode tn, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(tn == null) {
            return result;
        }
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> stSum = new Stack<>();
        Stack<ArrayList<Integer>> stArr = new Stack<>();
        st.add(tn);
        stSum.add(tn);
        stArr.add(new ArrayList<>(Arrays.asList(tn.val)));
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            int total = stSum.pop().val;
            ArrayList<Integer> all = new ArrayList<>(stArr.peek());
            ArrayList<Integer> alr = stArr.pop();

            if(node.left == null && node.right == null && total == sum) {
                result.add(all);
            }

            if(node.left != null) {
                st.add(node.left);
                stSum.add(new TreeNode(total + node.left.val));
                all.add(node.left.val);
                stArr.add(all);
            }

            if(node.right != null) {
                st.add(node.right);
                stSum.add(new TreeNode(total + node.right.val));
                alr.add(node.right.val);
                stArr.add(alr);
            }
        }
        return result;
    }
}
