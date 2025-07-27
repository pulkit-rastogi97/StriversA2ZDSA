package Trees;

import utilities.TreeNode;

public class DiameterOfBT {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        calculateDiameter(root, diameter);
        return diameter[0];
    }

    private int calculateDiameter(TreeNode node, int[] diameter){
        if(node == null){
            return 0;
        }

        int leftHeight = calculateDiameter(node.left, diameter);
        int rightHeight = calculateDiameter(node.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
