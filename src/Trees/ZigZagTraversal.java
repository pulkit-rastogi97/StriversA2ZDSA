package Trees;

import utilities.TreeNode;

import java.util.*;

public class ZigZagTraversal {

    public static List<List<Integer>> zigZagTraversal_V1(TreeNode root){
        List<List<Integer>> traversalList = new ArrayList<>();
        if(root == null){
            return traversalList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                if(nodeLeft != null){
                    queue.offer(nodeLeft);
                }
                if(nodeRight != null){
                    queue.offer(nodeRight);
                }
                levelList.add(node.val);
            }
            if(!leftToRight){
                Collections.reverse(levelList);
            }
            traversalList.add(levelList);
            leftToRight = !leftToRight;
        }
        return traversalList;
    }

    //Will have more complexity, as it moves the element to the right, if we add at a specified index.
    public static List<List<Integer>> zigZagTraversal_V2(TreeNode root){
        List<List<Integer>> traversalList = new ArrayList<>();
        if(root == null){
            return traversalList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }

                //fill at specified index according to the traversal
                //int index = leftToRight ? i : (size - 1 - i);
                //levelList.add(index, node.val);
            }
            traversalList.add(levelList);
            leftToRight = !leftToRight;
        }
        return traversalList;
    }

}
