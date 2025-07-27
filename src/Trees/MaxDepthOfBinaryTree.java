package Trees;

import utilities.TreeNode;

public class MaxDepthOfBinaryTree {

    public static Integer maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        //left
        int leftHeight = maxDepth(root.left);

        //right
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
