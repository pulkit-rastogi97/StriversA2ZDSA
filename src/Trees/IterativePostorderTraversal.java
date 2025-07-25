package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class IterativePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<Integer>();
        if(root == null){
            return traversalList;
        }
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(root);

        while(!st1.isEmpty()){
            TreeNode node = st1.pop();
            if(node.left != null){
                st1.push(node.left);
            }
            if(node.right != null){
                st1.push(node.right);
            }
            st2.push(node.val);
        }

        while(!st2.isEmpty()){
            traversalList.add(st2.pop());
        }
        return traversalList;
    }
}
