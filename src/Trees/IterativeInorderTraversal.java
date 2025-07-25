package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> traversalList = new ArrayList<>();

        if(root == null){
            return traversalList;
        }

        TreeNode node = root;
        Stack<TreeNode> st = new Stack<>();

        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }else{
                if(!st.isEmpty()){
                    TreeNode stNode = st.pop();
                    traversalList.add(stNode.val);
                    node = stNode.right;
                }else{
                    break;
                }
            }
        }
        return traversalList;
    }
}
