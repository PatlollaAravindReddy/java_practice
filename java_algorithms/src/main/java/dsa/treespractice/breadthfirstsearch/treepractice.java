package dsa.treespractice.breadthfirstsearch;

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
