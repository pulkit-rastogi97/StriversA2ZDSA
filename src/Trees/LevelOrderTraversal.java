package Trees;

import utilities.TreeNode;

import java.util.*;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> resultList = new ArrayList<>();

        if(root == null){
            return resultList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevelList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                currentLevelList.add(node.getData());
            }
            resultList.add(currentLevelList);
        }

        return resultList;
    }

}
