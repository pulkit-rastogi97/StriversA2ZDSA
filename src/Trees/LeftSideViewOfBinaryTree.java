package Trees;

import utilities.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class LeftSideViewOfBinaryTree {

    static class Plot{
        TreeNode node;
        Integer level;

        public Plot(TreeNode node, Integer level){
            this.node = node;
            this.level = level;
        }
    }

    static ArrayList<Integer> leftSideView_BFS(TreeNode root) {
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

                map.putIfAbsent(level, node.val);
            }
        }

        topList.addAll(map.values());

        return topList;
    }

    static ArrayList<Integer> leftView_DFS(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        leftView_DFS(root, 0, list);
        return  list;
    }

    private static void leftView_DFS(TreeNode node, Integer level, ArrayList<Integer> list){
        if(node == null){
            return;
        }

        //If current node is at new level, then add to list
        if(list.size() == level){
            list.add(node.val);
        }

        leftView_DFS(node.left, level + 1, list);
        leftView_DFS(node.right, level + 1, list);
    }
}
