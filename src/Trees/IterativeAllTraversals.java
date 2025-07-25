package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair{
    TreeNode node;
    Integer number;

    public Pair(TreeNode node, Integer number){
        this.node = node;
        this.number = number;
    }

}

public class IterativeAllTraversals {

    public static List<List<Integer>> allTraversals(TreeNode root){
        List<List<Integer>> traversalList = new ArrayList<>();
        if(root == null){
            return traversalList;
        }

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        while(!st.isEmpty()){
            Pair pair = st.peek();
            if(pair.number == 1){
                preorder.add(pair.node.val);
                pair.number++;
                if(pair.node.left != null){
                    st.push(new Pair(pair.node.left, 1));
                }
            }
            if(pair.number == 2){
                inorder.add(pair.node.val);
                pair.number++;
                if(pair.node.right != null){
                    st.push(new Pair(pair.node.right, 1));
                }
            }
            if(pair.number == 3){
                postorder.add(pair.node.val);
                st.pop();
            }
        }
        traversalList.add(preorder);
        traversalList.add(inorder);
        traversalList.add(postorder);
        return traversalList;
    }
}
