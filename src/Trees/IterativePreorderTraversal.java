package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> traversalList = new ArrayList<>();

        if(root == null){
            return traversalList;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){

            TreeNode node = st.pop();
            if(node.right != null){
                st.push(node.right);
            }

            if(node.left != null){
                st.push(node.left);
            }
            traversalList.add(node.val);
        }

        return traversalList;
    }
}
