package Trees;

import utilities.TreeNode;

public class CheckForBalancedBT {

    public static boolean isBalancedTree(TreeNode root){
        return dfsHeight(root) != -1;
    }

    public static int dfsHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = dfsHeight(node.left);
        int rightHeight = dfsHeight(node.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
