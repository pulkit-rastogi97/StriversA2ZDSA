package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundaryTraversal {

    public static List<Integer> boundaryTraversal(TreeNode root){
        List<Integer> traversalList = new ArrayList<>();

        if(root == null){
            return traversalList;
        }

        if(!isLeaf(root)){
            traversalList.add(root.val);
        }

        leftBoundary(root, traversalList);
        leafNodes(root, traversalList);
        rightBoundary(root, traversalList);
        return traversalList;
    }

    private static void rightBoundary(TreeNode root, List<Integer> traversalList) {
        TreeNode node = root.right;
        List<Integer> tempTraversalList = new ArrayList<>();

        if(node != null){
            while(!isLeaf(node)){
                tempTraversalList.add(node.val);

                if(node.right != null){
                    node = node.right;
                }else{
                    node = node.left;
                }
            }
        }

        //not optimized
//        traversalList.addAll(Collections.reverse(tempTraversalList));

        int n = tempTraversalList.size();
        for(int i = n - 1; i >= 0; i--){
            traversalList.add(tempTraversalList.get(i));
        }
    }

    private static void leafNodes(TreeNode root, List<Integer> traversalList) {

        if(isLeaf(root)){
            traversalList.add(root.val);
            return;
        }

        if(root.left != null){
            leafNodes(root.left, traversalList);
        }

        if(root.right != null){
            leafNodes(root.right, traversalList);
        }
    }

    private static void leftBoundary(TreeNode root, List<Integer> traversalList) {
       TreeNode node = root.left;

       if(node != null){
            //what if node is leaf node, only after checking that add it into list
            while(!isLeaf(node)){
                traversalList.add(node.val);

                if(node.left != null){
                    node = node.left;
                }else{
                    node = node.right;
                }
            }
       }
    }

    private static boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
