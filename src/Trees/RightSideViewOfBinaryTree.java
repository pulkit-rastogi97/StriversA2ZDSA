package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class RightSideViewOfBinaryTree {

    static class Plot{
        TreeNode node;
        Integer level;

        public Plot(TreeNode node, Integer level){
            this.node = node;
            this.level = level;
        }
    }

    static ArrayList<Integer> rightSideView_BFS(TreeNode root) {
        ArrayList<Integer> topList = new ArrayList<Integer>();

        if(root == null){
            return topList;
        }

        Queue<Plot> queue = new LinkedList<Plot>();
        queue.offer(new Plot(root, 0));

        TreeMap<Integer, Integer> map = new TreeMap<>();

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i = 0; i < size; i++){
                Plot plot = queue.poll();
                TreeNode node = plot.node;
                Integer level = plot.level;

                if(node.left != null){
                    queue.offer(new Plot(node.left, level + 1));
                }

                if(node.right != null){
                    queue.offer(new Plot(node.right, level + 1));
                }

                map.put(level, node.val);
            }
        }

        topList.addAll(map.values());

        return topList;
    }

    private static ArrayList<Integer> rightSideView_DFS(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        rightSideView_DFS(root, 0, list);
        return list;
    }

    private static void rightSideView_DFS(TreeNode node, Integer level, ArrayList<Integer> list) {
        if(node == null){
            return;
        }

        if(level == list.size()){
            list.add(node.val);
        }

        rightSideView_DFS(node.right, level + 1, list);
        rightSideView_DFS(node.left, level + 1, list);
    }

}
