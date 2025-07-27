package Trees;

import utilities.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetricHelper(root.left, root.right);

    }

    private boolean isSymmetricHelper(TreeNode node1, TreeNode node2) {
        if(node1 == null || node2 == null){
            return node1 == node2;
        }

        return (node1.val == node2.val)
                && isSymmetricHelper(node1.left, node2.right)
                && isSymmetricHelper(node1.right, node2.left);

    }
}
